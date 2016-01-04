package com.wowxhycoming.distributedTransaction.repository;

import org.springframework.stereotype.Repository;

import com.wowxhycoming.distributedTransaction.controller.User;

public interface UserRepository {
	
	public int insert(User user);

}
