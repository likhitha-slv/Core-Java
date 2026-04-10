package JavaLogicalStatements;

import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
     System.out.println("Main method started");
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number");
     int a = sc.nextInt();
     
     switch(a) {
     case 1:
    	 System.out.println("One");
    	 break;
     case 2:
    	 System.out.println("Two");
    	 break;
     case 3:
    	 System.out.println("Three");
    	 break;
     case 4:
    	 System.out.println("Four");
    	 break;
     case 5:
    	 System.out.println("Five");
    	 break;
    default:
    	System.out.println("Invalid");
     }
    	 
	}

}
