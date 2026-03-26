package JavaLogicalStatements;

import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
    System.out.println("main method started");
    Scanner sc = new Scanner(System.in);
    double total = 0;
    char Continue = 0;
    
    do
    {
    	System.out.println("------------Shopping Menu--------------");
    	System.out.println("1.Jeans ");
    	System.out.println("2.Shirt");
    	System.out.println("3.Shoes");
    	System.out.println("4.Bag");
    	
    	System.out.println("Choose Item");
    	int choice = sc.nextInt();
    	double price =0;
    	
    	switch(choice)
    	{
    	case 1: 
    		price = 1500;
    		break;
    	case 2:
    		price = 1000;
    		break;
    	case 3: 
    		price = 1300;
    		break;
    	case 4:
    		price = 700; 
    		break;
    	default:
    		System.out.println("Invalid Choice!");
    		continue;
    	}
    	System.out.println("Enter the quantity");
    	int quantity = sc.nextInt();
    	
    	double cost = price * quantity;
    	total = total + cost;
    	
    	System.out.println("Item Cost" + cost);
    	
    	System.out.println("Do u want to add more Items? (y/n):");
    	Continue = sc.next().charAt(0);
    }
    
    while(Continue == 'y' || Continue == 'Y');
    
    double discount = 0;
    
    if( total >= 5000)
    {
    	discount = discount + 0.20;
    }
    else if(total >= 3000)
    {
    	discount = discount * 0.10;
    }
    else if(total >= 1000)
    {
    	discount = discount * 0.05;
    }
    double finalAmount = total - discount;
    
    System.out.println("-----------Bill--------------");
    System.out.println("Total Amount" + total);
    System.out.println("Discount" + discount);
    System.out.println("Final Amount" +finalAmount);
    
    sc.close();
	}

}
