package basics;

public class TestDemo2 
{
     static TestDemo2 t = new TestDemo2();
       static 
       {
    	   hello();
    	   t.hello3();
       }

   
	public static void main(String[] args) 
	{
	System.out.println("Main method started");
	}
	static void hello()
	{
		System.out.println("Static method1 created");
		hello1();
	}
    static void hello1()
    {
    	System.out.println("Static method2 created");
    }
    void hello3()
    {
    	System.out.println("Instance method1 created");
    	hello4();
    }
    void hello4()
    {
    	System.out.println("Instance method2 created");
    }
}