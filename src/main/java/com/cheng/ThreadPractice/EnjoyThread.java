package com.cheng.ThreadPractice;

public class EnjoyThread extends Thread {
	
	EnjoyThread(String name){
		super(name);
	}
	
	//复写run方法
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println(Thread.currentThread().getName()+i);
		}
	}
	

}
