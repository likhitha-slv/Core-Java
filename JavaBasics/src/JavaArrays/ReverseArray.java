package JavaArrays;

public class ReverseArray {

	public static void main(String[] args) {
    int[] ord = {10,30,29,15,43};
    for(int i=ord.length - 1;i>=0;i--)// Here if u dont give the  length - 1 it shows expeption
    {
    System.out.println(ord[i] + " ");
    }
	}

}
