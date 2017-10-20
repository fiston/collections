package org.gtbank.rw.mvisa.service;

import java.util.List;

import org.gtbank.rw.mvisa.domain.Merchant;

public interface MerchantService {
	public void saveMerchant(Merchant merchant);

	public Merchant getMerchant(int merchantId);

	public void updateMerchant();

	public List<Merchant> listMerchants();

	public void deleteMerchant(int merchantId);
}
