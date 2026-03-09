package JavaBasicsMethods;

public class MethodClass1 {
	// NO ARGUMENT + NO RETURN TYPE
	void addition() {
		short a= 10;
		short b=20;
		System.out.println(a+b);
	}
	
	void subtraction() {
		short a = 3;
		short b = 5;
		System.out.println(a-b);
		
	}
	
	void multiplication() {
		short a=7;
		short b=9;
		System.out.println(a*b);
	}
	
	void division()
	{
		short a=30;
		short b=6;
		System.out.println(a/b);
	}
	void modulus()
	{
		float a=7.9f;
		short b = 7;
		System.out.println(a%b);
	}
	

//	public static void main(String[] args) {
//		System.out.println("Main method Started");
//		MethodClass1 m1 = new MethodClass1();
//		m1.addition();
	
	void main() {
		System.out.println("main method started");
		addition();
		subtraction();
		multiplication();
		division();
		modulus();
	}

}
