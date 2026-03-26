package JavaLogicalStatements;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
     System.out.println("Main method started");
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the choice");
     int choice = sc.nextInt();
     switch(choice)
     {
     case 1:
     System.out.println("Enter the username");
     String user_name = sc.next();
     
     System.out.println("Enter the password");
     String pass_word = sc.next();
     
  
     if(user_name.equals("Admin") && pass_word.equals("9876"))
     {
    	 System.out.println("Login Successfully completed");
     }
     else
     {
    	 System.out.println("Invalid data");
     }
     break;
     
     case 2:
    	 System.out.println("Registration Successfully completed");
    	 break;
    	 
     case 3:
    	 System.out.println("Next page");
    	 break;
    	 
    default:
    	System.out.println("Invalid Choice");
	}
	}
}
