package basics;

public class WrapperObject {

	public static void main(String[] args) {
		int i = 10;
		Integer i1 = i;
		System.out.println(i1);// converting primitive to wrapper is called auto boxing

		Integer i2 = 100;
		int i3 = i2;
		System.out.println(i3);// converting wrapper to primitive is called auto unboxing
		
		boolean b1 = true;
		Boolean b2=b1;
		System.out.println(b2);
        
		
		Boolean b3 = false;
		boolean b4 = b1;
		System.out.println(b4);
		
		Boolean b5 = false;
		boolean b6 = b5;
		System.out.println(b6);
		
		Boolean b8 = false;
		boolean b7 = b1;
		System.out.println(b7);
		
		
	}

}
