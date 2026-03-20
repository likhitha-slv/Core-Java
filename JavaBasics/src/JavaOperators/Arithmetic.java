package JavaOperators;
import java.util.*;
public class Arithmetic {

	public static void main(String[] args) {
		System.out.println("main method started");	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		System.out.println("enter a number");
		int b=sc.nextInt();
		
		
		System.out.println("Addition" + a + b);//Addition59
		System.out.println("Addition" + (a+b));//Addition14
		
		
		//System.out.println("subtraction" + a - b);// The operator - is undefined for the argument type(s) String, int
        System.out.println("subtraction" + (a - b));//subtraction0
        
        System.out.println("multiplication:" + a*b);//multiplication:16
        
        System.out.println("multiplication:" + (a*b));//multiplication:16
   
        System.out.println("division:" + a/b);// quotient --> division:3
        
        System.out.println("modulus:" + a%b);// remainder --> modulus:0
        
	}

}
