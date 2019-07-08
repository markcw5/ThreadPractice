package com.cheng.ThreadPractice;

public class SaleTicket {
	
	public static void main(String[] args) {
		
		//创建票对象
		Ticket ticket=new Ticket();
		
		//创建三个窗口
		Thread t1=new Thread(ticket, "窗口1");
		Thread t2=new Thread(ticket, "窗口2");
		Thread t3=new Thread(ticket, "窗口3");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
