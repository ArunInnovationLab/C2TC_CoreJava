package com.tnsif.Multithreading;

public class Example extends Thread{

	int st;
	String msg;
	
	public Example(int st, String msg) {
		this.st = st;
		this.msg = msg;
	}


	public void run() {
		for(int i=1;i<=10;i++) {
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println(msg+" "+i);
		}
	}
	
	
	
	
}
