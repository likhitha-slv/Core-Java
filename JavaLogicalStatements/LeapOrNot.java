package JavaLogicalStatements;
import java.util.*;
public class LeapOrNot {

	public static void main(String[] args) {
     System.out.println("Enter the Leap year or not");
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the year");
     int year = sc.nextInt();
     
     if(year % 4 == 0 && year != 100 || year % 400 == 0)
     {
    	 System.out.println("It is a leap year");
     }
     else
     {
    	 System.out.println("not a leap year");
     }
     
     
     
     
     
   /*  switch(year)
     {
     case 2100:
    	 System.out.println("It is a leap year");
    	 break;
     case 1900:
    	 System.out.println("It is not a leap" );
    	 break;
     case 2400:
    	 System.out.println("It is aleap year");
    	 break;
      default:
    	  System.out.println("Not available");
     }
     */
	}

}
