package JavaArrays;

public class TwoDArrays1 {

	public static void main(String[] args) {
    int[][] arr = new int[2][3];
    arr[0][0] = 100;
    arr[0][1] = 101;
    arr[0][2] = 102;
 
//   System.out.println("********************");
    arr[1][0] = 103;
    arr[1][1] = 104;
    arr[1][2] = 105;
    System.out.println(arr[0][0]);
    System.out.println(arr[0][1]);
    System.out.println(arr[0][2]);
    System.out.println(arr[1][0]);
    System.out.println(arr[1][1]);
    System.out.println(arr[1][2]);
    
    System.out.println("************************");
    for(int i =0;i<arr.length;i++)
    {
    	for(int j=0;j<arr[i].length;j++)
    	{
    		System.out.println(arr[i][j]);
    	}
    }
    System.out.println("********************************");
    //for each loop
    for(int n[]:arr)  
    {
    	for(int a:n)
    	{
    		System.out.println(a);
    	}
    }
    System.out.println("********************************************");
    
	}

}
