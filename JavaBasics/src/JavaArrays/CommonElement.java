package JavaArrays;

public class CommonElement {

	public static void main(String[] args) {
    int[] arr = {2,3,4,3,4,6};
    boolean found = true;
    for(int i=0;i<arr.length;i++)
    {
    	for(int j=i+1;j<arr.length;j++)
    	{
    	if(arr[i] == arr[j])
    	{
    		System.out.println(arr[i]);
    		break;
    	}
    }
	}
    
	}
}
