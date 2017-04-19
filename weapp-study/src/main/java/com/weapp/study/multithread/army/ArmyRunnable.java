package com.weapp.study.multithread.army;
/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年4月16日 下午10:41:24
 * @version 1.0
 * @since  
 */
public class ArmyRunnable implements Runnable {
	//变量声明为volatile 保证了线程可以正确的读取其他线程写入的值
	//可见性 可以参考Java的JMM， happens-before原则
	volatile boolean keepRunning = true;

	public void run() {
		while(keepRunning){
			for(int i =0;i<5;i++){
				System.out.println(Thread.currentThread().getName()+"进攻对方["+i+"]");
				Thread.yield();
			}
			
		}
		System.out.println(Thread.currentThread().getName()+"结束了战斗");
		
		
	}

}
