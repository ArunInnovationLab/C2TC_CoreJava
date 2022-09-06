package com.tnsif.CollectionsFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("Amit");  
		pq.add("Vijay");  
		pq.add("Karan");  
		pq.add("Jai");  
		pq.add("Rahul"); 
		System.out.println(pq);
		
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
        pq1.add(1000);
        pq1.add(300);
        pq1.add(3000);
        pq1.add(200);
        
        System.out.println(pq1);
        
        System.out.println(pq1.remove());
        
        System.out.println(pq1.offer(2022));
        
        System.out.println(pq1);
        
        System.out.println(pq1.poll());
        System.out.println(pq1);
		
	}

}
