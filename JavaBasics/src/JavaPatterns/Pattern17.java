package JavaPatterns;

public class Pattern17 {

	public static void main(String[] args) {
    for(int i=1;i<=4;i++)
    {
    	for(int j=1;j<=4;j++)
    	{
//    		if( i==3 || i+j == 6)
//    		{
//    			System.out.print("*");
//    		}
    		
//    		if( i+j==6 || i+j == 6)
//    		{
//    			System.out.print("*");
//    		}
    		
//    		if( i+j==6 && i+j == 6)
//    		{
//    			System.out.print("*");
//    		}
    		
    		if( i==2 && i+j == 6)
    		{
    			System.out.print("*");
    		}
    		else
    		{
    			System.out.print("^");
    		}
    	}
    	System.out.println();
    }
	}

}
