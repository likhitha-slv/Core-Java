package JavaArrays;

public class SwappingXorWithout3Var {

	public static void main(String[] args) {
     System.out.println("Main method started");
     int a = 10;
     int b = 20;
     System.out.println("Before Swaping");
     System.out.println(a);
     System.out.println(b);
     System.out.println("********************");
     System.out.println("After Swaping");
      a = a ^ b;
      b = a ^ b;
      a = a ^ b;
      System.out.println(a);
      System.out.println(b);
	}

}
