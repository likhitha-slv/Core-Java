package JavaLoopStatements;

import java.util.Scanner;

public class LabTask1 {

	public static void main(String[] args) {
     int n =50;
     for(int i=1; i<=50; i++) {
    	 if(i % 3== 0 && i %5 ==0)
    	 {
    		 System.out.println("FizBuz" +i);
    	 }
    	 else if( i % 3 == 0)
    	 {
    		 System.out.println("Fizz" +i);
    	 }
    	 else if(i % 5 == 0)
    	 {
    		 System.out.println("Buzz" +i);
    	 }
 
    	 else
    	 {
    		 System.out.println(i);
    	 }
     }
	}

}
