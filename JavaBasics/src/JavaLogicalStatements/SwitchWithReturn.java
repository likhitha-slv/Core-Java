package JavaLogicalStatements;

import java.util.Scanner;

public class SwitchWithReturn {
	 static String getDay(String day)
     {
   	  switch(day)
         {
         case "Monday" ->{
       	  return "It ia a Lazy Day";
         }
         case "Tuesday", "Wednesday" ->{
        	 return "It a hectic day";
         }
         case "Thursday", "Friday" ->{
        	 return "It a normal day";
         }
         case "Saturday", "Sunday"->
         {
        	 return "Weekend vibes";
         }
         default ->{
        	 return "Invalid Day";
         }
         
     }
	
     }
	public static void main(String[] args) {
      System.out.println("Main method Started");
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the day");
      String day = sc.next();
      System.out.println(getDay(day));
   
     
	}

}
