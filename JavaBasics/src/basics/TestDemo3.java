// GARBAGE COLLECTION//
package basics;
				
public class TestDemo3 
{
	// step3: object inside a method
  static void method()
  {
	  System.out.println("method started");
	  TestDemo3 t11= new TestDemo3();
	  System.out.println(t11);
  
  }
  @Override
  protected void finalize() throws Throwable {
      System.out.println("finalize() called for object");
  }
  public static void main(String[] args) {
		// TODO Auto-generated method stub
       TestDemo3 t = new TestDemo3();// @2b2fa4f7  address
       System.out.println(t);
       TestDemo3 t1 = new TestDemo3(); // @1dbd16a6
       System.out.println(t1);
       TestDemo3 t2 = new TestDemo3();// @7ad041f3
       System.out.println(t2);
       TestDemo3 t3 = new TestDemo3();  //@251a69d7
       System.out.println(t3);
       TestDemo3 t4 = new TestDemo3(); // 7344699f
       System.out.println(t4);
   // step1:If the output becomes null it is called nullifying
       t=null;
       System.out.println(t);
       
   // step2:Re- assign the object
       t1 = t3;
       System.out.println(t1);
 	  method();
      // step4: anonymous object
 	  new TestDemo3();
 	  
       System.gc();
      
	}

}
