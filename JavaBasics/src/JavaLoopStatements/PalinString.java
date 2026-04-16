package JavaLoopStatements;

import java.util.Scanner;

public class PalinString {

	public static void main(String[] args) {
    System.out.println("main method started");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String");
    String str = sc.next();
    String rev="";// if we give ani space in the empty string it gives the wrong input
    for(int i= str.length()-1 ; i >=0 ;i--)
    {
    	rev = rev + str.charAt(i);
    	
    }
    if(str.equals(rev))
    {
    	System.out.println("Palindrome");
    }
    else
    {
    	System.out.println("Not a palindrome");
    }
	}

}
