package basics;

public class LiteralsExample
{


	public static void main(String[] args) {
		

		
		 int a =10;
		 System.out.println(a);
		 int a1= 234;
		 System.out.println(a1);
		 int a2 = 0123;
		 System.out.println(a2);
		 //int a3 = 027897;// The literal 027897 of type int is out of range
		 int a3 = 0x1a1b1c;
		 System.out.println(a3);
		 int a4=0b1011;
		 System.out.println(a4);
		 System.out.println();
		 
		 float f1 = 10;
		 System.out.println(f1);
		 float f2 = 123.5F;
		 System.out.println(f2);
		 float f3 = 0123;
		 System.out.println(f3);
		 float f4 = 0x123;
		 System.out.println(f4);
//       float f5 = 0x123.5; Invalid hex literal number
//		 float f6 = 0x123.5f;Invalid hex literal number
		 
		 //float f7 = 123.4;//Type mismatch: cannot convert from double to float
		 float f8 = 0x123f;
		 System.out.println(f8);
		 float f9 = 1234.8f;
		 System.out.println(f9);
		 System.out.println();
		 System.out.println();
		 
		 double d = 123;
		 System.out.println(d);
		 double d1 = 123.6;
		 System.out.println(d1);
		 double d2 = 0x123;
		 System.out.println(d2);
		 double d3 = 0123;
		 System.out.println(d3);
		 double d4 = 0b1011;
		 System.out.println(d4);
//	     double d5 = 0x1234.5d;Invalid hex literal number
//		 double d6 = 0x234.6;Invalid hex literal number
//		 System.out.println(d6);
//		 double d7 = 0x123.5f;Invalid hex literal number
	}

}
