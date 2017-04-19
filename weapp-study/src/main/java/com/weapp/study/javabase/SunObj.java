package com.weapp.study.javabase;

import java.lang.reflect.Constructor;

/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年4月18日 下午10:19:35
 * @version 1.0
 * @since  
 */
public class SunObj extends ParentObj {

	public SunObj(){
		
	}
	public SunObj(String address){
		this.address = address;
	}
	private String address;
	
	

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("我是子类showInfo方法");
	}

	public void play(){
		System.out.println("我是子类特有的play方法");
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

	
	
	
}
