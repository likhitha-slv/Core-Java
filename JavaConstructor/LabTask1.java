package JavaConstructor;

public class LabTask1 {
	String name;
	String rollno;
	int marks;

	LabTask1(String name, String rollno, int marks) {
		System.out.println("parameterized constructor called");
		this.name = "Likhitha";
		this.rollno = "G1";
		this.marks = 98;
	}

	LabTask1() {
		System.out.println("parameterized constructor called");
		this.name = "latha";
		this.rollno = "h2";
		this.marks = 55;
	}

	public static void main(String[] args) {
		LabTask1 lt1 = new LabTask1();
		lt1.result();
		System.out.println("main method started");
		LabTask1 lt2 = new LabTask1("Lakhitha", "G1", 98);
		lt2.result();

		LabTask1 lt3 = new LabTask1("lalitha", "g2", 78);
	}

	void result() {
		System.out.println("My name is" + name);
		System.out.println("My rollno is" + rollno);
		System.out.println("My marks are" + marks);
	}

}
