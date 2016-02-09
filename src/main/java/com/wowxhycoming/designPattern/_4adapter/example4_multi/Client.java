package com.wowxhycoming.designPattern._4adapter.example4_multi;

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

		// 创建操作日志文件的对象
		LogFileOperateInterf logFileOpI = new LogFileOperateImpl();
		// 创建操作日志DB的对象
		LogDBOperateInterf logDBOpI = new LogDBOperateImpl();
		
		// 创建多重适配器，可以是所有adaptee接口的类型
		LogMultiAdapter logMultiAdapter = new LogMultiAdapter(logFileOpI, logDBOpI);
		// 只能调用 LogFileOperateInterf 定义的方法 
		LogFileOperateInterf logMultiAdapter1 = logMultiAdapter;
		// 只能调用 LogDBOperateInterf 定义的方法
		LogDBOperateInterf logMultiAdapter2 = logMultiAdapter;
		
		logMultiAdapter1.writeLogFile(list);
		System.out.println("========================");
		logMultiAdapter2.insertLog(log);
		
	}
}
