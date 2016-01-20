package com.wowxhycoming.transactionSingle.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SingleTransactionRepository {
	
	@Autowired
	@Qualifier("singleJdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	public int insert() {
		return jdbcTemplate.update("insert into user1 values (1,'tom')");
	}

}
