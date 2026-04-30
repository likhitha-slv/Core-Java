 package JavaArrays;

public class BubbleSort {

	public static void main(String[] args) {
    System.out.println("main method started");
    int[] arr = {20,42,12,34,17};
    int temp=0;
   
    for(int i=0;i<arr.length;i++)
    {
    	for(int j=0;j<arr.length-1-i;j++)
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
   for(int a: arr)
   {
	   System.out.println(a);
   }
	}

}
