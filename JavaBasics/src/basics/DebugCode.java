package basics;

public class DebugCode 
{
	void method3()
	{
		System.out.println("method 3 called");
	}
  void method1()
  {
	  System.out.println("Method1 called");
	  method2();
  }
  void method2()
  {
	  System.out.println("Method2 started");
	  method3();
	  method5();
  }
  void method4()
  {
	  System.out.println("method4 called");
  }
  void method5()
  {
	  System.out.println("method5 called");
	  method4();
  }
	public static void main(String[] args)
	{
		System.out.println("main method started");
		DebugCode dc = new DebugCode();
		dc.method1();

	}

}
