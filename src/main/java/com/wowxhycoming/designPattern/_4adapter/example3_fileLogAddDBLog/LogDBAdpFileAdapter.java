package com.wowxhycoming.designPattern._4adapter.example3_fileLogAddDBLog;

import java.util.List;

public class LogDBAdpFileAdapter extends LogDBOpDefaultAdapter {

	/**
	 * 持有需要被适配的接口对象
	 */
	private LogFileOperateInterf adaptee;
	
	/**
	 * 构造方法，传入需要被适配的对象
	 * @param adaptee 需要被适配的对象
	 */
	public LogDBAdpFileAdapter(LogFileOperateInterf adaptee) {
		this.adaptee = adaptee;
	}

	public List<LogModel> selectAllLog() {
		return adaptee.readLogFile();
	}

	public void deleteLog(LogModel lm) {
		//1：先读取文件的内容
		List<LogModel> list = adaptee.readLogFile();
		//2：删除相应的日志对象
		list.remove(lm);
		//3：重新写入文件
		adaptee.writeLogFile(list);
	}

	
}
