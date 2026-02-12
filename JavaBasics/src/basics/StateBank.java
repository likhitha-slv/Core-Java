// Creating the state bank of india in which it has the sequence that 123450 and we have to print the next sequence value 123451
// In this we print the name, phno and balance with different values.
package basics;

public class StateBank 
{
	static int sequence = 123450;
	int acc;
	String name;
	long phoneNo;
	float balance;
	{
		sequence = sequence +1;
		System.out.println(sequence);
		}
	

	public static void main(String[] args)
	{
	   StateBank a = new StateBank();
	   a.acc=sequence;
	   a.name="Likhitha";
	   a.phoneNo = 98765543647l;
	   a.balance = 5399;
	   System.out.println(a.name);
	   System.out.println(a.phoneNo);
	   System.out.println(a.balance);
	   System.out.println("object 1 is created");
	   System.out.println("********************************************");
	   
	   StateBank a1 = new StateBank();
	   a1.acc=sequence;
	   a1.name="Lokhitha";
	   a1.phoneNo = 9876554323l;
	   a1.balance = 67589;
	   System.out.println(a1.name);
	   System.out.println(a1.phoneNo);
	   System.out.println(a1.balance);
	   System.out.println("object 2 is created");
	   System.out.println("**********************************************");
	   
	   StateBank a2 = new StateBank();
	   a2.name = "Lalitha";
	   a2.phoneNo = 98643568866l;
	   a2.balance = 97689;
	   System.out.println(a2.name);
	   System.out.println(a2.phoneNo);
	   System.out.println(a2.balance);
	   System.out.println("object 3 is created");
	   System.out.println("******************************************************");

	}

}
