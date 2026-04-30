package JavaPatterns;

public class Pattern19 {

	public static void main(String[] args) {
    for(int i=2;i<=4;i++)
    {
    	for(int j=2;j<=4;j++)
    	{
    		if(i==j || i+j ==6)
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
