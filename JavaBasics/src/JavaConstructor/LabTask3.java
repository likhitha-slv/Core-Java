package JavaConstructor;

class LabTask3 {
	LabTask3(int x) {
        System.out.println("A");
    }
}

class B8 extends LabTask3{

    B8() {
        super(10);   
        System.out.println("B");
    }

    public static void main(String[] args) {
        B8 obj = new B8();
    }
}