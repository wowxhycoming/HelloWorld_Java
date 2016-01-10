package com.wowxhycoming.designPattern._3Facade.example2;

/**
 * 代码生成子系统的外观对象
 */
public class Facade implements FacadeApi{

	/**
	 * 客户端需要的，一个简单的调用代码生成的功能
	 */
	public  void generate(){
		new Presentation().generate();
		new Business().generate();
		// 内部模块发生变化，并不会影响客户端
		new DAO(2).generate();
	}
}
