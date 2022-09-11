package com.tnsif.Multithreading;

//Create a second thread by extending Thread
class ThreadOne extends Thread{
	ThreadOne(){
		//Create a new, Second thread.
		super("Demo Thread");
		System.out.println("Child Thread : "+this);
		start();// start the thread
	}
	
	//This is the entry point for the second thread.
	public void run() {
		try {
			for(int i=5;i>0;i--) {
				System.out.println("Child thread: "+i);
			 	Thread.sleep(500);
			}
		}catch(InterruptedException e) {
			System.out.println("Child interrupted. ");
		}
		System.out.println("Exiting child thread.");
	}
}

public class ExtendThread {

	public static void main(String[] args) {
		
		new ThreadOne();
		
		try {
			for(int i=5;i>0;i--) {
				System.out.println("Main Thread: "+i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			System.out.println("Main thread Interrupted.");
		}
		System.out.println("Main thread exiting");

	}

}
