package com.wowxhycoming.transactionDistributed.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wowxhycoming.commonBean.User;
import com.wowxhycoming.transactionDistributed.repository.UserRepositoryImpl1;
import com.wowxhycoming.transactionDistributed.repository.UserRepositoryImpl2;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepositoryImpl1 userRepositoryImpl1;
	@Autowired
	private UserRepositoryImpl2 userRepositoryImpl2;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public int insert(User user){
		
		System.out.println("UserServiceImpl");
		
		int ret1 = userRepositoryImpl1.insert(user);
		
		int ret2 = userRepositoryImpl2.insert(user);
		
		System.out.println("ret1=" + ret1 + "  |  ret2=" + ret2);
		
		return ret1 + ret2;
	}
}
