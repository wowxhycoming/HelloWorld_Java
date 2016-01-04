package com.wowxhycoming.distributedTransaction.server;

import org.springframework.stereotype.Service;

import com.wowxhycoming.distributedTransaction.controller.User;

//@Service
public interface UserService {
	
	public int insert(User user);

}
