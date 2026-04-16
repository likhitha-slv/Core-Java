package JavaArrays;

public class SwappingWithOut3Var {

	public static void main(String[] args) {
    System.out.println("Main method started");
    int a=10;
    int b=20;
    System.out.println("Before Swapping");
    System.out.println(a);
    System.out.println(b);
    System.out.println("******************");
    System.out.println("After Swapping");
    a = a+b;
    b = a-b;
    a = a-b;
    System.out.println(a);
    System.out.println(b);
	}

}
