package com.wowxhycoming.transactionDistributed.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wowxhycoming.commonBean.User;
import com.wowxhycoming.transactionDistributed.service.UserService;
import com.wowxhycoming.transactionDistributed.service.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;

	@RequestMapping(value="/users", method=RequestMethod.GET)
	public String list(Model model) {
		System.out.println("good");
		
		List<User> userList = new ArrayList<User>();
		
		User user = null;
		
		for(int i=0; i<10; i++){
			user = new User();
			user.setAge(i);
			user.setName("" + i);
			
			userList.add(user);
		}
		
		model.addAttribute("users", userList);
		
		return "user/list";
	}
	
	@RequestMapping(value="/insert",method=RequestMethod.GET)
	public String gotoInsert(Model model) {
		
		model.addAttribute(new User());
		
		return "user/user_insert";
	}
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insert(User user) {
		
		System.out.println(user);
		
		int ret = userService.insert(user);
		
		System.out.println(ret);
		
		return "user/list";
	}
}
