package com.cheng.ThreadPractice;

import java.util.concurrent.Callable;

public class MyCallableAdd implements Callable {

	int x=5;
	int y=3;
	
	public MyCallableAdd() {
		
	}
	public MyCallableAdd(int x,int y) {
		
		this.x=x;
		this.y=y;
	}
	
	//实现两个数相加
	public Object call() throws Exception {
			
		return x+y;
	}
	
	

}
