package com.cheng.ThreadPractice;

public class Ticket implements Runnable {
	
	//总票数
	int ticketNum=100;
	
	//定义锁对象
	Object lock=new Object();

	public void run() {
		// 模拟卖票操作
		while(true) {
			
			//同步代码块
			synchronized(lock) {
				
				if(ticketNum>0) {
					//模拟选座操作
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("余票"+ticketNum--+Thread.currentThread().getName()+"正在售票");
					if(ticketNum==0)
						System.out.println("票已售完");
				}
				
			}
			
			
		}
		
	}
	

}
