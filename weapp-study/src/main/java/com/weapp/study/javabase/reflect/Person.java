package com.weapp.study.javabase.reflect;
/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年4月21日 上午12:08:49
 * @version 1.0
 * @since  
 */
public class Person {
	
	private String name;
	
	public void showName(){
		System.out.println("我是Person的实例对象，我的名字叫：" + this.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
