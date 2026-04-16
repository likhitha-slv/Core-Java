package JavaArrays;

public class SelectionSort {

	public static void main(String[] args) {
    int[] arr = {2,4,1,5,7,3};
    int temp =0;
    for(int i=0;i<arr.length;i++)
    {
    	int minIndex=i;
    	for(int j=i+1;j<arr.length;j++)
    	{
    		if(arr[j] < arr[minIndex])
    		{
    			minIndex = j;
    		}
    	}
    	temp = arr[minIndex];
    	arr[minIndex] = arr[i];
    	arr[i] = temp;
  
    	
    }
    for(int a:arr)
    {
    	System.out.print(a + " ");
    }
    
	}

}
