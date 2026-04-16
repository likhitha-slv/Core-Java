package JavaArrays;

public class SumOfElementsArray {

	public static void main(String[] args) {
    int[][] arr = {{10,13,15},{3,16,9}};
    int sum =0;
    for(int i =0;i<arr.length;i++)
	{
    	for(int j=0;j<arr[i].length;j++)
    	{
    	sum = sum + arr[i][j];
    }
	}
    System.out.println(sum);
	}

}
