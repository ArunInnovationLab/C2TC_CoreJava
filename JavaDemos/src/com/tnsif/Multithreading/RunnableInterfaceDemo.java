package com.tnsif.Multithreading;

public class RunnableInterfaceDemo {

	public static void main(String[] args) {

		RunnableClassOne thread1=new RunnableClassOne(10, 1, "FIRST");
		RunnableClassOne thread2=new RunnableClassOne(5, 1, "SECOND");
		RunnableClassTwo thread3=new RunnableClassTwo("THIRD");
		RunnableClassTwo thread4=new RunnableClassTwo("FOUR");
		
		Thread t1=new Thread(thread1);
		Thread t2=new Thread(thread2);
		Thread t3=new Thread(thread3);
		Thread t4=new Thread(thread4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		try {
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main thread exiting");
		
	}

}
