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
		// LogFileOperateInterf 文件日志操作接口
		// LogFileOperateImpl   文件日志操作实现 (adaptee 被适配的对象)
		LogFileOperateInterf logFileOpI = new LogFileOperateImpl();
		
		// 创建新版的操作日志的接口对象 target
		// LogDBOperateInterf 数据库日志操作接口
		// LogDBAdpFileAdapter 数据库日志操作适配文件日志操作类
		LogDBOperateInterf logDBOpI = new LogDBAdpFileAdapter(logFileOpI);
		
		// 保存日志文件，使用的是LogDBOperateInterf接口方法
		// LogDBOpI 数据库日志操作类，又适配了文件日志操作类，所以具有两种功能
		// LogDBAdpFileAdapter 中没有insertLog()， 所以调用父类LogDBOpDefaultAdapter中的insertLog()。
		logDBOpI.insertLog(log);
		
		// 读取日志文件的内容
		// LogDBAdpFileAdapter 中有selectAllLog()， 调用了文件日志的操作类
		List<LogModel> allLog = logDBOpI.selectAllLog();
		System.out.println("allLog="+allLog);
	}
}
