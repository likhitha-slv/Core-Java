package JavaConstructor;




class A9
{
	String name= "puppy";
	 A9()
	 {
		 System.out.println("no arg1 called");
	 }

void show()
{
	  System.out.println("show");
}
}
class B9 extends A9
{  
	String name = "Sweety";
	  B9()
	  {
		  System.out.println("No arg2 called" +name);
	  }
 
void show()
{
	  System.out.println("hello" + super.name);
}
}
public class Example {
	
	public static void main(String[] args) {
	   B9 h = new B9();
	   System.out.println(h.name);
	   

	}

	
}
