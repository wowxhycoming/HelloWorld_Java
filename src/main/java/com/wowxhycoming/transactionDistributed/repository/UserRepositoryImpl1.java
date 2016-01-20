package com.wowxhycoming.transactionDistributed.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.wowxhycoming.commonBean.User;

@Repository
public class UserRepositoryImpl1 implements UserRepository {
	
	@Autowired
	@Qualifier("oracleXAJdbcTemplate1")
	private JdbcTemplate jdbcTemplate;
	
	public int insert(User user){
		
		System.out.println(jdbcTemplate);
		int ret;
		
		ret = jdbcTemplate.update("insert into user1 values (1,'tom')");
		
//		ret = jdbcTemplate2.update("insert into user2 values (2, 2)");
		
		return ret;
		
	}

}
