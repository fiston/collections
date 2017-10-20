package org.gtbank.rw.mvisa.db;

import java.util.List;

import org.gtbank.rw.mvisa.domain.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentDAO extends JpaRepository<Agent,Integer> {
}
