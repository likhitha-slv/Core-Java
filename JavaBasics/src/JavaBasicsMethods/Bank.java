package JavaBasicsMethods;

import java.util.*;

public class Bank {
	String name;
	int AccountNo;
	float Balance;
	short pin;

	public static void main(String[] args) {
		Bank b = new Bank();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("My name is" + name);

		System.out.println("enter your account number");
		int account = sc.nextInt();
		System.out.println("My account number is" + account);

		System.out.println("enter your balance");
		float balance = sc.nextFloat();
		System.out.println("My balance is" + balance);

		System.out.println("Enter your pin");
		short pin = sc.nextShort();
		System.out.println("My pin is" + pin);
		b.deposit(balance);
		//b.withdraw(3000f);

		Bank b1 = new Bank();
		System.out.println("Enter the second customer name");
		String name1 = sc.next();
		System.out.println("my name is" + name1);

		System.out.println("enter your account number");
		int account1 = sc.nextInt();
		System.out.println("My account number is" + account1);

		System.out.println("enter your balance");
		float balance1 = sc.nextFloat();
		System.out.println("My balance is" + balance1);

		System.out.println("Enter your pin");
		short pin1 = sc.nextShort();
		System.out.println("My pin is" + pin1);
         b1.withdraw(120.0f);
		b1.deposit(balance1);
		sc.close();

	}

	void deposit(float a) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the deposit amount");
		int dep = s.nextInt();
		float depAm = a + dep;
		System.out.println(depAm);
		//withdraw(depAm);// 10000
	}

	void withdraw(float f) {
		
		float x=8000;
		float result= f - x;
		System.out.println(result);
	}

}
