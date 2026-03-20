package JavaConstructor;

import java.util.*;

public class Car {
	String carName;
	String carColor;
	double carPrice;

//String nc;
// String  cc;
	Car() {
		System.out.println("No-arg called");
	}

	Car(String carName) {
		this.carName = carName;
		// System.out.println("one-arg called");
	}

	Car(String carName, String carColor) {
		this.carName = carName;
		this.carColor = carColor;
	}

	Car(String carName, String carColor, double carPrice) {
		this.carName = carName;
		this.carColor = carColor;
		this.carPrice = carPrice;
	}

	public static void main(String[] args) {
		Car c = new Car();
		Car c1 = new Car("Mercedes-Benz");
		System.out.println(c1.carName);
		Car c12 = new Car("Benz", "White");
		System.out.println(c12.carName + " " + c12.carColor);
		Car c13 = new Car("Benz", "Blue", 6500000);
		System.out.println(c13.carName + " " + c13.carColor + " " + c13.carPrice);
		System.out.println("************************");
		
		System.out.println();
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of the car");
		String nc = sc.next();
        Car c2 = new Car(nc);
		System.out.println(nc);
		System.out.println("***********************");
		System.out.println("enter the color of the car");
		String cc = sc.next();
		Car c21 = new Car(nc, cc);
		System.out.println(nc + " " + cc);
		
		Car c3 = new Car(nc);
		System.out.println("Enter ");

		/*
		 * System.out.println("main method started");
		 *  Scanner sc = new Scanner(System.in); 
		 *  System.out.println("enter the name of the car"); 
		 *  String nc = sc.next(); Car c2 = new Car(nc); System.out.println(c2.nc);
		 * System.out.println("***********************");
		 * System.out.println("enter the color of the car");
		 *  String cc = sc.next(); 
		 *  Car c21 = new Car(nc, cc); //  the error is here is we no need to declare an object reference variable for the local variables .
		 *  here local variable is nc and cc.
		 *  String cc = sc.next(); 
		 *  System.out.println(c21.nc + " " + c21.cc);// null
		 */
	}

}
