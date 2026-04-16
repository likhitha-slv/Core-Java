package JavaArrays;

public class InsertionSort {

	public static void main(String[] args) {
     int[] arr = {4,2,1,3};
     int temp;
     int j;
     for(int i=1;i<arr.length;i++) {
    	 temp = arr[i];
    	 j=i;
    	 while(j>0 && arr[j-1]>temp)
    	 {
    		 arr[j] = arr[j-1];
    		 j= j-1;
    	 }
    	 arr[j] = temp;
     }
     for(int a:arr)
     {
    	 System.out.print(a +  " ");
     }
	}

}
