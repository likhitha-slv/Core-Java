package JavaLoopStatements;

import java.util.Scanner;

public class PrimeOrNot {

	 static boolean isPrime(int n)
	    {
		 boolean status = true;
			if( n == 0 || n==1)
			{
				return false;
			}
			for(int i = 2; i<n;i++)
			{
				if(n%i==0)
				{
					status =  false;
					break;
				}
			}
	    	return status;
	    }
	public static void main(String[] args) {
    System.out.println("Main method started");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    boolean isPrime=true;
    for(int i =2;i<=n;i++)
    {
    	if(isPrime(i))
    	{
    		System.out.println(i);
    	}
    }
    
    /*for(int i=2;i<n;i++){
    	
    	if(n % i == 0){
    		prime=false;
    		break;
    	}
    	

    }
    
    if(prime) {
    	System.out.println("prime");
    }else {
    	System.out.println("not prime");
    }
    */
    
    
   
	}

}
