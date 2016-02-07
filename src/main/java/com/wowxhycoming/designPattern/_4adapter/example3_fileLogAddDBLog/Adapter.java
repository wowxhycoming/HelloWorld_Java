package com.wowxhycoming.designPattern._4adapter.example3_fileLogAddDBLog;

import java.util.List;

/**
 * 适配器对象，把记录日志到文件的功能适配成第二版需要的增删改查的功能
 */
public class Adapter implements LogDBOperateInterf{
	//优先使用对象组合（持有对象），而不是使用对象继承
	
	/**
	 * 持有需要被适配的接口对象
	 */
	private LogFileOperateInterf adaptee;
	
	/**
	 * 构造方法，传入需要被适配的对象
	 * @param adaptee 需要被适配的对象
	 */
	public Adapter(LogFileOperateInterf adaptee) {
		this.adaptee = adaptee;
	}
	
	public void insertLog(LogModel lm) {
		//1：先读取文件的内容
		List<LogModel> list = adaptee.readLogFile();
		//2：加入新的日志对象
		list.add(lm);
		//3：重新写入文件
		adaptee.writeLogFile(list);
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

	public void updateLog(LogModel lm) {
		//1：先读取文件的内容
		List<LogModel> list = adaptee.readLogFile();
		//2：修改相应的日志对象
		for(int i=0;i<list.size();i++){
			if(list.get(i).getLogId().equals(lm.getLogId())){
				list.set(i, lm);
				break;
			}
		}
		//3：重新写入文件
		adaptee.writeLogFile(list);
	}
}
