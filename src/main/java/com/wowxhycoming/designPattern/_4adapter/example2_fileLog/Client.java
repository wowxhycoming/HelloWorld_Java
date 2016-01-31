package com.wowxhycoming.designPattern._4adapter.example2_fileLog;

import java.util.ArrayList;
import java.util.List;

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

		// 创建操作日志文件的对象
		LogFileOperateInterf logFileOpI = new LogFileOperateImpl(); 
		
		// 保存日志文件
		logFileOpI.writeLogFile(list);
		
		// 读取日志文件的内容
		List<LogModel> readLog = logFileOpI.readLogFile();
		System.out.println("readLog="+readLog);
		
//		LogDbOperateApi api2 = null;
	}
}
