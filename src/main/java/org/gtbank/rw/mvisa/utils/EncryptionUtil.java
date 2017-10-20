package org.gtbank.rw.mvisa.utils;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.JWEObject;
import com.nimbusds.jose.Payload;
import com.nimbusds.jose.crypto.AESDecrypter;
import com.nimbusds.jose.crypto.AESEncrypter;

public class EncryptionUtil {
	private static final String ENCRYPTION_METHOD = "A256GCM";
	private static final String SYMMETRIC_ALGO = "A256GCMKW";
	public static final Logger LOGGER = LoggerFactory.getLogger(EncryptionUtil.class);
	private static final Map<String, String> KEYID_MAP = new HashMap<>();
	private EncryptionUtil() {
	}
	static {/*
	 * Populate below map with KeyID and Shared secret shared by VISA product team
	 */
		KEYID_MAP.put("dfsfwefr324r4324fdfwewfwe", "7o#$rlf{@gXI{YKwsYAhGwB/uljVkUk1qrcIQGM$");
		KEYID_MAP.put("fca58013-dd43-3e35-2a49-15ca1b02e400", "8o#$rlf{@gXI{YKwsYAhGwB/uljVkUk1qrcIQGM$");
	}
	/**
	 * Decrypts encrypted text using shared secret shared by VISA
	 * first get the key ID from header and then get shared secret
	 * from DB or pre-populated map.
	 * @param encrypted text
	 * @return plain text text
	 */
	public static String decryptJWE(String jweString) {
		try {
			// Parse into JWE object again...
			JWEObject jweObject = JWEObject.parse(jweString);
			String sharedSecret = getMySharedSecret(jweObject.getHeader().getKeyID());
			jweObject.decrypt(new AESDecrypter(getKeyBytes(sharedSecret)));
			// Get the plain text
			Payload payload = jweObject.getPayload();
			return payload.toString();
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		return jweString;
	}
	private static String getMySharedSecret(String keyID) {
		return KEYID_MAP.get(keyID);
	}
	/**
	 * Create a Encrypted string using plain text , key ID & shared secret.
	 * @param plain text
	 * @param secret
	 * @return Encrypted text
	 */
	public static String createJWE(String payloadStr, String keyID) {
		try {
			// Create the header
			JWEHeader header = new JWEHeader(JWEAlgorithm.parse(SYMMETRIC_ALGO),
					EncryptionMethod.parse(ENCRYPTION_METHOD), null, null, null, null, null, null, null, null, null,
					keyID, null, null, null, null, null, 0, null, null, null, null);
			// Set the plain text
			Payload payload = new Payload(payloadStr);
			// Create the JWE object and encrypt it
			JWEObject jweObject = new JWEObject(header, payload);
			jweObject.encrypt(new AESEncrypter(getKeyBytes(getMySharedSecret(keyID))));
			// Serialise to compact JOSE form...
			return jweObject.serialize();
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		return payloadStr;
	}
	/**
	 * Generate a 256 bit key based on shared secret to be used with AES algorithm.
	 * @param secret
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static byte[] getKeyBytes(String sharedSecret) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(sharedSecret.getBytes(Charset.forName("UTF-8")));
		return md.digest();
	}
	public static void main(String[] args) {
		// Encrypted value from JSON request
		String encryptedValue =
				"eyJhbGciOiJBMjU2R0NNS1ciLCJpdiI6IjVIXzZBSmcxWGRaa2JMOVQiLCJ0YWciOiJHamQxbmJNVEZ0bHhHeDg1dHU2YUdBIiwiZW5jIjoiQTI1NkdDTSIsInR5cCI6IkpPU0UiLCJraWQiOiJkZnNmd2VmcjMyNHI0MzI0ZmRmd2V3ZndlIiwiY2hhbm5lbFNlY3VyaXR5Q29udGV4dCI6IlNIQVJFRF9TRUNSRVQiLCJpYXQiOiIxNDcwNjYwMDI2In0.D-Yc2LwJf0rVFbudh7K2ebn-qOT9gqkea9H_HyPgTIk.UcrMuoaHQIaUz7mh.XaZKzf9K4LL6PPAL8PFJ7w.5n-h2ZVe1j7IZ1JAgaxhNQ";
		LOGGER.info("Find decrypted Value ... " + decryptJWE(encryptedValue));
		// Encryption Test
		String testPan = createJWE("Test PAN", "fca58013-dd43-3e35-2a49-15ca1b02e400");
		LOGGER.info("Find encrypted Value ... " + testPan);
		// Decrypt Test PAN
		String decryptedPAN = decryptJWE(testPan);
		LOGGER.info("Find decrypted Value ... " + decryptedPAN);
	}
}
