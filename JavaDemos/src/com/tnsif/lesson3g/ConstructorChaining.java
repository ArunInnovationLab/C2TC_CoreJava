package com.tnsif.lesson3g;

/*Using this() keyword to call the current class constructor within the “same class”.
Using super() keyword to call the superclass constructor from the “base class”.
*/
class Developed{
	Developed(){
		System.out.println("Java was developed by James Gosling");
	}
	
	Developed(int year){
		this("Java", year);
		System.out.println("James Gosling is known as Father of Java programming language");
	}
	
	Developed(String name, int year){
		this();
		System.out.println("at Sun Microsystems and released in 1995");
	}
	
	void display() {
		System.out.println("The java compiler is written in java but java runtime is ANSI C");
	}
	
}


class School{
	 String stName; 
	 int stRoll; 
	 int stId;
	
	 public School(String stName, int stRoll, int stId) {
		this.stName = stName;
		this.stRoll = stRoll;
		this.stId = stId;
	 }

	@Override
	public String toString() {
		return "School [stName=" + stName + ", stRoll=" + stRoll + ", stId=" + stId + "]";
	}
	 
}

class Student extends School{
	Student() { 
	    super("Shubh" , 2 , 2345); 
	    System.out.println("Student class");
	}
	
	
}

public class ConstructorChaining {
	public static void main(String [] args) {
//		Developed obj = new Developed(1995);	
//		obj.display();
		
		Student st = new Student();
		System.out.println(st.toString());
	}

}
