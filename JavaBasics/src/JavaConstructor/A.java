package JavaConstructor;

class B {
	B() {
		System.out.println("1");
	}
}

class A extends B {
	A() {
		this(5);
		System.out.println("2");
	}

	A(int x) {
		System.out.println("3");
	}

	public static void main(String[] args) {
		A b = new A();
	}
}
