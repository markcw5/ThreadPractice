package com.cheng.ThreadPractice;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	EnjoyThread t1=new EnjoyThread("t1");
    	EnjoyThread t2=new EnjoyThread("t2");
        System.out.println( "休息3秒钟" );
        try {
			Thread.sleep(3000);
			System.out.println("主线程正在休息");
			System.out.println(Thread.currentThread());
			System.out.println(Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        t1.run();
        t2.start();
        System.out.println("休息结束");
        
    }
}
