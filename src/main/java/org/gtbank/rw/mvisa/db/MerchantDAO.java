package org.gtbank.rw.mvisa.db;

import java.util.List;

import org.gtbank.rw.mvisa.domain.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchantDAO  extends JpaRepository<Merchant,Integer> {

}
