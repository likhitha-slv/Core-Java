package CaseStudies;

import java.util.Scanner;

public class BankingApp {
	static Scanner sc = new Scanner(System.in);

	double getCustomerSalary() {
		System.out.println("Enter the salary of the customer");
		double salary = sc.nextDouble();
		return salary;
	}

	int getCustomerAge() {
		System.out.println("enter the customer age");
		int age = sc.nextInt();
		return age;
	}

	int cibilScore() {
		System.out.println("enter the cibil score of the customer");
		int cibil = sc.nextInt();
		return cibil;
	}

	static boolean PhoneNo() {
		System.out.println("enter the mobile number");
		String phoneNo = sc.next();

		return phoneNo.matches("\\d{10}");
	}

	static boolean isValidAadhar() {
		System.out.println("enter the AADHAR number");
		String aadhar = sc.next();
		return aadhar.matches("\\d[12]");
	}

	static boolean isValidPan() {
		System.out.println("enter the PAN number");
		String pan = sc.next();
		return pan.matches("[A-Z]{5}[1-9]{4}[A-Z]");
	}

	String addressOfCustomer() {
		System.out.println("enter the address");
		String address = sc.next();

		System.out.println("enter flat number");
		int flatNo = sc.nextInt();

		System.out.println("enter the plot name");
		String plotN = sc.next();

		System.out.println("enter the street name");
		String street = sc.next();

		System.out.println("Enter the city name");
		String city = sc.next();

		System.out.println("enter the pincode");
		int pincode = sc.nextInt();

		return "Flat No is :" + flatNo + ", Plot No is :" + plotN + ", Street Name :" + street + ", City Name :" + city
				+ ", Pincode :" + pincode;

	}

	public static void main(String[] args) {

		System.out.println("Welcome to SLV Banking Application");
		BankingApp ba = new BankingApp();
		if (ba.getCustomerSalary() > 1000000 && ba.getCustomerAge() > 25 && ba.cibilScore() > 750) {

			PhoneNo();
			isValidAadhar();
			isValidPan();
			ba.addressOfCustomer();

			System.out.println("Congratulations Your Loan is Approved");
		} else {
			System.out.println("Sorry!  your Loan is rejected");
		}

	}

}
