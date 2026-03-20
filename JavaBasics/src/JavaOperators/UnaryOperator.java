package JavaOperators;

public class UnaryOperator {

	public static void main(String[] args) {
		//// int x=0; int result = x++ + ++x - ++x + --x - x-- + x++ +
		/// ++x; System.out.println(result);
//		
		//// int x=1; int y=1; int result = x++ - --y + x++ * ++y + --y - --x + x++ +
		/// y++; System.out.println("x value is: " + x); System.out.println("y value is:
		/// " + y); System.out.println(result);

		int x = 1;
		int y = 1;
		int z = -2;
		int result = (x++ * y++) - z-- + (y * x--) - (--z * y);
		System.out.println("x value is:" + x);
		System.out.println("y value is:" + y);
		System.out.println("z value is:" + z);
		System.out.println(result);

	}

}
