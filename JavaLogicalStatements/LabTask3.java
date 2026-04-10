package JavaLogicalStatements;

import java.util.Scanner;

public class LabTask3 {

	public static void main(String[] args) {
    System.out.println("Main method started");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the age");
    int age = sc.nextInt();
    if(age <= 0)
    {
    	System.out.println("Invalid age");
    }
    else if(age <=5)
    {
    	System.out.println("Child age");
    }
    else if(age <= 12)
    {
    	System.out.println("Kid age");
    }
    else if(age <= 19)
    {
    	System.out.println("Teen age");
    }
    else if(age <= 35)
    {
    	System.out.println("Young age");
    }
    else if(age <= 60)
    {
    	System.out.println("Middle age");
    }
    else if(age > 60)
    {
    	System.out.println("Old age");
    }
    else
    {
    	System.out.println("U R ready to grave yard ");
    }
	}

}
