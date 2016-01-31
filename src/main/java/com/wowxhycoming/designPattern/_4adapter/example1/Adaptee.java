package com.wowxhycoming.designPattern._4adapter.example1;

/**
 * 已经存在的接口，这个接口需要被适配
 */
public class Adaptee {

	/**
	 * 示意方法，原本已经存在，已经实现的方法
	 */
	public void specificRequest() {
		// 具体的功能处理
		System.out.println("原有实现");
	}
}

