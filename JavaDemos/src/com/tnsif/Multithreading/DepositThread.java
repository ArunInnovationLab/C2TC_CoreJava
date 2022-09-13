package com.tnsif.Multithreading;

public class DepositThread extends Thread{

	private Integer amt;
	Service s;
	
	public DepositThread(Service s,Integer amt) {
		this.s=s;
		this.amt = amt;
	}

	
	public void run() {
	
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		s.deposit(amt);	
	}
    

	
	
	
	
	

	
    
	

	
	
	
	
}
