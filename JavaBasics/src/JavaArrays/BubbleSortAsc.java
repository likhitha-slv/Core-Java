package JavaArrays;

public class BubbleSortAsc {

	public static void main(String[] args) {
    int[] arr = {3,4,1,5,9};
    System.out.println("Before Sorting");
    int temp =0;
    for(int i=0;i<arr.length;i++)
    {
    	for(int j =0;j<arr.length-1-i;j++)
    	{
    		if(arr[j] > arr[j+1])
    		{
    			temp = arr[j];
    			arr[j] = arr[j+1];
    			arr[j+1] = temp;
    		}
    	}
    }
    System.out.println("After Sorting");
    for( int a:arr)
    {
    	System.out.println(a);
    }
	}

}
