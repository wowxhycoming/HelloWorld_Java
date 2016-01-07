package com.wowxhycoming.designPattern._2simpleFactory.example1;

/**
 * 工厂类，用来创造Api对象
 */
public class Factory {
	
	/**
	 * 私有化工厂构造方法，方式客户端随意创建工厂（不需要工厂实例）
	 */
	private Factory() {
	
	}
	
	/**
	 * 具体的创造Api对象的方法
	 * @param condition 从外部传入的选择条件
	 * @return 创造好的Api对象
	 */
	public static Api createApi(int condition){
		// 应该根据某些条件去选择究竟创建哪一个具体的实现对象
		// 这些条件可以从外部传入，也可以从其它途径获取
		// 如果只有一个实现，可以省略条件，因为没有选择的必要
		
		// 使用条件
		Api api = null;
		if(condition == 1){
			// 不要将ImplA的实现写到这里
			// 简单工厂应该只负责选择，不负责具体实现；并且如果ImplA中有多个方法，在简单工厂中也是没办法进行的
			api = new ImplA();
		}else if(condition == 2){
			api = new ImplB();
		}
		return api;
	}
	
	// 可以扩展其他创建对象职责的方法
	/*
	public static Api createApi() {
		return null;
	}
	*/
}