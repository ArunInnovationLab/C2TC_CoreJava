package com.tnsif.Multithreading;

public class Service {

	Integer bal;
	
	public void setBal(int bal) {
		this.bal = bal;
	}

	synchronized void withdraw(int amt) {
		int balance = getBalance();
		System.out.println("Available balance : "+balance);
		bal=balance-amt;
		setBalance(bal);
		System.out.println("Balance after withdraw : "+getBalance());
		
	}
	
	private void setBalance(int bal2) {
		
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			Account.Balance=bal2;	
	}

	int getBalance() {
		return Account.Balance;
	}
	
	synchronized void deposit(int amt) {
		Integer balance = getBalance();
		System.out.println("Available balance : "+balance);
		bal=getBalance()+amt;
		setBalance(bal);
		System.out.println("Amount after deposit : "+getBalance());
	}
}


