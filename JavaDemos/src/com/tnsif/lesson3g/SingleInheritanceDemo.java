// program to demonstrate Single Inheritance 
package com.tnsif.lesson3g;
// Parent class
 class One
{
	 Integer FIRSTNUMBER = 100;

	/*
	 * void dispOutput1(Integer firstNumber) { this.FIRSTNUMBER = firstNumber;
	 * System.out.println("I am class One"); }
	 */
 void dispOutput2()
	{
		System.out.println("I am class One");
	}
}
// Child class
class Two extends One
{
	void dispOutput2()
	{
		//will invoke or call parent class dispOutput2() method
		super.dispOutput2();
		System.out.println("I am class Two");
	}
}
public class SingleInheritanceDemo {
	public static void main(String[] args) {
		
		Two obj2 = new Two();
		obj2.dispOutput2();
		
	}

}






