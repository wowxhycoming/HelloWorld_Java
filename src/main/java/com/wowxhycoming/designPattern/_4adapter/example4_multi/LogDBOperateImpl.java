package com.wowxhycoming.designPattern._4adapter.example4_multi;

import java.util.*;

/**
 * 定义操作日志的应用接口，为了示例的简单，
 * 只是简单的定义了增删改查的方法
 */
public class LogDBOperateImpl implements LogDBOperateInterf{

	@Override
	public void insertLog(LogModel lm) {
		System.out.println("LogDBOperateImpl insertLog");
	}

	@Override
	public void updateLog(LogModel lm) {
		System.out.println("LogDBOperateImpl updateLog");
	}

	@Override
	public void deleteLog(LogModel lm) {
		System.out.println("LogDBOperateImpl deleteLog");
	}

	@Override
	public List<LogModel> selectAllLog() {
		System.out.println("LogDBOperateImpl selectAllLog");
		
		List<LogModel> list = new ArrayList<LogModel>();

		LogModel log = null;
		for (int i = 0; i < 5; i++) {
			log = new LogModel();
			String value = String.valueOf(i);
			log.setLogId(value);
			log.setLogContent("LogDBOperateImpl日志内容：" + value);
			log.setOperateTime((new Date()).toString());
			log.setOperateUser("LogDBOperateImpl日志操作人：" + value);
			
			list.add(log);
		}
		
		return list;
	}

	
}
