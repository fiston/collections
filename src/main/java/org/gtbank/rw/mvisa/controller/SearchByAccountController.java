package org.gtbank.rw.mvisa.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.gtbank.rw.mvisa.domain.Agent;
import org.gtbank.rw.mvisa.domain.Consumer;
import org.gtbank.rw.mvisa.domain.MVisaUser;
import org.gtbank.rw.mvisa.domain.Merchant;
import org.gtbank.rw.mvisa.domain.SearchObject;
import org.gtbank.rw.mvisa.utils.MVisaUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchByAccountController {

	@RequestMapping(value = "/searchByAccount", method = RequestMethod.GET)
	public String searchCustomerByAccount(@RequestParam(name = "mVisaUserType") String userType, Model map, HttpServletRequest request) {
		//String userType = request.getParameter("mVisaUserType");
		map.addAttribute("mVisaUserType", userType);
		SearchObject so=new SearchObject();
		so.setAccountType(userType);
		map.addAttribute("searchObject", so);
		return "searchByAccount";
	}

	@RequestMapping(value = "/searchByAccount", method = RequestMethod.POST)
	public String searchCustomer(Model  map, HttpServletRequest request, @ModelAttribute("searchObject") SearchObject searchObject) {


		MVisaUser u = MVisaUtils.getCustomerFromBanks(searchObject.getSearchString()); //211/157858/1/5106/0 "211/184636/1/5107/0"

		String proposedPAN = MVisaUtils.generateNewPAN("450699");
		System.out.println(proposedPAN+" =================================");
		u.setPrimaryAccountNumber(proposedPAN);
		switch(searchObject.getAccountType()) { //
		case "agent" :
			Agent a = new Agent();
			a.setmVisaAgentId(MVisaUtils.generateAgentId(proposedPAN));
			a.setmVisaUser(u);
			System.out.println(a.toString());
			map.addAttribute("agent", a);
			return "createAgent";
		case "merchant" :		
			Merchant m = new Merchant();
			m.setmVisaMerchantId(MVisaUtils.generateMerchantId(proposedPAN));
			m.setmVisaUser(u);
			map.addAttribute("merchant", m);
			return "createMerchant";
		case "consumer" :
			Consumer c = new Consumer();
			c.setmVisaUser(u);
			map.addAttribute("consumer", c);
			return "createConsumer";
		default :
			return "searchByAccount";
		}
	}

}
