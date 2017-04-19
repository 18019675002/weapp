package com.weapp.study.javabase.abstractandinterface;
/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年4月18日 下午11:29:38
 * @version 1.0
 * @since  
 */
public abstract class AbsCar {
	protected String weight;
	
	public abstract void showSpeed();

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}
	public void showAbstractInfo(){
		System.out.println("我是抽象类的方法" + "showAbstractInfo()");
	}
}
