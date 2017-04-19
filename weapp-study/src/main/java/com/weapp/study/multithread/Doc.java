package com.weapp.study.multithread;
/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年4月11日 下午11:50:21
 * @version 1.0
 * @since  
 */
public class Doc {
	/*
	
	#进程  
		程序(任务)的执行过程  它具有动态性  只有双击QQ让QQ运行时 才会有QQ的进程
		进程是资源的载体也是线程的载体   （持有资源（共享内存，共享文件），线程 ）
	
	#线程  
		在qq软件执行过程中，文字聊天、收发文件 等等 都是线程
	
	一个班级看着是进程的话 ，那么班级之中的学生就相当于一个个线程
	
	#线程与进程的关系
		线程是系统中的最小单元
		同一个进程中有多个线程
		线程共享进程的资源
	
	#线程的工作方式（交互）： 互斥、同步
	
	#学习要点
		Java对 线程的支持
		线程的创建和启动
		线程常用方法
		如何正确停止线程
	
	Java对线程的支持注意体现在 java.lang包中的 Thread类 和 Runnable接口
		两者里面都有一个共通的方法 public void run(),
		这个方法为我们提供了线程实际工作执行的代码。
		
		
	#Thread常用方法
		类别				方法签名											简介
		线程的创建		Thread()
						Thread(String name)
						Thread(Runnable target)
						Thread(Runnable target, String name)
		线程的方法		void start()									启动线程
						static void sleep(long millis)					线程休眠
						static void sleep(long millis, int nanos)		(同上)
						void join()										使其他线程等待当前线程终止
						void join(long millis)							(同上)
						void join(long millis, int nanos)				(同上)
						static void yield()								使当前运行的线程释放处理器资源，并重新去竞争处理器资源
		获取线程引用		static Thread currentThread()					返回当前运行的线程的引用
	
	
	
	
	Thread.interrupted() 可以用于停止线程吗？
	Interrupted 
	初衷并不是用于停止线程
	
	争用条件 Race Condition
	当多个线程同时共享访问同一数据（内存区域）时，每个线程都会尝试操作该数据，从而导致数据被破坏(corrupted)，这种现象称为争用条件。
	
	线程的交互方式：互斥与同步
	互斥：同一时间只能有一条线程对我们的关键数据或是临界区进行操作
	使用线程锁的方式  （使用锁会有资源的开销）
	
	互斥的实现  ： synchronized 块
	synchronized(lockObj){
		//while循环，保证条件不满足时任务都会被阻挡
		//而不是继续竞争CPU资源
		while(a < b){
			lockObj.wait();
		}
	}
	
	
	
	
	同步：线程之间的一种通信机制，一条线程通过某种方式告诉其他的线程这件事我做完了该轮到你了
	
	同步的实现： wait()/notify()/notifyAll() （他们都是属于Object对象的方法）
	//唤醒所有在lockObj对象上等待的线程
	locakObj.notifyAll();
	
	
	
	要点回顾
	1、如何创建线程及线程的基本操作
	2、可见性及volatile关键字
	3、争用条件
	4、线程的互斥synchronized
	5、线程的同步 wait()/notify()/ontifyAll()
	
	扩展建议
	如何扩展Java并发的知识
	Java Memory Mode 
		JMM描述了Java线程是如何通过内存进行交互的
		happens-before 原则
		synchronized, volatile & final 实现happens-before
	Locks & Codition
		Java锁机制和等待条件的高层实现
		java.util.concurrent.locks
	线程安全性
		原子性与可见性
		java.util.concurrent.atomic  来避免原子性的问题
		synchronized & volatile
		DeadLocks
	多线程编程常用的交互模型
		producer-Consumer 生产者消费者模型
		Read-Write Lock 读写锁模型
		Future 模型
		Worker Thread 模型
	Java5中引入的一些并发编程工具		java.util.concurrent
		线程池 ExecutorService
		Callable & Future
		BlockingQueue
		
	推荐阅读 
		CORE JAVA Volume I-Fundamentals Java核心技术（卷1）
		JAVA CONCURRENCY IN PRACTICE   (多线程圣经)
		Java并发编程的艺术
		Java多线程编程核心技术
	
	
	
	
	
	
	
	
	
	
	
	
	
	*/
}
