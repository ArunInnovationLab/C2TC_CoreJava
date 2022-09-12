package com.tnsif.Multithreading;

public class ThreadDemoTwo {

	public static void main(String[] args) {

		Example thread1 = new Example(2000,"First Thread");
		Example thread2 = new Example(3000,"Second Thread");
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Main Thread "+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
