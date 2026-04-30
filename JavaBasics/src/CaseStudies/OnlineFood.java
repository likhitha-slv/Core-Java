package JavaBasicsMethods;
// Online food delivery system
import java.util.Scanner;

public class OnlineFood {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the price");
		double price = sc.nextDouble();
		System.out.println("enter the quantity" );
		double q = sc.nextDouble();
		
		double a = calculateItem(price, q);
		System.out.println("Amount is"+a);
		System.out.println("enter the gst amount");
		double am = sc.nextDouble();
		
		double c = addGst(a);
		System.out.println("The amount is " +c);
		
		System.out.println("Enter the delivary charges");
		double dc = sc.nextDouble();
		double charges = deliveryCharges(c,dc);
		System.out.println("The delivery charges are" +charges);
		 
        printBill(charges);
        
	}

	static double calculateItem(double price, double quantity) {
		double calItem = price * quantity;
		return calItem;
	}

	static double addGst(double amount) {
		amount += (amount * 0.05);
		return amount;
	}

	static double deliveryCharges(double amount, double dc) {
		
		amount = amount+dc ;
		return amount;
	}

	static void printBill(double finalBill) {
   System.out.println("final bill is" +finalBill);
	}

}
