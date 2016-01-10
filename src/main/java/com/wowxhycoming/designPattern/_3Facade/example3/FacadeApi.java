package com.wowxhycoming.designPattern._3Facade.example3;

public interface FacadeApi {
	/*
	 * facade 接口在对外暴露方法的时候，可以只暴露a1 b1 c1 和一个组合方法，
	 * 并不暴露只提供给子系统内部使用方法
	 */
	public void a1();
	public void b1();
	public void c1();
	
	public void test();
}
