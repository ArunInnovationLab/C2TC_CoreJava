package com.tnsif.basic_java_programs;

public class BreakAndContinue {

	public static void main(String[] args) {
        
		//continue
		for(int i=1; i<=10; i++){
       	 if(i == 5) {
       		 continue;   
       	 }
       	 System.out.println(i);
        }
        System.out.println("-----------------------");
        
        //break
        for(int i =1;i<10;i++) {
        	if(i==5) {
        		break;
        	}
            System.out.println(i);
        }


	}

}
