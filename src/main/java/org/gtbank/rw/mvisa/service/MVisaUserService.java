package org.gtbank.rw.mvisa.service;

import java.util.List;

import org.gtbank.rw.mvisa.domain.MVisaUser;

public interface MVisaUserService {
	public void saveMVisaUser(MVisaUser mVisaUser);

	public MVisaUser getMVisaUser(int mVisaUser);

	public void updateMVisaUser();

	public List<MVisaUser> listMVisaUsers();

	public void deleteMVisaUser(int mVisaUserId);

	public MVisaUser getMVisaUserByAccountNumber(String consumerAccountNumber);
}
