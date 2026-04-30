package CaseStudies;

import java.util.*;

public class OnlineFoodOrderingSystem {

	static Scanner sc = new Scanner(System.in);

	int orderId;
	String customerName;
	String foodItem;
	int quantity;
	double price;
	double total;

	OnlineFoodOrderingSystem() {
		System.out.println("Enter the order id");
		int orderId = sc.nextInt();
		this(orderId);
	}

	OnlineFoodOrderingSystem(int orderId) {

		System.out.println("Enter the customer name");
		String cName = sc.next();

		this(orderId, cName);

	}

	OnlineFoodOrderingSystem(int orderId, String customerName) {
		System.out.println("Enter the food item");
		String fItem = sc.next();
		this(orderId, customerName, fItem);
	}

	OnlineFoodOrderingSystem(int orderId, String customerName, String foodItem) {
		System.out.println("Enter the quantity");
		int quantity = sc.nextInt();

		this(orderId, customerName, foodItem, quantity);
	}

	OnlineFoodOrderingSystem(int orderId, String customerName, String foodItem, int quantity) {
		System.out.println("Enter the price");
		double price = sc.nextDouble();

		this(orderId, customerName, foodItem, quantity, price);
	}

	OnlineFoodOrderingSystem(int orderId, String customerName, String foodItem, int quantity, double price) {
		this.orderId = orderId;
		this.customerName = customerName;
		this.foodItem = foodItem;
		this.quantity = quantity;
		this.price = price;
		this.total = quantity * price;
	}

	void display() {
		System.out.println("Order Id: " + orderId);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Food Item: " + foodItem);
		System.out.println("Quantity: " + quantity);
		System.out.println("Price: " + price);
		System.out.println("Total: " + total);
	}

	void calculateBill(double discount) {
		double discountAmt = (discount / 100) * total;
		total = total - discountAmt;
	}

	double addExtraItem(String extraItem, double extraPrice) {
		System.out.println("enter the extra item");
		this.foodItem = foodItem + " + " + extraItem;
		System.out.println("enter the extra price");
		return this.price = price + extraPrice;
	}

	void displayOrder() {
		System.out.println("the order id placed");
	}

	public static void main(String[] args) {
		System.out.println("Main method started");

		OnlineFoodOrderingSystem ofo = new OnlineFoodOrderingSystem();

		System.out.println("enter the discount");
		double discount = sc.nextDouble();

		ofo.calculateBill(discount);
		ofo.display();
		ofo.displayOrder();
	}
}
