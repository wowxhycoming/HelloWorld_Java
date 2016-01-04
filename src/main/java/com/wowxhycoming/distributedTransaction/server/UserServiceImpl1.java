package com.wowxhycoming.distributedTransaction.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wowxhycoming.distributedTransaction.controller.User;
import com.wowxhycoming.distributedTransaction.repository.UserRepository;

@Service
public class UserServiceImpl1 implements UserService {
	
	@Autowired
	@Qualifier("userRepositoryImpl1")
	private UserRepository userRepository;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public int insert(User user){

		System.out.println(userRepository);
		
		int ret = 0;
		ret = userRepository.insert(user);
		
		return ret;
	}
}
