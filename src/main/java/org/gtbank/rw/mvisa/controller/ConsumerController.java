package org.gtbank.rw.mvisa.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.gtbank.rw.mvisa.domain.Consumer;
import org.gtbank.rw.mvisa.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConsumerController {

	@Autowired
	private ConsumerService consumerService;

	@RequestMapping(value = "/createConsumer", method = RequestMethod.GET)
	public String createConsumer(Map<String, Object> map) {
		map.put("userType", "consumer");
		return "createConsumer";
	}

	@RequestMapping(value = "/createConsumer", method = RequestMethod.POST)
	public ModelAndView saveConsumer(@ModelAttribute("consumer") Consumer consumer,
			BindingResult result, HttpServletRequest request, HttpServletResponse response) {

		consumerService.saveConsumer(consumer);
		return new ModelAndView("/createConsumer", "message", "Consumer created.");
	}

	@RequestMapping("/manageConsumers")
	public String listConsumers(Map<String, Object> map) {
		map.put("agentList", consumerService.listConsumers());

		return "manageConsumers";
	}

	@RequestMapping("/deleteConsumer/{consumerId}")
	public String removeConsumer(@PathVariable("consumerId") int consumerId) {
		consumerService.deleteConsumer(consumerId);
		return "redirect:/manageConsumers";
	}

}
