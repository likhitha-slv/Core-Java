package JavaBasicsMethods;

// no argument + no return type
public class ClassPractice3 {
	void greet() // no return type + no argument
	{
		System.out.println("Good morining");
	}
   static void welcome()
   {
	   System.out.println("Welcome to methods");
   }
	public static void main(String[] args) {
		ClassPractice3 cp3 = new ClassPractice3();
		System.out.println("Main method started");
		cp3.greet();// calling a method
		welcome();
		ClassPractice3.welcome();// Calling with class name
		cp3.welcome();// Calling with object reference value it is not recommended
	}

}
