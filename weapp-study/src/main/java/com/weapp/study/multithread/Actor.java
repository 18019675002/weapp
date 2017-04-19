package com.weapp.study.multithread;
/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年4月12日 下午10:06:31
 * @version 1.0
 * @since  
 */
public class Actor extends Thread {

	@SuppressWarnings("static-access")
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		int count = 0;
		boolean keepRunning = true;
		while(keepRunning){
			System.out.println(getName()+" 吼叫" + ++count + "声");
			//Thread.currentThread().yield();
			if(count%5 == 0){
				try {
					
					Thread.sleep(2000);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(count>=20){
				keepRunning = false;
			}
		}
		super.run();
	}
	
	
}

