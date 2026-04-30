package JavaOOPS;


class Student1 implements Cloneable
{
	int id;
	String name;
    Address address;

Student1(int id, String name, Address address)
{
	this.id = id;
	this.name=name;
	this.address= address;
}


@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}
}
class Address
{
   Address(String city) {
		this.city = city;
	}

   String city;	
   
}
public class ShallowCopy 
{
	
	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("--------------------");
		
		Address address = new Address("Hyderabad");
	
		Student1  s1 = new Student1(1, "Likki",address);
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		//System.out.println(s1.address);//null
		
		System.out.println(s1.address.city);
		System.out.println("----------------------");
		
		
		Student1  s2 = (Student1) s1.clone();
		s2.address.city="macherla";
		System.out.println(s1.address.city);
		System.out.println(s2.address.city);
		
	}

}

