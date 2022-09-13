package com.tnsif.Multithreading;

/*The producer’s job is to generate data, put it into the buffer, and start again.
  At the same time, the consumer is consuming the data (i.e. removing it from the buffer), one piece at a time.

*Problem :
*To make sure that the producer won’t try to add data into the buffer if it’s full and that the consumer won’t try to remove data from an empty buffer.
*
*/

class MyData{
	Integer value = 0;
	boolean flag = true;
	
	synchronized void set(int v) throws InterruptedException{
		while(flag!=true) {
			wait();//Causes the current thread to wait until another thread invokes the java.lang.Object.notify() method or the java.lang.Object.notifyAll() method for this object. 
		}
		value=v;
		flag=false;
		notify();	
	}
	
	synchronized int get() throws InterruptedException{
		int x=0;
		while(flag!=false) {
			wait();
		}
		
		x=value;
		flag=true;
		notify();
		
		return x;
	}
}

class Producer extends Thread{
	MyData d;

	public Producer(MyData d) {
		this.d = d;
	}
	
	public void run() {
		int i = 1;
		while(true) {
			try {
				d.set(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Producer : "+i);
			i++;
		}
	}
		
}

class Consumer extends Thread{
	MyData d;

	public Consumer(MyData d) {
		this.d = d;
	}
	
	public void run() {
		while(true) {
			try {
				System.out.println("Consumer : "+d.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class InterThreadCommunication {

	public static void main(String[] args) {
        
		MyData d = new MyData();
		Producer p = new Producer(d);
		Consumer c = new Consumer(d);
		
		p.start();
		c.start();
	}

}
