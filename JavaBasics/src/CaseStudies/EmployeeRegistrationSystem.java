package CaseStudies;

import java.util.Scanner;

public class EmployeeRegistrationSystem 
{
	static Scanner sc = new Scanner(System.in);
 String getEmployeeName()
{
	System.out.println("Enter the Employee name");
	String eName = sc.next();
	return eName;
	
}

int getEmployeeAge()
{
	System.out.println("Enter the Employee Age");
	int eAge = sc.nextInt();
	
//	if(eAge<18) {
//		System.out.println("your not eligible..!");
//		return 0;
//	}else {
//		return eAge;
//	}
	return eAge;
}

double getEmployeeSal()
{
	System.out.println("Enter the Employee Salary");
	double salary = sc.nextDouble();
	return salary;
}
static boolean getEmail()
{
	System.out.println("enter the mail of the employee");;
	String email = sc.next();
	return email.matches("[a-z]{5,25}@[a-z]+.com");
}
static boolean getPhone() 
{
     System.out.println("enter the phone number of the employee");
     String phone = sc.next();
     return phone.matches("[6-9]{1}[1-9]{9}");
}
static boolean getPan()
{
	System.out.println("enter the PAN Number of the Employee");
	String pan = sc.next();
	return pan.matches("[a-z]{5}[1-9]{4}[a-z]{1}");
}
	public static void main(String[] args) 
	{
		System.out.println("Welcome to the SLV Company");
		EmployeeRegistrationSystem ers = new EmployeeRegistrationSystem();
		ers.getEmployeeName();
		int age =ers.getEmployeeAge();
		double sal= ers.getEmployeeSal();
		if(age >= 18 && sal > 0)
		{
			getEmail();
			getPhone();
			getPan();
			System.out.println("Employee Details Successfully Submitted");
		}
		else
		{
			System.out.println("SEE U SOON");
		}
	}

}
