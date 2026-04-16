package JavaArrays;

public class CountEvenOrOdd {

	public static void main(String[] args) {
     System.out.println("main method started");
     int[] arr = {1,2,3,2,4,5};
     int evenCount= 0;
     int oddCount = 0;
     for(int i=0;i<arr.length;i++)
     {
    	 
    	 if(arr[i] % 2 == 0)
    	 {
    		 evenCount++;
    	 }
    	 else
    	 {
    		 oddCount++;
    	 }
     }
	 System.out.println("Even number count is:" +evenCount);
	 System.out.println("odd number count is:" +oddCount);
	}

}
