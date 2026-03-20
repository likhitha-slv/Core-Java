package JavaConstructor;
import java.util.*;
class Vehicle3
{
	String brand;
	Vehicle3(String brand)
	{
		this.brand=brand;
	}
	
	void start()
	{
		System.out.println("car started");
	}
}

class Car3 extends Vehicle3
{
	String model;
	double price;
	Car3(String brand, String model,double price)
	{
		super(brand);
		this.model = model;
		this.price=price;
		super.start();
	}
	
	void start()
	{
		System.out.println("Car started");
	}
}

class Car4 extends Vehicle3
{
	String model;
	double price;
	Car4(String brand, String model,double price)
	{
		super(brand);
		this.model = model;
		this.price=price;
		super.start();
	}
	
	void start()
	{
		System.out.println("Car started");
	}
}
public class Driver1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Car3 c = new Car3("Mercedez", "M20", 500000);
		
		Car4 c1=new Car4("tata", "data", 78887);
		

	}

}
