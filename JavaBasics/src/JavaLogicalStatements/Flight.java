package JavaLogicalStatements;


import java.util.Scanner;

public class Flight {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        char cont;

        float totalBill = 0;
        float ticketCost = 0;
        float foodCost = 0;

        
        float ticketPrice = 1000;  
        float snacksPrice = 100;
        float mealPrice = 300;
        float drinksPrice = 80;

        do {
            System.out.println("------- Flight Services Menu ------");
            System.out.println("1. Book Ticket");
            System.out.println("2. Add Food");
            System.out.println("3. View Total Bill");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter number of tickets: ");
                    int n = sc.nextInt();

                    ticketCost = n * ticketPrice;  
                    totalBill = totalBill + ticketCost;

                    System.out.println("Ticket price per person: " + ticketPrice);
                    System.out.println("Ticket Cost: " + ticketCost);
                    break;

                case 2:
                    System.out.println("\n--- Food Menu ---");
                    System.out.println("1. Snacks (₹100)");
                    System.out.println("2. Meal (₹300)");
                    System.out.println("3. Drinks (₹80)");
                    System.out.print("Choose item: ");

                    int foodChoice = sc.nextInt();
                    float foodPrice = 0;

                    switch (foodChoice) {
                        case 1:
                            foodPrice = snacksPrice;
                            System.out.println("Snacks selected");
                            break;
                        case 2:
                            foodPrice = mealPrice;
                            System.out.println("Meal selected");
                            break;
                        case 3:
                            foodPrice = drinksPrice;
                            System.out.println("Drinks selected");
                            break;
                        default:
                            System.out.println("Invalid choice");
                    }

                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();

                    foodCost = foodPrice * qty;
                    totalBill = totalBill + foodCost;

                    System.out.println("Food Cost: " + foodCost);
                    break;

                case 3:
                    System.out.println("\n===== Bill Details =====");
                    System.out.println("Ticket Cost: " + ticketCost);
                    System.out.println("Food Cost: " + foodCost);
                    System.out.println("Total Bill: " + totalBill);
                    break;

                case 4:
                    System.out.println("Thank you for choosing our flight ✈️");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            if (choice != 4) {
                System.out.print("Do you want to continue? (y/n): ");
                cont = sc.next().charAt(0);
            } else {
                cont = 'n';
            }

        } while (cont == 'y');

        sc.close();
    }
}

/*package JavaLogicalStatements;

import java.util.Scanner;

	public class Flight {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int choice;
	        char cont;

	        float totalBill = 0;
	        float ticketCost = 50000;
	        float foodCost = 0;

	        do {
	            System.out.println("\n===== Flight Services Menu =====");
	            System.out.println("1. Book Ticket");
	            System.out.println("2. Add Food");
	            System.out.println("3. View Total Bill");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");

	            choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    System.out.print("Enter number of tickets: ");
	                    int n = sc.nextInt();

	                    System.out.print("Enter price per ticket: ");
	                    float price = sc.nextFloat();

	                    ticketCost = n * price;
	                    totalBill += ticketCost;

	                    System.out.println("Ticket Cost: " + ticketCost);
	                    break;

	                case 2:
	                    System.out.println("\n--- Food Menu ---");
	                    System.out.println("1. Snacks (₹100)");
	                    System.out.println("2. Meal (₹300)");
	                    System.out.println("3. Drinks (₹80)");
	                    System.out.print("Choose item: ");

	                    int foodChoice = sc.nextInt();
	                    float foodPrice = 0;

	                    switch (foodChoice) {
	                        case 1:
	                            foodPrice = 100;
	                            System.out.println("Snacks selected");
	                            break;
	                        case 2:
	                            foodPrice = 300;
	                            System.out.println("Meal selected");
	                            break;
	                        case 3:
	                            foodPrice = 80;
	                            System.out.println("Drinks selected");
	                            break;
	                        default:
	                            System.out.println("Invalid food choice");
	                    }

	                    System.out.print("Enter quantity: ");
	                    int qty = sc.nextInt();

	                    foodCost = foodPrice * qty;
	                    totalBill += foodCost;

	                    System.out.println("Food Cost: " + foodCost);
	                    break;

	                case 3:
	                    System.out.println("\n===== Bill Details =====");
	                    System.out.println("Ticket Cost: " + ticketCost);
	                    System.out.println("Food Cost: " + foodCost);
	                    System.out.println("Total Bill: " + totalBill);
	                    break;

	                case 4:
	                    System.out.println("Thank you for choosing our flight ✈️");
	                    break;

	                default:
	                    System.out.println("Invalid choice!");
	            }

	            if (choice != 4) {
	                System.out.print("Do you want to continue? (y/n): ");
	                cont = sc.next().charAt(0);
	            } else {
	                cont = 'n';
	            }

	        } while (cont == 'y' || cont == 'Y');

	        sc.close();
	    }
	}

	
	
	/*	public static void main(String[] args) {
     System.out.println("Welcome  to Flight Services");
     Scanner sc = new Scanner(System.in);
     System.out.println("Flight Services Menu");
     System.out.println("Book Ticket");
     System.out.println("Cancel Ticket");
     System.out.println("Check Flight Status");
     System.out.println("View Ticket Details");
     System.out.println("Exit");
     float totalBill =0;
     System.out.println("enter your choice");
	 String choice = sc.next();
     
     do {
    	 switch(choice)
    	 {
    	 case "1":
    		 System.out.println("*******My Case1 **********");
    		 float n= sc.nextFloat();
        	 System.out.println("Enter the no.of Flight Tickets" +n);
        	 float price = sc.nextFloat();
        	 System.out.println("The price of the Ticket is" +price);
        	 System.out.println("Total cost is");
        	 float tcost = sc.nextFloat();
        	 tcost = n * price;
        	 totalBill = totalBill + tcost;
        	 System.out.println("My total bill is" +totalBill);
    	 case "2":
    		 System.out.println("Add the Food Menu");
              System.out.println("Snacks");
              int snacks = sc.nextInt();
              
              switch(snacks)
              {
              case 1:
            	  System.out.println("Bisket");
            	  break;
              case 2:
            	  System.out.println("Kurkure");
            	  break;
              }
              System.out.println("Meal is 300");
    		  int meal = sc.nextInt();
    		  switch(meal)
    		  {
    		  case 1:
    			  System.out.println("Rice along with curries");
    			  break;
    		  case 2:
    			  System.out.println("Biryani");
    			  break;
    		  }
    		  System.out.println("Drinks are 80");
    		  int drinks = sc.nextInt();
    		  switch(drinks)
    		  {
    		  case 1:
    			  System.out.println("Cok");
    			  break;
    		  case 2:
    			  System.out.println("sting");
    			  break;
    		  }
    		  System.out.println("How much quantity u want");
    		  int quantity = sc.nextInt();
    		  float fcost = sc.nextFloat();
    		  fcost = price * quantity;
    	 case "3":
            totalBill = fcost + tcost; 
    	 }
    	 System.out.println("Do u want to continue? (y/n)");
    	 choice = sc.nextLine();
      }
     while(choice.equals("y"))
     {
    	 System.out.println("Thank u for choosing our flight");
     }
	}
*/
	

