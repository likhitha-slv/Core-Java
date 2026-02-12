package basics;

public class Intro 
{
	// static variables
	static int countryId;// declaration
	static String countryName = "india"; // declaration
	// instance variables
	int jerseyNum = 13;
	String cricketerName = "rohit Sharma";
public static void main(String[] args) 
	{
		Intro i = new Intro();
//		System.out.println("Introduction to java architecture");
		System.out.println("Main method started.");

		// representing the static variables
		System.out.println(countryId = 29); // op: 0  --> 91
		System.out.println(countryName); // op: null  --> india
    // accessing the data
		System.out.println(i.jerseyNum);  // op: 0 --> 13
		System.out.println(i.cricketerName); // op: null --> rohit Sharma

	}
}


