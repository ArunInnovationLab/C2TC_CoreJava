//program to demonstrate multilevel inheritance 
package com.tnsif.lesson3g;

class OneNew
{
	void dispOutput()
	{
		System.out.println("I am class One");
	}
}
class TwoNew extends OneNew
{
	void dispOutputTwo()
	{
		System.out.println("I am class Two");
	}
	
}
class ThreeNew extends TwoNew
{
	void dispOutputThree()
	{
		System.out.println("I am class Three");
	}
}
class Four extends ThreeNew
{
	void dispOutputFour()
	{
		System.out.println("I am class Four");
	}
}

public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Four obj = new Four();
		
		obj.dispOutputFour();
		obj.dispOutputThree();
		obj.dispOutputTwo();
		obj.dispOutput();
		
		
	}

}
