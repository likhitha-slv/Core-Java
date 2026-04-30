package JavaPatterns;

public class Pattern22 {

	public static void main(String[] args) {
		for(int i=2;i<=6;i++)
	    {
	    	for(int j=2;j<=6;j++)
	    	{
	    		if(i==j || i+j ==4)
	    		{
	    			System.out.print("*");
	    		}
	    		else
	    		{
	    			System.out.print(" ");
	    		}
	    	}
	    	System.out.println();
	    }
		}

}
