package JavaPatterns;

public class Pattern7 {

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
		for(int i=1;i<=5;i++)
	     {
	    	 //----space column-----
	    	 for(int j=0;j<=i;j++)
	    	 {
	    		 System.out.print(" ");
	    	 }
	    	 
	    	 //------star column------
	    	 for(int j=5;j>=i;j--)
	    	 {
	    		 System.out.print("*");
	    	 }
	    	 System.out.println();
	     }
	}

}
