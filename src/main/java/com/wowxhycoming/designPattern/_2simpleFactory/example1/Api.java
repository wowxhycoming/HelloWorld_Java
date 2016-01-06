package com.wowxhycoming.designPattern._2simpleFactory.example1;

/**
 * 接口的定义，该接口可以通过简单工厂来创建
 */
public interface Api {
	/**
	 * 具体的功能方法的定义
	 * @param s 需要的参数
	 */
	public void operation(String s);
}
