package JavaConstructor;

//Average of the all the subjects using constructor
public class StudentDetails {
	String sname;
	int emarks;
	int smarks;
	int scmarks;
	String branch;
	StudentDetails(String sname, int emarks, int smarks, int scmarks,String branch )
	{
		this.sname= sname;
		this.emarks=emarks;
		this.smarks = smarks;
		this.scmarks=scmarks;
		this.branch=branch;
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		StudentDetails sd = new StudentDetails("Likki", 89, 98, 87,"Cse");
		sd.average();
		System.out.println("-----------------------------------");
		
		StudentDetails sd1 = new StudentDetails("Lalli", 89,56,98,"Cse");
		sd1.average();
		System.out.println("---------------------------------------");
		StudentDetails sd2 = new StudentDetails("halli", 55,89,97,"cse");
		sd2.average();

	}

	void average() {
		int avg = emarks + smarks + scmarks;
		System.out.println("The average marks are" +avg);
		int total = avg/3;
		System.out.println("the total marks are" +total);
	}

}
