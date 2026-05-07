package JavaOOPSInheritance;

class Account {
	int id;
	double balance;
	String time;

	void salary() {
	}

	Account(int id, double balance, String time) {
		this.id = id;
		this.balance = balance;
		this.time = time;
	}

	void dis() {
		System.out.println("Current Account Id: " + id);
		System.out.println("Current Account Balance: " + balance);
		System.out.println("Current Account Time: " + time);
	}
}

class CurrentAccount extends Account {
	public String interest1;

	@Override
	void salary() {
		double interest = 0.02;
		System.out.println("Current Account Interest : " + interest);
		interest = balance * interest;
		System.out.println("current account interest: " + interest);
	}

	CurrentAccount(int id, double balance, String time) {
		super(id, balance, time);
	}
}

class SavingAccount extends Account {
	void salary() {
		double interest = 0.06;
		System.out.println("Saving Account Interest: " + interest);
		interest = balance * interest;

		System.out.println(" Savings account interest: " + interest);
	}

	SavingAccount(int id, double balance, String time) {
		super(id, balance, time);
	}
}

public class Bank {

	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount(1, 100000, "12PM");

		sa.dis();
		sa.salary();
		System.out.println("----------------------");

		CurrentAccount ca = new CurrentAccount(2, 200000, "1PM");

		ca.dis();
		ca.salary();

	}

}
