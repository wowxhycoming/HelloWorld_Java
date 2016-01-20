package com.wowxhycoming.transactionDistributed.repository;

import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import com.wowxhycoming.commonBean.User;

@Repository
public class UserRepositoryImpl2 implements UserRepository {
	
	@Autowired
	@Qualifier("oracleXAJdbcTemplate2")
	private JdbcTemplate jdbcTemplate;
	
	public int insert(final User user){
		
		System.out.println(jdbcTemplate);
		int ret;

		ret = jdbcTemplate.update("insert into test_user2 values (?, ?)",
				new PreparedStatementSetter() {
					@Override
					public void setValues(PreparedStatement pstmt) throws SQLException {
						pstmt.setObject(1, user.getName());
						pstmt.setObject(2, user.getAge());
					}
				});


//		if(ret ==1 ) throw new RuntimeException();
		return ret;
		
	}

}
