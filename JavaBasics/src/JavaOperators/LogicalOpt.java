package JavaOperators;

public class LogicalOpt {

	public static void main(String[] args) {
    
      
      System.out.println(true && true);
      System.out.println(true && false);
      System.out.println(false &&  true);
      System.out.println(false && false);
      System.out.println("___________________");
      
      System.out.println(true || true);
      System.out.println(false || true);
      System.out.println(true || false);
      System.out.println(false || false);
      System.out.println(!true);
      System.out.println(!false);
      System.out.println("___________________");
      
      
      int a=10;
      int b=20;
      int c=100;
      //System.out.println(a && b);//The operator && is undefined for the argument type(s) int, int
      System.out.println(a==b && b==c);
      System.out.println(a==b && a==c);
      System.out.println(a>b && a<b);
      System.out.println(a==b && a<b);
      System.out.println(a>b && a==b);
      System.out.println("________________________");
      System.out.println(a>b || a<b);
      System.out.println(a==b || a==c);
      System.out.println(a!=b || a!=c);
      System.out.println(a<c || b>a);
      System.out.println(c>a || c<b);
      System.out.println(!(a==c));
     // System.out.println(! a==c);The operator ! is undefined for the argument type(s) int
      
	}

}
