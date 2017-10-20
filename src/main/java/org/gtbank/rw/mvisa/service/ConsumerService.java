package org.gtbank.rw.mvisa.service;

import java.util.List;

import org.gtbank.rw.mvisa.domain.Consumer;

public interface ConsumerService {

	public void saveConsumer(Consumer consumer);

	public Consumer getConsumer(int consumerId);

	public void updateConsumer();

	public List<Consumer> listConsumers();

	public void deleteConsumer(int consumerId);
}
