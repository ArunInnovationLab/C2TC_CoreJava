package com.tnsif.Multithreading;


public class MultiThreadDemo extends Thread {

	int st;
	String msg;
	Thread t;
	
	
	public MultiThreadDemo(int st, String msg) {
		this.st = st;
		this.msg = msg;
		t = new Thread(this, msg);
		System.out.println("New thread: " + t);
		t.start();
		
	}
	
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(st);
			}
			catch(Exception e){
				
			}
			System.out.println(msg+" " + i);
		}
		
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		new MultiThreadDemo(2000,"First");
		MultiThreadDemo t2=new MultiThreadDemo(3000,"Second");
		
	}

}
