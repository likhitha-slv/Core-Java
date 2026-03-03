package basics;

public class AreaOfTriangle 
{
   float height = 6;
   float base = 4;

   
      public static void main(String args[])
      {
    	  AreaOfTriangle q = new AreaOfTriangle();
    	  System.out.println(q.height);
    	  System.out.println(q.base);
    	  float area = (q.base*q.height)*1/2;
    	  System.out.println(area);
      }
     
     
}
