package com.cheng.ThreadPractice;

public class MyRunnable implements Runnable {

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("我要一个教练");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("教练来了"+Thread.currentThread().getName());
		
		
	}
	
	

}
