package JavaOOPS;

public class Employee {

	int id;
	String name;
	Address1 address1;

	Employee(int id, String name, Address1 address1) {
		this.id = id;
		this.name = name;
		this.address1 = address1;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public static void main(String[] args) {
		Address1 address1 = new Address1("Software");
		Employee ee = new Employee(1, "Likhitha", address1);
		System.out.println(ee.id);
		System.out.println(ee.name);
		System.out.println(ee.address1.job);
		
		System.out.println("--------------------------");
		
		ee.address1.job = "Java Full Stack Engineer";
		Employee e1 = new Employee(1, "Lokaksha", address1);
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(ee.address1.job);
		System.out.println(e1.address1.job);
		
		
	}
}

class Address1{
	String job;

	Address1(String job) {
		this.job = job;
	}

}
