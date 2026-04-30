package JavaArrays;

public class ReverseElement {

	public static void main(String[] args) {
		int[] arr = { 11, 12, 13, 14, 15, 16 };

		
		for (int i = 0; i < arr.length; i++) 
		{
			
			int n = arr[i];
			int rev = 0;
			while (n != 0) {
				int r = n % 10;
				rev = rev * 10 + r;
				n = n / 10;
			}
			arr[i] = rev;

		}
		for(int n1=0;n1<arr.length;n1++)
		{
		System.out.print(arr[n1] +" ");
	    }
	}
}
