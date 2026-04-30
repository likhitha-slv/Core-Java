package CaseStudies;

import java.util.Scanner;

public class CaseStudy1 {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the age");
      int eligible =0;
      int nonEligible =0;
     for(int i =0; i<=10;i++)
     {
    	 System.out.println("Enter the age of voter" +i);
    	 int age = sc.nextInt();
    	 if(age > 18)
    	 {
    		 System.out.println("Eligible voters");
    		 eligible++;
    		 System.out.println(eligible);
    
    	 }
    	 else if(age == 18)
    	 {
    		 System.out.println("Youngest voters");
    	 }
    	 else if(age < 18)
    	 {
    		 System.out.println("Non-eligible voters");
    		 nonEligible++;
    		 System.out.println(nonEligible);
    	 }
    	 if(age >= 60 && age <= 100)
    	 {
    		 System.out.println("Oldest voters");
    	 }
    	/* else  // if i write the else block it is always executing.
    	 * if the statement is true or not it is executing.
    	 * no need write the else block
    	 {
    		 System.out.println("Votes completed");
    	 }
    	 */
    	 System.out.println("**************************");
    }
 
	}

}
