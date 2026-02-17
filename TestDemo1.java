// Problem Statement: 
package basics;

public class TestDemo1 
{    
	static
	{   
		TestDemo1 t = new TestDemo1();
		method1();
		t.method2();
		
		
	}

	public static void main(String[] args) {
		System.out.println("Main method is created");
	}

	static void method1() 
	{
		System.out.println("Static method1 is created");
		TestDemo1.method3();
	}

	void method2() {
		System.out.println("Instance block1 is created");
		method4();
	}

	static void method3()
	{
		System.out.println("Static block 2 created");
	}

	void method4() {
		System.out.println("Instance block 2 created");
	
	}
}
