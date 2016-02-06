package com.wowxhycoming.designPattern._4adapter.example3_fileLogAddDBLog;

import java.util.*;

public class Client {
	public static void main(String[] args) {
		
		// 准备日志内容，也就是测试的数据
		LogModel log = new LogModel();
		log.setLogId("001");
		log.setOperateUser("admin");
		log.setOperateTime("2010-03-02 10:08:18");
		log.setLogContent("这是一个测试");
		
		List<LogModel> list = new ArrayList<LogModel>();
		list.add(log);

		// 创建操作日志文件的对象 adaptee
		LogFileOperateInterf logFileOpI = new LogFileOperateImpl();
		
		// 创建新版的操作日志的接口对象 target
		LogDBOperateInterf LogDBOpI = new LogDBAdpFileAdapter(logFileOpI);
		
		// 保存日志文件，使用的是LogDBOperateInterf接口方法
		LogDBOpI.insertLog(log);
		
		// 读取日志文件的内容
		List<LogModel> allLog = LogDBOpI.selectAllLog();
		System.out.println("allLog="+allLog);
	}
}
