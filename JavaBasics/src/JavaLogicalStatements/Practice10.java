package JavaLogicalStatements;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Grade");
    char grade = sc.next().charAt(0);
    
    switch(grade)
    {
    case 'A':
    	System.out.println(" Excellent");
    	break;
    case 'B':
    	System.out.println("Good");
    	break;
    case 'C':
    	System.out.println("Average");
    	break;
    case 'D':
    	System.out.println("Poor");
    	break;
    default:
    	System.out.println("Invalid Grade");
    }
	}

}
