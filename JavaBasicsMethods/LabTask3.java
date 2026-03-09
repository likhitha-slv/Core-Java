package JavaBasicsMethods;

import java.util.Scanner;

public class LabTask3 {

	public static void main(String[] args) {
		LabTask3 lt3 = new LabTask3();
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("I was joined to college in the year of 2021");
		int totalMarks = 180;
		System.out.println(
				"The total marks i got in first sem " + lt3.firstSemMarks(55, 56, 59) + " out of" + totalMarks);
		System.out.println("**********************");
		System.out.println(
				"The total marks i got in second sem " + lt3.secondSemMarks(59, 50, 59) + " out of" + totalMarks);
		System.out.println("****************************");
		double marks = lt3.thirdSemMarks(45, 48, 50);
		System.out.println("The total marks i got in third sem" + marks + "out of" + totalMarks);
		System.out.println("************************");
		byte marks1 = lt3.fourthSem(52, 46, 54);
		System.out.println("The total marks i got in fourth sem " + marks1 + "out of" + totalMarks);
		System.out.println("*************************");
		System.out.println("The total marks i got in fifth sem" + lt3.fifthSem(69, 89, 45) + "out of" + totalMarks);
		System.out.println("**********************");
		System.out.println("The total marks i got in sixth sem" + lt3.sixthSem(56, 52, 49) + "out of" + totalMarks);
		System.out.println("**********************");
		char char1 = lt3.seventhSem('1', '7', '5');// The method seventhSem(char, char, char) in the type LabTask3 is
													// not applicable for the arguments (int, int, int)
		System.out.println(
				"The total marks i got in seventh sem" + lt3.seventhSem('1', '7', '5') + "out of" + totalMarks);
	    sc.close();
	}

	int firstSemMarks(int chem, int physic, int maths) {
		int marks = chem + physic + maths;
		return marks;
	}

	float secondSemMarks(int java, int c, int dbms) {
		float marks = java + c + dbms;
		return marks;

	}

	double thirdSemMarks(float sql, float clan, float ds) {
		float marks = sql + clan + ds;
		return marks;
	}

	byte fourthSem(int i, int j, int k) // this in negative value
	{
		byte marks = (byte) (i + j + k);
		return marks;
	}

	long fifthSem(long eng, long tel, long hin) {
		long marks = eng + tel + hin;
		return marks;
	}

	int sixthSem(int a, int b, int c) {
		int marks = a + b + c;
		return marks;
	}

	char seventhSem(char python, char mySql, char wt) {
		char marks = 'p' + 'm' + 'w';
		return marks;
	}
}
