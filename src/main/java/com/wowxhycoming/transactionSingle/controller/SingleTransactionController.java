package com.wowxhycoming.transactionSingle.controller;

import com.wowxhycoming.commonBean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wowxhycoming.transactionSingle.service.SingleTransactionService;

@Controller
@RequestMapping("/singleTransaction")
public class SingleTransactionController {
	
	@Autowired
	private SingleTransactionService singleTransactionService;

	
	@RequestMapping(value="/insert",method=RequestMethod.GET)
	public String gotoInsert(Model model) {
		model.addAttribute(new User());
		return "user/insert";
	}
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insert(User user) {
		singleTransactionService.insert(user);
		return "user/list";
	}
}
