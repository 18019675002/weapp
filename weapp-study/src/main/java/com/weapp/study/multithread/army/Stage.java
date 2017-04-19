package com.weapp.study.multithread.army;
/** 
 * @Description: 隋唐演义大戏舞台 
 * @author Wangjie
 * @date 创建时间：2017年4月16日 下午10:54:17
 * @version 1.0
 * @since  
 */
public class Stage extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		ArmyRunnable armyTaskOfSuiDynasty = new ArmyRunnable();//隋朝政府军
		ArmyRunnable armTaskOfRevolt = new ArmyRunnable();//农民起义军
		
		//使用Runnable接口创建线程
		Thread armyOfSuiDynasty = new Thread(armyTaskOfSuiDynasty,"隋军");
		Thread armyOfRevolt = new Thread(armyTaskOfSuiDynasty,"起义军");
		//启动线程
		armyOfSuiDynasty.start();
		armyOfRevolt.start();
		
		//舞台线程休眠，大家专心观看军队厮杀
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("双方正愈战愈烈，此时半路杀出个陈咬紧。");
		Thread cheng = new KeyPersonThread();
		cheng.setName("程咬金 ");
		System.out.println("程咬金的理想是结束战乱，使百姓安居乐业。");
		
		//停止军队作战
		//停止线程的方法
		//使用退出标志 可以妥善的结束线程的循环
		armyTaskOfSuiDynasty.keepRunning = false;
		armTaskOfRevolt.keepRunning = false;
		//使用stop()方法容易使线程异常终止，是不可取的方法，在jdk中已经标记为过气的方法。
		//armyOfSuiDynasty.stop();
		//armyOfRevolt.stop();
		try {
			Thread.sleep(2000);
			Thread.interrupted();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cheng.start();
		//try {
			//join方法：会使得所有其他线程都要等待当前线程执行完毕后才继续向下执行
			//cheng.join();
		//} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
	}

	public static void main(String[] args) {
		new Stage().start();
	}
	
	
	
}
