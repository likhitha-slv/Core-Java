package JavaArrays;

public class EvenNumArray {

	public static void main(String[] args) {
    int[][] arr = {{10,25,31},{40,55,60}};
    for(int i=0;i<arr.length;i++)
    {
    	for(int j=0;j<arr[i].length;j++)
    	{
    		if(arr[i][j] % 2 == 0)
    		{
    			System.out.println("Even" + arr[i][j]);
    		}
    		else
    		{
    			System.out.println("Odd" +arr[i][j]);
    		}
    	}
    }
	}

}
