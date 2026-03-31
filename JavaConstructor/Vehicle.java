package JavaConstructor;

public class Vehicle {
	String brand;

	Vehicle(String brand) {
		this.brand = brand;
	}
}

class Car1 extends Vehicle {
	String name;
	String model;
	long price;

	Car1(String brand, String name, String model, long price) {
		super(brand);
		this.name = name;
		this.model = model;
		this.price = price;

	}

}

class ElectricCar extends Car1 {
	double capacity;

	ElectricCar(String brand, String name, String model, long price, double capacity) {
		super(brand, name, model, price);
		this.capacity = capacity;

	}

	

	public static void main(String[] args) {
		System.out.println("main method called");
		ElectricCar ec = new ElectricCar("mercedez", "Likki", "vy20", 400000l, 59);
		ec.show();
	}
	
	
	void show()
	{
		System.out.println("My brand name is" +brand);
		System.out.println("My name is " +name);
		System.out.println("my model is" +model);
		System.out.println("my vehicle price is" +price);
		System.out.println("my car capacity is " +capacity);
	}

}
