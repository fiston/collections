package org.gtbank.rw.mvisa.db;

import java.util.List;

import org.gtbank.rw.mvisa.domain.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsumerDAO  extends JpaRepository<Consumer, Integer> {

}
