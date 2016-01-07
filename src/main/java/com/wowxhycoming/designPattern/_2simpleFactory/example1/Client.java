package com.wowxhycoming.designPattern._2simpleFactory.example1;

/**
 * 客户端，使用Api接口
 */
public class Client {
	public static void main(String[] args) {
		// 通过简单工厂来获取接口对象
		// 1. 客户端必须知道简单工厂暴露的方法中每个参数的含义
		// 2. 或者简单工厂根据运行时参数觉得返回哪种实现，这样客户端就可以无参数调用简单工厂了
		Api api = Factory.createApi(1);
		
		
		api.operation("正在使用简单工厂");
	}
}