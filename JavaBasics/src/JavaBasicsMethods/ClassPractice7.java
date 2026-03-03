package JavaBasicsMethods;

// with argument + no return type
public class ClassPractice7 {

 void main() {
		System.out.println("main method started");
		greet("Sir");
		addition(10,90);
		subtraction(905255555, 10623366);
		multiplication(5,6,9);
		division(100, 50);
		modulus(60,25);
	}
	 static void greet(String wish)
	{
		System.out.println("Good morning"+ wish);
	}
	 void addition(int a, int b)
	 {
		 System.out.println("Adding the values");
		 System.out.println(a+b);
	 }
	 void subtraction(float a, double b)
	 {
		 System.out.println("the subtraction is");
		 System.out.println(a-b);
	 }
	 void multiplication(double a, int b, float c)
	 {
		 System.out.println("multiplication is:");
		 System.out.println(a*b*c);
	 }
	 void division(double a, float b)
	 {
		 System.out.println("the division is");
		 System.out.println(a/b);
	 }
      void modulus(float a, float b)
      {
    	  System.out.println("the modulus is");
    	  System.out.println(a%b);
      }
      
      // int a,b; is good in class level but we can not create in method level
      // void add(int a, b) gives the error
    
}
