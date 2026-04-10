package JavaLogicalStatements;
import java.util.*;

import javax.annotation.processing.SupportedSourceVersion;
public class Palindrome {

	public static void main(String[] args) {
	
     System.out.println("Enter a number");
     Scanner sc = new Scanner(System.in);
     int num=sc.nextInt();
     System.out.println("Enter the first number");
     int firstN = sc.nextInt();
     System.out.println("Enter the second number");
     int secondN = sc.nextInt();
     firstN = num /100;
     secondN = num % 10;
     if(firstN == secondN)
     {
    	 System.out.println("It is a palindrome");
     }
     else
     {
    	 System.out.println("Not a palindrome");
     }
	}

}
