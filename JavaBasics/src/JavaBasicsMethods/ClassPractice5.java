package JavaBasicsMethods;

// no argument + with return type
public class ClassPractice5 {
	static {
		System.out.println("Static method");
	}

// Note point is that if we are having the blocks then y we are going with methods?
// The answer is that once we create a block it will execute through out the program and it does not return anything.
// when it comes to the method, when ever we want then we call it then only it will execute.
	public static void main(String[] args) {
		ClassPractice5 c5 = new ClassPractice5();
		System.out.println("main method started");
		System.out.println("the employee age is" + c5.getEmployeeAge());
		System.out.println("the employee salary is" + c5.getSalary());
		System.out.println("the employee bonus is" + c5.getBonus());
		System.out.println("********************");
		double sal = getSalary();
		double bon = getBonus();
		System.out.println("the total salary is" + sal + bon); //the total salary is500000.0100000.0   it does not print 600000,
		//Because "after the string"  it take it as string only. Not a    (String + anything= string)
		System.out.println("the total salary is" + (sal + bon));// 600000 by using BODMAS
		// whenever we d  ont want the methods but i what the result from the method we use return type
		System.out.println("the total salary is" + (getSalary() + getBonus()));
		System.out.println("************");
		c5.getAge();
		System.out.println(c5.getAge());
	}

	int getEmployeeAge() {
		int age = 22;
		return age;
	}
	 static double getSalary()
	{
		double salary = 500000;
		return salary;
	}
    static double getBonus()
    {
    	
    	double bonus= 100000;
    	return bonus;
    }
    int getAge() {
		int age = 22;
		int age1 = 23;
		return age + age1;
	}
}
