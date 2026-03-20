package JavaOperators;

public class ComparisionOpt {

	public static void main(String[] args) {
		int a =10;
		int b = 10;
		System.out.println(a==b);
		
		float a1 = 10;
		double b1 = 10;
		System.out.println(a1==b1);
		
		char c = 'A';
		char c1 = (char)65;
		System.out.println(c==c1);
		
		
		char c2 = 'A';
		char c3 = 65;
		System.out.println(c2==c3);
		
		
		String s="Liki";
		String s1="Liki";
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		
		
		String s2 = new String("Sree");
		String s3 = new String("Sree");
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));

		
		Integer i = 100;
		Integer i1 = 100;
		System.out.println(i == i1);
		
		Integer i2 = 200;
		Integer i3= 200;
		System.out.println(i2 == i3);
		
		System.out.println("***********************");
		
		
		int l =10;
		int k = 10;
		System.out.println(l>k);
		System.out.println(l<k);
		System.out.println(l<=k);
		System.out.println(l>=k);
		
		System.out.println(k>l);
		System.out.println(k>=l);
		System.out.println(k<l);
		System.out.println(k<=l);
		System.out.println("_______________________");
		
		int l1 = 10;
		int k1 = 20;
		int m1 = 10;
		System.out.println(l1=k1);
		System.out.println(l1=k1);
		System.out.println(m1>l1);
		System.out.println(k1>l1);
		System.out.println(k1<=m1);
		System.out.println(l1<= k1);
		System.out.println(l1>= k1);
		System.out.println(k1<m1);
		System.out.println(k1>m1);
		System.out.println(k1<=m1);
		System.out.println(k1>=m1);
		System.out.println(l1!=k1);
		System.out.println(l1!=k1);
	} 

}
