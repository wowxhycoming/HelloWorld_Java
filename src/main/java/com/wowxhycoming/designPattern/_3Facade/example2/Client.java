package com.wowxhycoming.designPattern._3Facade.example2;

public class Client {
	
	public static void main(String[] args) {
		// 持有facade接口，调用简单工厂（这里用简单工厂，还有很多其他方式）获取facade
		FacadeApi api = FacadeFactory.createFacadeApi();
		
		api.generate();
	}
	
}