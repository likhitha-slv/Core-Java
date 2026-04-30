package JavaOOPS;

import CaseStudies.BankingApp;

class GoldLoan extends Loan 
{

	public static void main(String[] args) {
		System.out.println("Welcome to SLV Gold Loan Application");
		GoldLoan gl = new GoldLoan();
		if(gl.getCustomerSalary() > 1000000 && 
				gl.getCustomerAge() > 25 && 
				gl.cibilScore() > 750)
		{
			
			PhoneNo();
			isValidAadhar();
			isValidPan();
			gl.addressOfCustomer();
			
			System.out.println("Congratulations Your Gold Loan is Approved");
		}
		else 
		{
			System.out.println("Sorry!  your Gold Loan is rejected");
		}
		
	}

}
