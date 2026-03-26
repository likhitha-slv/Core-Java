package JavaConstructor;

//College Details
//Create a class College.
//Store college name and location.
//Use constructor overloading and this keyword.
import java.util.*;
class College {
	String cName;
	String location;

	College(String cName) {
		this.cName = cName;
	}

	College(String cName, String location) {
		this.cName = cName;
		this.location = location;

	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name of the college");// sree vidyanikethan engineering college // sree
		String d = sc.next();
		College c = new College(d);
		System.out.println(c.cName);
		
		System.out.println("enter the location of the college");
		String l = sc.next();
		College c1 = new College(d,l);
		System.out.println(c.cName+ " " +c1.location);

	}

}
