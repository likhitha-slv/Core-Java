package JavaBasicsMethods;
// Write a program to calculate two numbers and print the same

// no argument + no return type
public class ClassPractice4 {
	void addition() {
		int a = 10;
		int b = 20;
		System.out.println(a + b);
	}
	
	void subtraction()
	{
		int a = 100;
		int  b=150;
		System.out.println(a-b);
	}
	void multiplication()
	{
		float a= 5000;
		double b = 8705456;
		System.out.println(a*b);
	}
	
	void division()// it gives the quotient value
	{
		int a = 100;
		int b=25;
		System.out.println(a/b);
	}
	
	void modulus()
	{
		int a= 100;
		int b=25;
		System.out.println(a%b);
	}

	void main() {
		System.out.println("main method started");
		addition();
        subtraction();
        multiplication();
        division();
        modulus();
	}

}
