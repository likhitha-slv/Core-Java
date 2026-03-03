package JavaBasicsMethods;

public class ClassPractice2 {

	static char a()
	{
		char a=65;
		return 65;// Type mismatch: cannot convert from int to char

	}
	
	String name;
	
	static ClassPractice2 createClass()
	{
		ClassPractice2 s = new ClassPractice2();
		System.out.println("This is the object class");
		return s;
	}

	public static void main(String[] args)

	{
		ClassPractice2 cp1 = new ClassPractice2();
		cp1.name="Hello";
		System.out.println(cp1.name);
		System.out.println(a());
		createClass();
	}

}
