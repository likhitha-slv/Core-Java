package basics;

public class TestDemo {
    static int  a=0; // static can be used for directly
	static
	{
		System.out.println("static");
	}
	{
	  a=a+1;
	  //System.out.println(a);  // If we write the print statement in the instance block then the out put can be counted in each time and give the out put as 1 2 3 4.
	}
	
	public static void main(String[] args) 
	{
		TestDemo t = new TestDemo();
		TestDemo t1 = new TestDemo();
		TestDemo t2 = new TestDemo();
		TestDemo t3 = new TestDemo();
		System.out.println(a); // If we the println statement in the main method then the output give as total count.
		
	}

}
