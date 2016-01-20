package com.wowxhycoming.transactionDistributed.repository;

import org.springframework.stereotype.Repository;

import com.wowxhycoming.commonBean.User;

public interface UserRepository {
	
	public int insert(User user);

}
