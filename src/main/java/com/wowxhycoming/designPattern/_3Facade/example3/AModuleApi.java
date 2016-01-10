package com.wowxhycoming.designPattern._3Facade.example3;


public interface AModuleApi {
	
	/*
	 * 没有做接口拆分：a1()定义成一个接口，a2()、a3()定义成一个接口。
	 */
	
	//提供给子系统外部使用
	public void a1();
	
	//提供给同一个子系统中，不同的模块使用，比如给B模块，给C模块
	public void a2();
	public void a3();
}
