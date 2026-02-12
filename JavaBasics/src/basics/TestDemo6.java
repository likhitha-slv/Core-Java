//print the student detailsalong with average and sum 
package basics;

public class TestDemo6 {
	String name;
	int id;
	int age;
	char gender;
	int telugu;
	int hindi;
	int eng;
	int maths;

	void marks() {
		System.out.println("marks");
		int sum = telugu + hindi + eng + maths;
		System.out.println("Display the sum:" + sum);

		int avg = (telugu + hindi + eng + maths) / 4;
		System.out.println("display the average" + avg);

//		sum = telugu + hindi + eng + maths;
//		System.out.println("Display the sum:" + sum);
//
//		avg = (telugu + hindi + eng + maths) / 4;
//		System.out.println("display the average" + avg);
	}

	public static void main(String[] args) {
		TestDemo6 t6 = new TestDemo6();
		System.out.println("First student details");
		t6.name = "Likki";

		t6.id = 10;

		t6.age = 20;

		t6.gender = 'f';
		t6.telugu = 80;

		System.out.println(t6.telugu);

		t6.hindi = 85;

		System.out.println(t6.hindi);

		t6.eng = 90;

		System.out.println(t6.eng);

		t6.maths = 95;

		System.out.println(t6.maths);
		t6.marks();

		TestDemo6 t7 = new TestDemo6();
		System.out.println("second student details");
		t7.name = "Lokki";

		t7.id = 11;

		t7.age = 18;

		t7.gender = 'f';
		t7.telugu = 58;

		System.out.println(t7.telugu);

		t7.hindi = 85;

		System.out.println(t7.hindi);

		t7.eng = 90;

		System.out.println(t7.eng);

		t7.maths = 95;

		System.out.println(t7.maths);

		t7.marks();

	}
}
