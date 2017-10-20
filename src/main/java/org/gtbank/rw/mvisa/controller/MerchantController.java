package org.gtbank.rw.mvisa.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.gtbank.rw.mvisa.domain.Merchant;
import org.gtbank.rw.mvisa.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MerchantController {

	@Autowired
	private MerchantService merchantService;

	@RequestMapping(value = "/createMerchant", method = RequestMethod.GET)
	public String createMerchant(Map<String, Object> map) {
		map.put("userType", "merchant");
		return "createMerchant";
	}

	@RequestMapping(value = "/createMerchant", method = RequestMethod.POST)
	public ModelAndView saveMerchant(@ModelAttribute("merchant") Merchant merchant,
			BindingResult result, HttpServletRequest request, HttpServletResponse response) {

		merchantService.saveMerchant(merchant);
		return new ModelAndView("/createMerchant", "message", "Merchant created.");
	}

	@RequestMapping("/manageMerchants")
	public String listMerchants(Map<String, Object> map) {
		map.put("merchantList", merchantService.listMerchants());

		return "manageMerchants";
	}

	@RequestMapping("/deleteMerchant/{merchantId}")
	public String removeMerchant(@PathVariable("merchantId") int merchantId) {
		merchantService.deleteMerchant(merchantId);
		return "redirect:/manageMerchants";
	}

}
