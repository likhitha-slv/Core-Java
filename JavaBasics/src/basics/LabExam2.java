package basics;

public class LabExam2 {
	static int totalEmployees;
	static {
		System.out.println("Company Started");
		totalEmployees = 0;
	}
	{
		System.out.println("New Employee joining");
		totalEmployees++;
	}

	static int getTotalEmployeeNumber() {
		return totalEmployees;
	}

	public void displayEmployeeNumber() {
		System.out.println("this is employee number" + totalEmployees);
//     	totalEmployees = totalEmployees + 1;
	}

	public static void main(String[] args) {
		LabExam2 le = new LabExam2();
		le.displayEmployeeNumber();
//		System.out.println("total Employees");

		LabExam2 le1 = new LabExam2();
		le1.displayEmployeeNumber();
		System.out.println("total Employees are " + totalEmployees);

	}

}
