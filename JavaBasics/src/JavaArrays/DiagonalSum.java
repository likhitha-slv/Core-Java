package JavaArrays;

public class DiagonalSum {

	public static void main(String[] args) {
    int[][] arr = {
    		{1,2,7},
    		{4,3,6},
    		{7,6,9}
    		};
    int lsum=0;
    int rsum=0;
    for(int i=0;i<arr.length;i++)
    {
    	
    		lsum = lsum + arr[i][i];
    		rsum=rsum+arr[i][arr.length-1-i];
    	
    }
  
    System.out.println("Diagonal left:" + lsum);
    System.out.println("Diagonal right:" +rsum);
    }
	}

