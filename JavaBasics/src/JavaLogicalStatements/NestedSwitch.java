package JavaLogicalStatements;

import java.util.Scanner;

public class NestedSwitch {

	public static void main(String[] args) {
     System.out.println("Main method started");
     Scanner sc = new Scanner(System.in);
     System.out.println("Welcome to Sreenu's Harbour");
     System.out.println("Enter the category");
     String catg = sc.next();
     float price = 0;
     int quantity;
     switch(catg)
     {
     case "Fish":
    	 System.out.println("Enter the item");
    	 String item = sc.next();
    	 switch(item)
    	 {
    	 case "Tuna":
    		 price = 1000;
    		 System.out.println("Tuna Fish price is 1000 per Kg");
    		 break;
    	 case "Salmon":
    		 price = 1500;
    		 System.out.println("Salmon fish price is 1500 per kg");
    		 break;
    	 case "Pomfret":
    		 price = 500;
    		 System.out.println("Pomfret fish price is 500 per Kg");
    		 break;
    	 case "Vanjaram":
    		 price = 1200;
    		 System.out.println("Vanjaram fish price per kg is 1200 ");
    		 break;
    	 default:
    		 System.out.println("Not Avalilable");
    		 return;
    	 }
    	 
    	 System.out.println("Enter the quantity in kg");
    	 quantity = sc.nextInt();
    	 break;
     case "Prawns":
    	 System.out.println("Enter the Item 1");
    	 String item1 = sc.next();
    	 switch(item1)
    	 {
    	 case "Tiger":
    		 price = 900;
    		 System.out.println("Tiger prawns price is 900 per kg");
    		 break;
    	 case "White":
    		 price = 500;
    		 System.out.println("White prawns price is 500 per kg");
    		 break;
    	 case "Pink":
    		 price = 700;
    		 System.out.println("Pink prawns price is 700 per kg");
    		 break;
    	default:
    		System.out.println("Other Prawns not available");
            return;
    		 
    	 }
    	 
    	 System.out.println("Enter the quantity in kg");
    	 quantity =sc.nextInt();
    	 System.out.println("Total Bill" +(price * quantity));
    	 break;
    	 
    	 default:
    		 System.out.println("You entered category is invalid");
     }
	}

}
