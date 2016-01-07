package com.wowxhycoming.singleTransaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wowxhycoming.singleTransaction.service.SingleTransactionService;

@Controller
@RequestMapping("/singleTransaction")
public class SingleTransactionController {
	
	@Autowired
	private SingleTransactionService singleTransactionService;

	
	@RequestMapping(value="/insert",method=RequestMethod.GET)
	public String gotoInsert(Model model) {
		
		singleTransactionService.insert();
		
		return "user/user_insert";
	}
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insert() {
		
		System.out.println();
		
		return "user/list";
	}
}
