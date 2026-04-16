package JavaArrays;

public class BubbleSortCount {

		public static void main(String[] args) {
	    int[] arr = {3,2,6,8,4,9,3};
	    int temp=0;
	    int count = 0;
	    for(int i=0;i<arr.length;i++)
	    {
	    	
	    	for(int j=0;j<arr.length-1-i;j++)
	    	{
	    		if(arr[j] < arr[j + 1])
	    		{
	    			temp = arr[j];
	    			arr[j] = arr[j+1];
	    			arr[j+1] = temp;
	    			count++;
	    		}
	    	}
	    
	    }
		System.out.println("No.of Swap Count is:" +count);
	    System.out.println("After Sorting");
	    for(int a:arr)
	    {
	    	System.out.println(a);
	    }
		}

	}

