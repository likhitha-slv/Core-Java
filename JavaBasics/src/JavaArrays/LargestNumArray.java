package JavaArrays;

public class LargestNumArray {

	public static void main(String[] args) {

		System.out.println("Main method started");
		int[] num = {25,98,21,35,89};
		int max=num[0];
	     for(int i=0;i<num.length;i++)
	     {
	    	 if(num[i] > max)
	    	 {
	    		 max=num[i];
	    	 }
	     }
	     System.out.println("Maximum" +max);
		for(int i=0; i<num.length;i++)
		{
			if(num[i] < max)
			{
				max=num[i];
			}
		}
		System.out.println("Minimum: " +max);
	}

}
