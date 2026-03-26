package JavaLogicalStatements;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
    System.out.println("main method");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the days");
    int days = sc.nextInt();
    if(days == 29)
    {
    	System.out.println("It is leap month");
    }
    else if(days % 2 == 0)
    {
    	System.out.println("\"It is an even months\"");
    }
    else
    {
    	System.out.println("It is a odd");
    }
	}

}
