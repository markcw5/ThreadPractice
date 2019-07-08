package com.cheng.ThreadPractice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolDemo3 {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		//1.创建线程池
		ExecutorService threadPool=Executors.newFixedThreadPool(2);
		//2.创建Callable子类对象
		MyCallableAdd c=new MyCallableAdd();
		MyCallableAdd c1=new MyCallableAdd(10,20);
		MyCallableAdd c2=new MyCallableAdd(100,200);
		//3.提交Callable接口子类对象,执行任务
		//3.1结果对象
		Future<Integer> result=threadPool.submit(c);
		//3.2获取结果
		Integer sum=result.get();
		System.out.println("sum="+sum);
		
		
		Future<Integer> result1=threadPool.submit(c1);
		Integer sum1=result1.get();
		System.out.println("sum1="+sum1);
		
		Future<Integer> result2=threadPool.submit(c2);
		Integer sum2=result2.get();
		System.out.println("sum2="+sum2);
		
		
		//4.关闭线程池
		threadPool.shutdown();
		
	}

}
