package com.wowxhycoming.transactionSingle.repository;

import com.wowxhycoming.commonBean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SingleTransactionRepository {
	
	@Autowired
	@Qualifier("singleJdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	public int insert(User user) {
		return jdbcTemplate.update("insert into test_user1 values ('"+user.getName()+"',"+user.getAge()+")");
	}

}
