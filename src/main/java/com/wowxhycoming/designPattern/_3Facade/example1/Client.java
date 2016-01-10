package com.wowxhycoming.designPattern._3Facade.example1;

public class Client {
	public static void main(String[] args) {
		
		//不用Facade，需要自己跟多个模块交互
		/*
		AModuleApi a = new AModuleImpl();
		a.testA();
		BModuleApi b = new BModuleImpl();
		b.testB();
		CModuleApi c = new CModuleImpl();
		c.testC();
		
		System.out.println("使用Facade----------------------〉");
		*/
		
		/*
		 *  如果 AModuleImpl 发生了变化（需要传入参数了），那客户端也要跟着变
		 */
		
		/*
		 * 如果用了 facade 模式，只需要调用 facade 即可，无需关心客户端是否发生了变化，都由 facade 内部负责
		 * 并且对于客户端调用子系统内的功能，也无需与子系统中众多的模块交互，只需要与 facade 交互即可
		 * 也实现了与子系统内部模块间的解耦
		 */
		
		
		//使用了Facade
		new Facade().test();
	}
}
