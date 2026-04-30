package JavaOOPS;

import java.util.Scanner;

public class TestStudent {
	public static void main(String args[])
	{
   Student s1= new Student();
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter student number");
   int sid = sc.nextInt();
   System.out.println("enter the student name");
   String sname = sc.next();
   System.out.println("enter the student marks");
   double marks = sc.nextDouble();
   
   
   s1.setSid(sid);
   System.out.println(s1.getSid());
   
   s1.setSname(sname);
   System.out.println(s1.getSname());
   
   
   s1.setMarks(marks);
   System.out.println(s1.getMarks());
   
   
//   s1.sid = 10;The field Student.sid is not visible
//   s1.sname = "likki";The field Student.sid is not visible
//   s1.marks = 9.2;The field Student.sid is not visible
//   //Accessing the data
//   System.out.println(s1.sid);The field Student.sid is not visible
//   System.out.println(s1.sname);The field Student.sid is not visible
//   System.out.println(s1.marks);The field Student.sid is not visible
}
}