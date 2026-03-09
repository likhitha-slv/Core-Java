package JavaBasicsMethods;

import java.util.Scanner;

public class LabTask4 
{

	public static void main(String[] args) {
		System.out.println("Main method starteg");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the gender");
        char gender = sc.next().charAt(0);
        System.out.println(gender);
        gender();
	}
	static char gender()
	{
		char gender = 'm';
		return gender;
	}

}
