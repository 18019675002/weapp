package com.weapp.study.multithread;
/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年4月12日 下午10:44:35
 * @version 1.0
 * @since  
 */
public class Actress implements Runnable {

	@SuppressWarnings("static-access")
	public void run() {
		// TODO Auto-generated method stub
		
		int count = 0;
		while(count<20){
			System.out.println(Thread.currentThread().getName()+" 跳跃" + ++count + "次");
			//Thread.yield();
			if(count%5 == 0){
				try {
					
					Thread.sleep(2000);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
