package com.wowxhycoming.designPattern._3Facade.example2;

public class FacadeFactory {
	
	private FacadeFactory(){
		
	}
	
	// 这里用简单工厂为例子，提供给客户端一个获取facade的途径
	public static FacadeApi createFacadeApi(){
		return new Facade();
	}
}
