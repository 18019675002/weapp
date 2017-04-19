package com.weapp.study.multithread.army;
/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年4月16日 下午11:12:45
 * @version 1.0
 * @since  
 */
public class KeyPersonThread extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"开始了战斗！");
	
		for(int i = 0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+"左突右杀，攻击隋军");
		}
	
		System.out.println(Thread.currentThread().getName()+"结束了战斗！");
	
	}
	
}
