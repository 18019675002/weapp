package com.weapp.study.multithread;
/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年4月12日 下午10:40:27
 * @version 1.0
 * @since  
 */
public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread actor = new Actor();
		actor.setName("Mr.Thread");
		Thread actress = new Thread(new Actress(), "Ms.Tunnable");
		
		actor.start();
		actress.start();
	}

}
