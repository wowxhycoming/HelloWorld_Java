package com.wowxhycoming.designPattern._4adapter.example4_multi;

import java.util.List;

// 适配多个adaptee 就要实现多个接口，成为所有adaptee的类型
public class LogMultiAdapter implements LogDBOperateInterf, LogFileOperateInterf {
	
	// 持有日志文件操作
	LogFileOperateInterf logFileOpI;
	
	// 持有日志DB操作
	LogDBOperateInterf logDBOpI;

	/**
	 * 多种适配器构造方法
	 * @param logFileOpImpl
	 * @param logDBOpImpl
	 */
	public LogMultiAdapter(LogFileOperateInterf logFileOpImpl,
			LogDBOperateInterf logDBOpImpl) {
		
		// 通过构造方法初始化adaptee
		logFileOpI = logFileOpImpl;
		logDBOpI = logDBOpImpl;
	}

	@Override
	public List<LogModel> readLogFile() {
		// 调用已有的日志文件操作
		List<LogModel> list = logFileOpI.readLogFile();
		// 追加已有的数据库日志
		list.addAll(logDBOpI.selectAllLog());
		return list;
	}

	@Override
	public void writeLogFile(List<LogModel> list) {
		// 调用已有的日志文件操作
		logFileOpI.writeLogFile(list);
		// 增加已有的日志DB操作
		logDBOpI.insertLog(list.get(0));
	}

	@Override
	public void insertLog(LogModel lm) {
		// 调用已有的日志DB操作
		logDBOpI.insertLog(lm);
		// 增加以后的日志文件操作
		logFileOpI.writeLogFile(this.readLogFile());
		
	}

	@Override
	public void updateLog(LogModel lm) {
		logDBOpI.updateLog(lm);
		
		logFileOpI.writeLogFile(this.readLogFile());
		
	}

	@Override
	public void deleteLog(LogModel lm) {
		logDBOpI.deleteLog(lm);
		
		logFileOpI.writeLogFile(this.readLogFile());
	}

	/**
	 * 返回数据库 和 文件 日志拼接集合
	 */
	@Override
	public List<LogModel> selectAllLog() {
		List<LogModel> list = logDBOpI.selectAllLog();
		list.addAll(logFileOpI.readLogFile());
		return list;
	}

}
