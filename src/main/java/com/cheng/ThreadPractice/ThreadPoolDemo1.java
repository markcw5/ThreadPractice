package com.cheng.ThreadPractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//使用线程池方式---》2.Callable接口
public class ThreadPoolDemo1 {

	public static void main(String[] args) {
		//1.创建线程池
		ExecutorService service=Executors.newFixedThreadPool(2);
		//2.创建Callable子类对象
		MyCallable c=new MyCallable();
		//3.提交Callable接口子类对象,执行任务
		service.submit(c);
		service.submit(c);
		service.submit(c);
		
		//4.关闭线程池
		service.shutdown();
		
	}
	

}
