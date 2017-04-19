package com.weapp.study.javabase.abstractandinterface;
/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年4月18日 下午11:44:49
 * @version 1.0
 * @since  
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SaloonCar saloonCar = new SaloonCar();
		saloonCar.setWeight("1800kg");
		saloonCar.setCarName("BMW M3");
		saloonCar.showName();
		saloonCar.showWeight();
		saloonCar.showSpeed();
		saloonCar.showAbstractInfo();
	}

}
