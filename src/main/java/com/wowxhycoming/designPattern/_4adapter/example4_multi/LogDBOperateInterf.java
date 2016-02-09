package com.wowxhycoming.designPattern._4adapter.example4_multi;

import java.util.*;

/**
 * 定义操作日志的应用接口，为了示例的简单，
 * 只是简单的定义了增删改查的方法
 */
public interface LogDBOperateInterf {
	/**
	 * 新增日志
	 * @param lm 需要新增的日志对象
	 */
	public void insertLog(LogModel lm);

	/**
	 * 修改日志
	 * @param lm 需要修改的日志对象
	 */
	public void updateLog(LogModel lm);

	/**
	 * 删除日志
	 * @param lm 需要删除的日志对象
	 */
	public void deleteLog(LogModel lm);

	/**
	 * 获取所有的日志
	 * @return 所有的日志对象
	 */
	public List<LogModel> selectAllLog();
}
