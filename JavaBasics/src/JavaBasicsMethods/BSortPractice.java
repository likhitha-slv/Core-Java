package JavaBasicsMethods;

public class BSortPractice {

	public static void main(String[] args) {
    System.out.println("main method started");
      int[] arr = {8,3,2,9,5,12};
      int temp =0;
      for(int i=0;i<arr.length ;i++)
      {
    	   int minIndex =i;
    	   for(int j = i+1;j<arr.length - 1 ;j++)
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
      System.out.println();
      for(int a : arr)
      {
    	  System.out.println(a);
      }
	}

}
