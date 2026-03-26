package JavaLogicalStatements;

import java.util.Scanner;

public class SwitchWithYield {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your marks");
    int marks = sc.nextInt();
//    String result = switch(marks);// in this we have give 9,8,7.... 
    String result = switch(marks / 10) //we have give here as 90, 80, 70...
    {
    case 9,10:
    {
    yield "Excellent";
    }
    case 8:
    {
    	yield " VeryGood";
    }
    case 7:
    {
    	yield "Good";
    }
    case 6:
    {
    	yield "Average";
    }
    case 5:
    {
    	yield "Pass";
    }
    default:
    {
    	yield "Fail";
    }
	};
System.out.println(result);
}
}
