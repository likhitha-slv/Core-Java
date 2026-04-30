package CaseStudies;

import java.util.Scanner;

public class SchoolStudentsData {

	
	static int calculateTotal(int tS, Scanner sc) {
	    int total = 0;

	    for (int i = 0; i < tS; i++) {
	        int marks = sc.nextInt();
	        total = total + marks;
	    }

	    return total;
	}

	public static void main(String[] args) {
     System.out.println("main method started");
     Scanner sc = new Scanner(System.in);
     int[][] arr = new int[10][10];
     System.out.println("enter the name of the student");
     String str = sc.next();
     System.out.println("Enter the total number of subjects");
     int totalS = sc.nextInt();
     System.out.println("enter the marks of each student");
     int total =calculateTotal(totalS, sc);
     
     System.out.println("total marks are :" +total);
     
     
     int avg = total/totalS;
     System.out.println("Average is: " +avg);
     
     if(avg> 90)
     {
    	 System.out.println("Topper Student");
     }
     else
     {
    	 System.out.println("Normal Student");
     }
	}

}
