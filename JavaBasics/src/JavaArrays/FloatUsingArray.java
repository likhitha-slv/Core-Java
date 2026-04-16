package JavaArrays;

public class FloatUsingArray {

	public static void main(String[] args) {
    System.out.println("main method started");
    float[] arr = new float[5];
    arr[0] = 30;
    arr[1] = 45;
    arr[2] = 89;
    arr[3] =124;
    arr[4] = 143;
    
//    for(int f = 0; f< arr.length;f++)
//    {
//    	System.out.println(arr[f]);// printing all the array elements
//    }
    
    System.out.println("*************************");
    
    // Printing the sum of the array elements
    float sum = 0;
//    for(int a = 0;a<arr.length;a++)
//    {
//    	sum = sum + arr[a];
//    }
    
    
    for(float a: arr)
    {
    	sum = sum + a;
    }
    System.out.println(sum);
	}

}
