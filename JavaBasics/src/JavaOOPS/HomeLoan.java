package JavaOOPS;

import CaseStudies.BankingApp;
public class HomeLoan extends Loan{

	public static void main(String[] args) {
		System.out.println("Welcome to SLV Home Loan Application");
		HomeLoan hl = new HomeLoan();
		if(hl.getCustomerSalary() > 1000000 && 
				hl.getCustomerAge() > 25 && 
				hl.cibilScore() > 750)
		{
			
			PhoneNo();
			isValidAadhar();
			isValidPan();
			hl.addressOfCustomer();
			
			System.out.println("Congratulations Your Home Loan is Approved");
		}
		else 
		{
			System.out.println("Sorry!  your Home Loan is rejected");
		}
	}

}
