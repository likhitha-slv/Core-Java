package JavaLoopStatements;
import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
     System.out.println("enter A value");
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     System.out.println("enter B value");
     int b = sc.nextInt();
     System.out.println("enter the operator");
     char oper = sc.next().charAt(0);
     switch(oper)
     {
     case '+':
       System.out.println("Addition" + (a + b));
       break;
     case '-':
    	 System.out.println("Subtraction" + (a - b));
    	 break;
     case '*':
    	 System.out.println("Multiplication" + (a*b));
    	 break;
     case '/':
    	 System.out.println("Division" + (a/b));
    	 break;
     case '%':
    	 System.out.println("Modulus" + (a%b));
    	 break;
    default:
    	System.out.println("Invalid operator");
     }
	}

}
