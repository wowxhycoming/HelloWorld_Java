package com.wowxhycoming.designPattern._2simpleFactory.example1;

/**
 * 接口的具体实现对象B 
 */
public class ImplB implements Api{
	public void operation(String s) {
		//实现功能的代码
		System.out.println("ImplB s=="+s);
	}
}