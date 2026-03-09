package JavaBasicsMethods;
//SRS: Service requirement Specification
interface In1
{
	void method();// abstract method
}
class Student {
	String name;
}

public class ClassObjectMethod {

	public static void main(String[] args) {
		System.out.println("main method started");
		Student s1 = createStudent();
		s1.name = "rakesh";
		System.out.println(s1.name);

	}
  // Factory methods
	static Student createStudent() {
		Student s = new Student();
		return s;
	}

}
