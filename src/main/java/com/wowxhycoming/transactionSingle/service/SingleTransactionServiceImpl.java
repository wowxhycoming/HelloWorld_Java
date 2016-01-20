package com.wowxhycoming.transactionSingle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wowxhycoming.transactionSingle.repository.SingleTransactionRepository;

@Service
public class SingleTransactionServiceImpl implements SingleTransactionService {
	
	@Autowired
	private SingleTransactionRepository singleTransactionRepository;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public int insert(){
		
		return singleTransactionRepository.insert();
		
	}
}
