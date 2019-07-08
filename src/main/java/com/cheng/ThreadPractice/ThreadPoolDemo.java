package com.cheng.ThreadPractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


//使用线程池方式---》1、Runnable接口
public class ThreadPoolDemo {

	
	public static void main(String[] args) {
		
		//创建线程池对象
		ExecutorService service=Executors.newFixedThreadPool(3);
		//创建Runnable对象实例
		MyRunnable r=new MyRunnable();
		//自己创建线程对象
		//Thread t=new Thread(r);
		//开启线程,调用MyRunnable中的run();
		//t.start();
		
		//从线程池中获取对象，然后调用run()方法
		service.submit(r);
		//再获取个线程对象
		service.submit(r);
		service.submit(r);
		
		//注意：submit方法调用结束后，程序并不终止，而是将线程放回线程池，
		//因为线程池控制了线程的关闭
		
		//关闭线程池
		
		//service.shutdown();
		
		
	}
	
}
