package com.weapp.study.javabase;
/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年4月18日 下午10:08:39
 * @version 1.0
 * @since  
 */
public class ParentObj {
	
	private String name;
	private String age;
	
	public void say(){
		System.out.println("我是 父类say方法");
		
	}
	
	public void showInfo(){
		System.out.println("我是父类showInfo方法");
	}
	
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
}
