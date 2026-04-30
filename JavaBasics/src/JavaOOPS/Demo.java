package JavaOOPS;


sealed class Vechile permits Car{
	
	String carName="hi";
	
	
	
	void m1() {
		System.out.println("hello");
	}
	
}
non-sealed class Car extends Vechile{
	String carName="hello";
	void m1() {
		carName = super.carName;
		System.out.println(carName);
		System.out.println("hai");
	}
	
}
  class Bike {
	void m1() {
		System.out.println("ela unnaru");
	}
	
	
}

public class Demo {

	public static void main(String[] args) {
		Vechile v=new Car();
		v.m1();
		
		
	}

}
