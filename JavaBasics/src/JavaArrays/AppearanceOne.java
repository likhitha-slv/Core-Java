package JavaArrays;

public class AppearanceOne {

	public static void main(String[] args) {
    int[] arr = {1,2,3,3,2,1,4};
    for(int i=0;i<arr.length;i++)
    {
    	boolean isDuplicate = false;
    	for(int j=0;j<i;j++)
    	{
    		if(arr[i] == arr[j])
    		{
    			isDuplicate = true;
    			break;
    		}
    	}
    	if(!isDuplicate)
    	{
    		System.out.println(arr[i]);
    	}
    }
    
	}

}
