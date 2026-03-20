package JavaConstructor;

import java.util.Scanner;
public class Door {

	public static void main(String[] args) {
		System.out.println("main started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value : ");
		
		
		String mg=sc.next();
		String clg =sc.next();
		Door d=new Door(mg, clg);
	}
	
	Door(String veg) {
		System.out.println("veg");
	}
	
	Door(String non_veg,String veg) {
		System.out.println("non_veg");
	}
		
//	String collegeName;
//	String collegeId;
//	String collegeLocation;
//
//	Door(String collegeName) {
//		this.collegeName = collegeName;
//		System.out.println("One arg cnstructor");
//		System.out.println(this.collegeName);
//	}
//
//	Door(String collegeName, String collegeId) {
//		
//		this.collegeName = collegeName;
//    	this.collegeId=collegeId;
//		System.out.println("two arg constructor");
//		System.out.println(this.collegeName);
//		System.out.println(this.collegeId);
//	}
//
//	Door(String collegeName, String collegeId, String collegeLocation) {
//		this.collegeName = collegeName;
//		this.collegeId = collegeId;
//		this.collegeLocation = collegeLocation;
//		System.out.println("third arg constructor");
//	}
//
//	public static void main(String[] args) {
//		System.out.println("main method started");
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter colloge name : ");
//		String clg =sc.next();
//		Door d = new Door(clg);
//	    System.out.println("*******************************");
//	    
//	    System.out.println("enter your college id");
//	    String id = sc.next();
//	    Door d1 = new Door(id);
//	    System.out.println("*******************************");
//		/*
//		 * System.out.println(d.collegeName); Door d1 = new Door("LMNO", 123);
//		 * System.out.println(d1.collegeName, d1.collegeId); Door d2 = new Door("klm",
//		 * 123, "Nellore"); System.out.println(d2.collegeName,
//		 * d2.collegeId,d2.collegeLocation);
//		 */
//	}
}
