package com.tnsif.Multithreading;

public class WithdrawThread extends Thread{

	Service s;
	int amt;
	
	public WithdrawThread(Service s, int amt) {
		this.s = s;
		this.amt = amt;
	}
	
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	s.withdraw(amt);
	}
		
}
