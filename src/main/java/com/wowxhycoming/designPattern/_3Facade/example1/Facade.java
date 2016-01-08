package com.wowxhycoming.designPattern._3Facade.example1;

/**
 * 外观对象
 */
public class Facade {
	/**
	 * 示意方法，满足客户需要的功能
	 */
	public void test(){
		//在内部实现的时候，可能会调用到内部的多个模块
		AModuleApi a = new AModuleImpl(); // new AModuleImpl(); 部分， 可以使用简单工厂实现
		a.testA();
		BModuleApi b = new BModuleImpl();
		b.testB();
		CModuleApi c = new CModuleImpl();
		c.testC();
	}
}
