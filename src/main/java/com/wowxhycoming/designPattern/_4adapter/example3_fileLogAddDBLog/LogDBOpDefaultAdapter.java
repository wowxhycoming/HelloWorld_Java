package com.wowxhycoming.designPattern._4adapter.example3_fileLogAddDBLog;

import java.util.List;

public abstract class LogDBOpDefaultAdapter implements LogDBOperateInterf {

	@Override
	public void insertLog(LogModel lm) {
		System.out.println("LogDBOpDefaultAdapter createLog===========");
	}

	@Override
	public void updateLog(LogModel lm) {
		System.out.println("LogDBOpDefaultAdapter updateLog===========");
	}

	@Override
	public void deleteLog(LogModel lm) {
		
	}

	@Override
	public List<LogModel> selectAllLog() {
		return null;
	}

}
