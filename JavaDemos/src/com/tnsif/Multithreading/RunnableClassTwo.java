package com.tnsif.Multithreading;

public class RunnableClassTwo implements Runnable {

	String msg;

	public RunnableClassTwo(String msg) {
		this.msg = msg;
	}

	
	public void run() {
		for(int i=0;i<msg.length();i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(msg.charAt(i));
		}
	}
	
	
}
