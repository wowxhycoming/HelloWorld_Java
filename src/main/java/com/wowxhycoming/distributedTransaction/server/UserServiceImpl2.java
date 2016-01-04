package com.wowxhycoming.distributedTransaction.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wowxhycoming.distributedTransaction.controller.User;
import com.wowxhycoming.distributedTransaction.repository.UserRepository;

@Service
public class UserServiceImpl2 implements UserService {
	
	@Autowired
	@Qualifier("userRepositoryImpl2")
	private UserRepository userRepository;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public int insert(User user){
		
		System.out.println("UserServiceImpl");
		
		userRepository.insert(user);
		
		return 1;
	}
}
