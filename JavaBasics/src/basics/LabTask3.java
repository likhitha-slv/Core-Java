package basics;

public class LabTask3 {

	public static void main(String args[]) {
		LabTask3 l3 = new LabTask3();

		int n = 6688;

		System.out.println("----Actual Ammount( " + n + " )------");
		System.out.println();

//		---------20000----------
		int TwoThousand = n / 2000;
		System.out.println("Two Thousends(2000) : " + TwoThousand);
		n = n - TwoThousand * 2000;
		System.out.println("Remaining Ammount : " + n);
		System.out.println();

//		----------------500------------------
		int fiveHundred = n / 500;
		System.out.println("Five Hundreds(500) : " + fiveHundred);
		n = n - fiveHundred * 500;
		System.out.println("Remaining Ammount : " + n);
		System.out.println();

//		----------200------------
		int twoHundred = n / 200;
		System.out.println("Two Hundreds(200) : " + twoHundred);
		n = n - twoHundred * 200;
		System.out.println("Remaining Ammount : " + n);
		System.out.println();

//		----------100------------
		int oneHundred = n / 100;
		System.out.println("one Hundreds(100) : " + oneHundred);
		n = n - oneHundred * 100;
		System.out.println("Remaining Ammount : " + n);
		System.out.println();

//		----------50------------
		int fifty = n / 50;
		System.out.println("Fifty(50) : " + fifty);
		n = n - fifty * 50;
		System.out.println("Remaining Ammount : " + n);
		System.out.println();

//		----------20------------
		int twenty = n / 20;
		System.out.println("twenty(20) : " + twenty);
		n = n - twenty * 20;
		System.out.println("Remaining Ammount : " + n);
		System.out.println();

//		----------10------------
		int ten = n / 10;
		System.out.println("ten (100) : " + ten );
		n = n - ten  * 10;
		System.out.println("Remaining Ammount : " + n);
		System.out.println();

//		----------5------------
		int five = n / 5;
		System.out.println("five(5) : " + five);
		n = n - five * 5;
		System.out.println("Remaining Ammount : " + n);
		System.out.println();

//		----------2------------
		int two = n / 2;
		System.out.println(" two(2) : " +  two);
		n = n -  two * 2;
		System.out.println("Remaining Ammount : " + n);
		System.out.println();

//		----------1------------
		int one = n / 1;
		System.out.println("one(1) : " + one);
		n = n - one* 1;
		System.out.println("Remaining Ammount : " + n);
		System.out.println();

	}
}

/*
 * public static void main(String[] args) { int thousend =a/1000; a=a%1000; int
 * hundred=a/100; a=a%100; int tens=a/10; a=a%10; int ones=a/1;
 * 
 * 
 * System.out.println("1000 -> "+thousend);
 * System.out.println("100 -> "+hundred); System.out.println("10 ->" +tens);
 * System.out.println(ones);
 */
