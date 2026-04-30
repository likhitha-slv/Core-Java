package CaseStudies;

import java.util.Scanner;



public class StudentMarksUsing2D {

	public static void main(String[] args) {
    System.out.println("main method started");
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the no.of students");
    int students = sc.nextInt();
    System.out.println("enter the no.of subjects");
    int subjects = sc.nextInt();

    int[][] arr = new int[students][subjects];
    
 
    for(int i=0;i<students;i++)
    {
     System.out.println("enter the marks of each student" + i);
     for(int j=0;j<subjects;j++)
     {
         
     	arr[i][j] = sc.nextInt();
     }
    }
    //finding the subject wise average
     int total =0;
    for(int j=0;j<subjects;j++)
    {
        
    	for(int i=0;i<students ;i++)
    	{
    	total = total + arr[i][j];
    }
    System.out.println("Total marks are: " + total);
    int avg = total / subjects;

    System.out.println("Average is :" +avg);
   
    
    
    if(avg > 90)
    {
    	System.out.println("Topper Student");
    }
    else
    {
    	System.out.println("Normal Student");
    }
	}
	}
}
