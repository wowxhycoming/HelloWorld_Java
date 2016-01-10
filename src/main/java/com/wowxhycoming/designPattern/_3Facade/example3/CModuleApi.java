package com.wowxhycoming.designPattern._3Facade.example3;

public interface CModuleApi {
	//对子系统外部
	public void c1();
	
	//子系统内部使用
	public void c2();
	public void c3();
}
