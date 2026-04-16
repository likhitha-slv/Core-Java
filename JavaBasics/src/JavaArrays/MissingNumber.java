package JavaArrays;

public class MissingNumber {

	public static void main(String[] args) {
    int[] arr = {1,2,4,5,7};
    int n=7;
    for(int i=1;i<=n;i++)
    {
    	boolean status = false;
    	for(int j=0;j<arr.length;j++)
    	{
    		if(i == arr[j])
    		{
    			status = true;
    			break;
    		}
    	}
    	if(!status)
    	{
    		System.out.println("Missing elements:" +i);
    	}
    }
	}

}
