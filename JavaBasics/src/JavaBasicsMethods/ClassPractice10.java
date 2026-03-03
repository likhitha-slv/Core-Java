package JavaBasicsMethods;
class Employee
{
	String name="wish u";
}
public class ClassPractice10 {

	public static void main(String[] args) {
  System.out.println("main method started");
  Employee e = new Employee();
  System.out.println(e.name);
  getEmployee(e);
	}
   static void getEmployee(Employee e)
   {
	   System.out.println(e.name);
   }
}
