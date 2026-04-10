package JavaLogicalStatements;
import java.util.*;

public class Practice2 {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the character");
    char c = sc.next().charAt(0);
     if(c == 'a' || c == 'e' || c=='i' || c == 'o' || c == 'u')
     {
    	 System.out.println("Vowel");
     }
     else
     {
    	 System.out.println("consonant");
     }
     System.out.println("*************************");
     if(c >= 'A' && c <='Z')
     {
    	 System.out.println("Upper case");
     }
     else
     {
    	 System.out.println("Lower case");
     }
     System.out.println("***********************");
     System.out.println("Enter the number");
     int n=sc.nextInt();
     if(n==0)
     {
    	 System.out.println("Zero");
     }
     else
     {
    	 System.out.println("not");
     }
     System.out.println("**********************");
//     Check whether a number is divisible by both 2 and 3
     System.out.println("Enter the number");
     int n1=sc.nextInt();
     if(n1 % 2== 0 && n1%3 == 0)
     {
    	 System.out.println("Divisible by 2 & 3 ");
     }
     else
     {
    	 System.out.println("Not divisibke by 2 & 3");
     }
     System.out.println("*****************");
     System.out.println("Enter the marks");
     int marks = sc.nextInt();
     if(marks >= 80 && marks <=100)
     {
    	 System.out.println("Grade A");
     }
     else if(marks >=50 && marks <=80)
     {
    	 System.out.println("Grade B");
     }
     else if(marks >=35 && marks <=50)
     {
    	 System.out.println("Grade C");
     }
     else
     {
    	 System.out.println("Fail");
     }
     System.out.println("*************************");
     
     System.out.println("Enter the number");
     int n2 = sc.nextInt();
     //int n2 = 10;
     if(n2 % 10 ==0)
     {
    	 System.out.println("Multiple of 10");
     }
     else
     {
    	 System.out.println("Not multiple of 10");
     }
     System.out.println("***********************");
   
     int aaa=101;
     if(aaa >= 1 && aaa <= 100)
     {
    	 System.out.println("number lies between 1 and 100");
     }
     else
     {
    	 System.out.println("number not lies between 1 and 100");
     }
     System.out.println("**************************");
     
    System.out.println("enter a number");
    int a=sc.nextInt();
    System.out.println("enter b number");
    int b=sc.nextInt();
    System.out.println("enter operator ");
    char opt = sc.next().charAt(0);
    if(opt == '+')
    {
    	System.out.println("Output" + (a+b));
    }
    else if( opt == '-')
    {
    	System.out.println("Output" + (a-b));
    }
    else
    {
    	System.out.println("Invalid");
    }
    System.out.println("*********************");
    
    System.out.println("enter a number");
    int a1=sc.nextInt();
    System.out.println("enter b number");
    int b1=sc.nextInt();
    if (a1 == b1)
    {
    	System.out.println("Equal");
    }
    else
    {
    	System.out.println("Not Equal");
    }
    System.out.println("**************************");
    
    int a11= 65;
    char c14 = 'A';
    if(a11 == 'A')
    {
    	System.out.println("Character is a number");
    }
    else
    {
    	System.out.println("Not a character");
    }
    
    System.out.println("**************************");
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	}
	}
    