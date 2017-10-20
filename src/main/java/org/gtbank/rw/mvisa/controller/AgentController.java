package org.gtbank.rw.mvisa.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.gtbank.rw.mvisa.domain.Agent;
import org.gtbank.rw.mvisa.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AgentController {

	@Autowired
	private AgentService agentService;

	@RequestMapping(value = "/createAgent", method = RequestMethod.GET)
	public String createAgent(Map<String, Object> map) {
		map.put("userType", "agent");
		return "createAgent";
	}

	@RequestMapping(value = "/createAgent", method = RequestMethod.POST)
	public ModelAndView saveAgent(@ModelAttribute("agent") Agent agent,
			BindingResult result, HttpServletRequest request, HttpServletResponse response) {

		agentService.saveAgent(agent);
		return new ModelAndView("/createAgent", "message", "Agent created.");
	}

	@RequestMapping("/manageAgents")
	public String listAgents(Map<String, Object> map) {
		map.put("agentList", agentService.listAgents());

		return "manageAgents";
	}

	@RequestMapping("/deleteAgent/{agentId}")
	public String removeAgent(@PathVariable("agentId") int agentId) {
		agentService.deleteAgent(agentId);
		return "redirect:/manageAgents";
	}

}
