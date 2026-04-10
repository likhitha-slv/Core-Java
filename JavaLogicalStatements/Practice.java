package JavaLogicalStatements;
import java.util.*;
public class Practice {
////	Check whether a number is even or odd
//
//	Check whether a number is positive or negative

//	Find the largest of two numbers
//
//	Find the smallest of two numbers
//
//	Find the largest of three numbers
//
//	Check whether a student is pass or fail based on marks
//
//	Check whether a person is eligible to vote
//
//	Check whether a given year is a leap year
//
//	Check whether a number is divisible by 5

	//Check whether a character is an alphabet
	public static void main(String[] args) {
    int a= 1;// 1st
    if(a % 2 == 0)
    {
    	System.out.println("It ia an even number");
    }
    else
    {
    	System.out.println("It is a odd number");
    }
    System.out.println("_______________________________");
    int b=-12;//2 nd
    if(b > 0)
    {
    	System.out.println("Positive number");
    }
    else
    {
    	System.out.println("Negative number");
    }
    System.out.println("___________________________");
    
    // largest of 2 number
    int a1 = 5;
    int b1= 4;
    if(a1 > b1)
    {
    	System.out.println(" a is largest");
    }
    else
    {
    	System.out.println("smallest");
    }
    
    System.out.println("__________________________");
    
    int a2 = 5;
    int b2 = 10;
    if(a2 < b2)
    {
    	System.out.println("A is smallest");
    }
    else
    {
    	System.out.println("Greatest");
    }
    System.out.println("_______________________");
	// Greatest of 3 numbers
    int a3 = 115;
    int b3 = 33;
    int c = 19;
    
    if(a3 > b3 && a3 > c)
    {
    	System.out.println("A");
    }
    else if(b3  > c)
    {
    	System.out.println("B");
    }
    else
    {
    	System.out.println("C");
    }
    
    System.out.println("_______________________");
    
    
    int a11 = 5;
    int b11 = 3;
    int c11 = 9;
    
    if(a11 > b11 && a11 > c11)
    {
    	System.out.println("A");
    }
    else if(b11  > c11)
    {
    	System.out.println("B");
    }
    else
    {
    	System.out.println("C");
    }
    System.out.println("____________________");
          
             int a4 = 10;
            int b4 = 25;
            int c4 = 15;

            if (a4 > b4 && a4 > c4) 
            {
                System.out.println("A is largest");
            } 
            else if (b4 > c4) 
            {
                System.out.println("B is largest");
            } 
            else 
            {
                System.out.println("C is largest");
            }
            System.out.println("_______________________");
            // marks
            Scanner sc = new Scanner(System.in);	
            System.out.println("Enter the marks");
            int marks= sc.nextInt();
            if(marks >= 35)
            {
            	System.out.println("Pass");
            }
            else
            {
            	System.out.println("Fail");
            }
            System.out.println("__________________");
            //vote
            System.out.println("Enter the age");
            int age = sc.nextInt();
            if(age > 18)
            {
            	System.out.println("You are eligible for voting");
            }
            else
            {
            	System.out.println("Not eligible");
            }
            System.out.println("________________+____________________");
            
            //leap year or not
            System.out.println("Enter the year");
            int year = sc.nextInt();
          
            if(year < 365)
            {
            	System.out.println("It is not a leap year");
            }
            else
            {
            	System.out.println("Leap year");
            }
            System.out.println("__________________________");
            if(year % 4 == 0)
            {
            	System.out.println("It leap");
            }
            else
            {
            	System.out.println("Not a leap");
            }
            System.out.println("_______________________");
            int num= 10;
            if(num % 5 == 0)
            {
            	System.out.println("Divisible by 5");
            }
            else
            {
            	System.out.println("Not divosible by 5");
            }
            System.out.println("_________________________");
            // alphabet or not
            System.out.println("Enter the character");
             char c1 =sc.next().charAt(0);
           if((c1 >= 'A' && c1 <='Z')||(c1  >= 'a' && c1 <= 'z'))
           {
        	   System.out.println("Alphabet");
           }
           else
           {
        	   System.out.println("Not Alphabet");
           }
        }
   
}
