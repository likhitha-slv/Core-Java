package JavaArrays;

public class BubbleSortDesc {

	public static void main(String[] args) {
    int[] arr = {3,2,6,8,4,9,3};
    int temp=0;
    for(int i=0;i<arr.length;i++)
    {
    	for(int j=0;j<arr.length-1-i;j++)
    	{
    		if(arr[j] < arr[j + 1])
    		{
    			temp = arr[j];
    			arr[j] = arr[j+1];
    			arr[j+1] = temp;
    		}
    	}
    }
    System.out.println("After Sorting");
    for(int a:arr)
    {
    	System.out.println(a);
    }
	}

}
