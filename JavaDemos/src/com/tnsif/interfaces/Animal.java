package com.tnsif.interfaces;

public interface Animal {
    
	public void eat();
    
    default public void legs() {
    	System.out.println("Animals have four legs .");
    }
    
}