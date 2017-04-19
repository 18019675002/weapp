package com.weapp.study.javabase.abstractandinterface;
/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年4月18日 下午11:37:59
 * @version 1.0
 * @since  
 */
public class SaloonCar extends AbsCar implements Window, Door {

	private String carName;
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}

	public void openDoor() {
		// TODO Auto-generated method stub

	}

	public void closeDoor() {
		// TODO Auto-generated method stub

	}

	public void upWindow() {
		// TODO Auto-generated method stub

	}

	public void downWindow() {
		// TODO Auto-generated method stub

	}

	@Override
	public void showSpeed() {
		// TODO Auto-generated method stub
		System.out.println("最高时速：380km/h");
	}

	public void showWeight(){
		System.out.println("车身重量：" + super.weight);
	}
	
	public void showName(){
		System.out.println("车名："+ carName);
	}
}
