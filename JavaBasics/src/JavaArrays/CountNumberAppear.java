package JavaArrays;

public class CountNumberAppear {

	public static void main(String[] args) {
    int[] arr = {10,3, 20,3,45, 2};
  
    for(int i=0;i<arr.length;i++)
    {
    	  int count = 1;
    	for(int j =i+1;j<arr.length;j++)
    	{
    		if(arr[i] == arr[j])
    		{
    		count++;
    	}
    }
    	
    	
    	boolean alreadyCounted = false;
    	for(int k=0;k<i;k++)
    	{
    		if(arr[i] == arr[k])
    		{
    			alreadyCounted = true;
    			break;
    		}
    	}
    	
    	if(!alreadyCounted)
    	{
    	    System.out.println(arr[i]+ " " + "appears"+ " " + count + " "+ "times");
    	}
	}
	}
}
