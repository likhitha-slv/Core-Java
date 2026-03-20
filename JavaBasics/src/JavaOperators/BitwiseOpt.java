package JavaOperators;

public class BitwiseOpt {

	public static void main(String[] args) {
    
		int a=10;
		int b=10;
		int c=20;
		System.out.println(a==b & a!=c);
		System.out.println(a==b & a==c);
		System.out.println( 72 & 20);
		System.out.println(72 & 4);
		System.out.println(72 & 10);
		System.out.println(36 & 4);
		System.out.println(65 & 6);
		System.out.println(24 & 3);
		System.out.println("*******************");
		System.out.println( 72 | 20);
		System.out.println(72 | 4);
		System.out.println(72 | 10);
		System.out.println(36 | 4);
		System.out.println(65 | 6);
		System.out.println(24 | 3);
//		System.out.println(72 ~ 10);//The left-hand side of an assignment must be a variable
		
		System.out.println(~10);
		System.out.println(~11);
		System.out.println(~(-11));
	//	System.out.println(^11);Syntax error on token "^", delete this token
		
		System.out.println(2^6);
	}

}
