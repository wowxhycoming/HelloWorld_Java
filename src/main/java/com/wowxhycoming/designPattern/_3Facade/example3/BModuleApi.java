package com.wowxhycoming.designPattern._3Facade.example3;

public interface BModuleApi {
	//对子系统外部
	public void b1();
	
	//子系统内部使用
	public void b2();
	public void b3();
}
