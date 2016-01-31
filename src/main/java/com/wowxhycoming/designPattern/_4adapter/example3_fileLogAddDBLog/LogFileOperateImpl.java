package com.wowxhycoming.designPattern._4adapter.example3_fileLogAddDBLog;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 实现对日志文件的操作
 */
public class LogFileOperateImpl implements LogFileOperateInterf{
	
	public  List<LogModel> readLogFile() {
		System.out.println("调用原读文件日志方法：");
		List<LogModel> list = new ArrayList<LogModel>();

		LogModel log = null;
		for (int i = 0; i < 5; i++) {
			log = new LogModel();
			String value = String.valueOf(i);
			log.setLogId(value);
			log.setLogContent("日志内容：" + value);
			log.setOperateTime((new Date()).toString());
			log.setOperateUser("日志操作人：" + value);
			
			list.add(log);
		}
		
		return list;
	}

	public void writeLogFile(List<LogModel> list){
		System.out.println("调用原写文件日志方法：");
		for (int i = 0, size = list.size(); i < size; i++) {
			
			System.out.println(list.get(i).toString());
			
		}
	}
}
