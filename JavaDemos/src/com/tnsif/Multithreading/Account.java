package com.tnsif.Multithreading;

public class Account {

	static int Balance=2000;
	public static void main(String[] args) throws InterruptedException {

		Service s1 = new Service();
	
		WithdrawThread t1 = new WithdrawThread(s1,1000);
		WithdrawThread t2 = new WithdrawThread(s1,500);	
		DepositThread t3 = new DepositThread(s1,500);
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("Final balance "+Balance);
		
	}

}
