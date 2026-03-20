package JavaConstructor;

class GrandParent {
	void show() {
		System.out.println("Grand parent show method called");
		
	}
}

class Parent extends GrandParent {

	void show() {
		System.out.println("Parent show method called");
		super.show();
	}

}

class Child extends Parent {

	void show() {
		System.out.println("Child show method called");
		super.show();
	}

}

public class Driver {

	public static void main(String[] args) {
		Child d = new Child();
		System.out.println("main method called");
		d.show();

	}

}
