package JavaPatterns;

public class Pattern6 {

	public static void main(String[] args) {
		for(int i=1;i<=6;i++)
	     {
	    	 //----space column-----
	    	 for(int j=6;j>=i;j--)
	    	 {
	    		 System.out.print(" ");
	    	 }
	    	 
	    	 //------star column------
	    	 for(int j=1;j<=i;j++)
	    	 {
	    		 System.out.print("*");
	    	 }
	    	 System.out.println();
	     }
	}

}
