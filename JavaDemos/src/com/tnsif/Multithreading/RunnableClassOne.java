package com.tnsif.Multithreading;

public class RunnableClassOne implements Runnable{

	Integer h;
	Integer l;
	String msg;
	
	
	public RunnableClassOne(Integer h, Integer l, String msg) {
		this.h = h;
		this.l = l;
		this.msg = msg;
	}

	

	public void run() {

		for(int i=h;i>l;i--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(msg+" "+i);
		}
		
		
	}

}
