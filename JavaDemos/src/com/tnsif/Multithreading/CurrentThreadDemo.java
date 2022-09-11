package com.tnsif.Multithreading;

public class CurrentThreadDemo {

	public static void main(String[] args) {

		Thread t = Thread.currentThread();
		System.out.println("Current thread: "+t);
		
		t.setName("My thread");
		System.out.println("After name change: "+t);
		

		for(int i=5;i>0;i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}
		System.out.println(t.getName());
  }
}

