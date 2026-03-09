package JavaBasicsMethods;
import java.util.Scanner; 
import java.math.BigDecimal;
import java.math.BigInteger;
public class ScannerClass {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		ScannerClass c = new ScannerClass();
		System.out.println("enter the age");
		int ag = sc.nextInt();
		c.getEmployeeAge(ag);
		System.out.println("***************");
		
		System.out.println("enter your first name");
		String fname = sc.next();
		System.out.println("enter your last name");
		String lname = sc.next();
		c.getFname(fname, lname);
		System.out.println("***********************");
		 
		System.out.println("Enter the first decimal value");
		BigDecimal bd = sc.nextBigDecimal();
		System.out.println("enter the second decimal value");
		BigDecimal bd1 = sc.nextBigDecimal();
		c.getMarks(bd, bd1);
		System.out.println("*****************");
		
		System.out.println("enter the first integer number");
		BigInteger bi =sc.nextBigInteger();
		System.out.println("enter the second integer number");
		BigInteger bi1 = sc.nextBigInteger();
		c.getPercent(bi, bi1);
	}
	
	void getEmployeeAge(int age)
	{
		System.out.println("My age is:" + age);
	}
    void getFname(String fname, String lname )
    {
    	System.out.println("the full name of employee" +fname  +lname);
    }
    void getMarks(BigDecimal a, BigDecimal b)
    {
    	System.out.println("The employee marks are:" +a +b);
    }
    void getPercent(BigInteger a, BigInteger b)
    {
    	System.out.println("My big integer values are" +a +b);
    }
}
