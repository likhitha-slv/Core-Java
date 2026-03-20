package JavaLogicalStatements;
import java.util.*;
public class ClassPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
      int a = sc.nextInt();
   /*  if(a >=10)
     {
    	 System.out.println("age");// the output is alwyas if block.
     }
     else if(a >= 25)
     {
    	 System.out.println("gage");
     }
     else if(a >= 35)
     {
    	 System.out.println("rage");
     }
     else if(a >= 60)
     {
    	 System.out.println("tage");
     }
     else
     {
    	 System.out.println("lage");
     }
     */
     
      // in this it will check the all the condition until the condition is true.
     
     if(a<=10)
     {
    	 System.out.println("age");
     }
     else if(a <=25)
     {
    	 System.out.println("gage");
     }
     else if(a <= 35)
     {
    	 System.out.println("rage");
     }
     else if(a <= 60)
     {
    	 System.out.println("tage");
     }
     else
     {
    	 System.out.println("lage");
     }
	}

}
