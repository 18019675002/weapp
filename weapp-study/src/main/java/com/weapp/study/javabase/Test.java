package com.weapp.study.javabase;
/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年4月18日 下午10:29:38
 * @version 1.0
 * @since  
 */
public class Test {
	public static void main(String[] args) {
		//SunObj sObj = new SunObj("中国常州");
		//sObj.showInfo();
		System.out.println("父类引用子类对象");
		ParentObj ps = new SunObj("中国常州");
		ps.showInfo();
		ps.say();
		//ps.play();报错,提示没有找到此方法
		
		System.out.println("子类引用子类对象");
		SunObj s = new SunObj();
		s.showInfo();
		s.play();
	}
}
