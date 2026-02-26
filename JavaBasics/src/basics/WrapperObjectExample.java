package basics;

public class WrapperObjectExample {

	public static void main(String[] args) {
	int i = 10; // This is primitive data type
	Integer i1 = i; // Conversion of primitive to wrapper is called Auto boxing.
	System.out.println(i);
	
     Integer i2 = 19; // this is wrapper object
     int i3 = i2;  //Conversion of Wrapper to Primitive is called Auto-Unboxing.
     System.out.println(i3);
     
     
//     NOTE:
//     The auto-boxing and unboxing can be done when the object data types is same only.
//     Like int-Integer, byte-Byte, char- Character .... etc.
     
     
	}

}
