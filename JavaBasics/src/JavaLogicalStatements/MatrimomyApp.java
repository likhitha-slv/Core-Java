package JavaLogicalStatements;
import java.util.*;
public class MatrimomyApp {

	public static void main(String[] args) {
    System.out.println("Welcome to Matrimony Application");
    Scanner sc = new Scanner(System.in);
    System.out.println("Tell about yourself");
    String name = sc.next();
    System.out.println("Enter ur asserts");
    double asserts = sc.nextDouble();
    if( asserts >= 5000000)
    {
    	System.out.println("Your ok good to go");
    	System.out.println("Enter your sal");
    	double sal = sc.nextDouble();
    	if(sal >= 300000)
    	{
    		System.out.println("Yes ok");
    		System.out.println("Enter ur age ");
    		int age = sc.nextInt();
    		if(age <= 28 && age >=25)
    		{
    			System.out.println("Your is perfect to marry");
    			System.out.println("Enter your height");
    			int height= sc.nextInt();
    			if(height >155 && height <= 159)
    			{
    				System.out.println("Your good pair");
    				System.out.println("Enter your Weight");
    				int weight = sc.nextInt();
    				if(weight >= 60 && weight <=70)
    				{
    					System.out.println("Your weight is perfect");
    					System.out.println("If u have siblings");
    					boolean sib = sc.nextBoolean();
    					if(!sib)
    					{
    						System.out.println("OH ok ");
    						System.out.println("Congratulations your perfect to marry me");
    					}
    					else
    					{
    						System.out.println("I am not done with this");
    					}
    	
    				}
    				else
    				{
    					System.out.println("Go to gym daily");
    				}
    			}
    			else
    			{
    				System.out.println("Your height is not good");
    			}
    		}
    		else
    		{
    			System.out.println("Age mismatch");
    		}
    	}
    	else
    	{
    		System.out.println("Not satisfied");
    	}
    	
    }
    	else
    	{
    		System.out.println("Your not matched");
    	}
    }
    
    
	}


