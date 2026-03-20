package JavaOperators;
import java.util.*;
public class LabTask2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		
		if((n&1)==0)
		{
			System.out.println("Even AND");
		}
		else
		{
			System.out.println("Odd AND");
		}
		
		if((n|1) ==0)
		{
			System.out.println("Even OR");
		}
		else
		{
			System.out.println("Odd OR");
		}
		if((n^1) == 0)
		{
			System.out.println("Even XOR");
		}
		else
		{
			System.out.println("Odd XOR");
		}
		System.out.println("---------------------------");
		
		if((n & 2) ==0)
		{
			System.out.println("Even AND");
		}
		else
		{
			System.out.println("Odd AND");
		}
		if((n|2) == 0)
		{
			System.out.println("Even OR");
		}
		else
		{
			System.out.println("Odd OR");
		}
		if((n^2)==0)
		{
			System.out.println("Even XOR");
		}
		else
		{
			System.out.println("Odd XOR");
		}
	}
}
