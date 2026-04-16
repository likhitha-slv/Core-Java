package JavaArrays;

public class PrintEvenIndex {

	public static void main(String[] args) {
    System.out.println("main method started");
    int[] arr = {1,3,2,4,8,5,9};
    for(int i=0;i<arr.length;i++)
    {
    	if(i % 2 == 0)
    	{
    		System.out.println("Even Index:" + " " + i  + "  " + "its value is"+ " " +arr[i]);
    	}
    	else
    	{
    		System.out.println("Odd index:" + "  "+i +"   "  +"its value is"+ " " + arr[i]);
    	}
    }
	}

}
