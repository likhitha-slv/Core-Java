package JavaArrays;

public class SwappingWith3 {

	public static void main(String[] args) {
    System.out.println("Main method Started");
    int a=70;
    int b=90;
    int temp;
    System.out.println("Before Swapping");
    System.out.println(a);
    System.out.println(b);
    System.out.println("******************");
    System.out.println("After Swapping");
    temp = a ^ b;
    a = temp ^ a;
    b = temp ^ b;
    System.out.println(a);
    System.out.println(b);
	}

}
