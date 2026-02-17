//The Task is if the persons has 100 rs and he want to buy a pencil with the cost of 7rs. 
//How many pencils he can buy with the cost and dispaly the output as remaining amount
package basics;

  public class TestDemo5 
{

	public static void main(String[] args) 
	{
		int a=100;
		int b = 7;
		int c = a/b;
		System.out.println("The no.of pencils he buy:" +c);
  
		 int d = a - b* c;
		 System.out.println("The remaining balance is:" + d);
		 
	}

}
