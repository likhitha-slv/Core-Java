package JavaBasicsMethods;

public class LabTask1 
{  // With return type + No parameter 
/*	int getAge()
	{
	  int a = 10;
	  return a;
	}
    static String getName()
    {
    	String s = "Likhitha";
    	return s;
    }
    
    
    // Without return type + with parameters
    void add(int a, int b)
    {
    	int c=a+b;
    	System.out.println(c);
    }
    void mul(float a, int b)
    {
    	float c=a*b;
    	System.out.println(c);
    }
    
	// Without return type + without parameters
    void salary()
    {
    	int salary = 567899;
    	System.out.println(salary);
    }
    
    void bonus()
    {
    	int bonus = 56999;
    	System.out.println(bonus);
    }
void main()
{
	System.out.println("main method started");
	getAge();
	getName();
	add(10,20);
	mul(3, 5);
	salary();
	bonus();
	System.out.println("My name is :" + getName());
	System.out.println(getAge());
	System.out.println("The name is" +getAge());
}

	
	
}
	
	
	*/
	
	
	
	
	
	

	
	
//	instance method with int return type and with two perameters method creating
	int add(int a, int b) {

		int c = a + b;
		System.out.println("addition result"+c);
		sub(c,20);
		return c;
	}
	int sub(int d, int e)
	{
		int f = d-e;
		System.out.println("sub result"+f);
		mul(f,60);
		return f;
	}
     static float mul(float g, float h)
     {
    	float i = g*h;
    	System.out.println("multiplication result:" + i);
    	div(i,70);
    	return i;
     }
     static double div(double j, float k)
     {
    	 double l = j/k;
    	 System.out.println("division: " +l);
    	 return l;
    }

	void main() {
		System.out.println("Main method started");
		add(10,20);
	}

}
