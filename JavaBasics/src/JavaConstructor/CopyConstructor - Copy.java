package JavaConstructor;

public class CopyConstructor {
	
	String cName;
	String sName;
	String branch;
	int rollNo;
	
	
	CopyConstructor(String cName, String stName, String sbranch, int srollNo)
	{
		this.cName=cName;
		sName=stName;
		branch=sbranch;
		rollNo=srollNo;
		
	}
	
	public CopyConstructor(int srollNo, String stName, CopyConstructor cc) {
		
		this.cName=cc.cName;
		sName=stName;
		branch=cc.branch;
		rollNo=srollNo;
		
		
	}

	void show(){
		
		System.out.println(cName);
		System.out.println(sName);
		System.out.println(branch);
		System.out.println(rollNo);
		System.out.println("---------------------------");
		
	}
	
	
	
	
public static void main(String args[])
{
	CopyConstructor cc = new CopyConstructor("svec","li","cse",1);
	cc.show();
	
	CopyConstructor cc1 = new CopyConstructor(2,"sh",cc);
	cc1.show();
}
	/*String name;
	String rollNo;
	int age;

	CopyConstructor() {
		System.out.println("No arg constructor called");
	}
	
	CopyConstructor(CopyConstructor c,String name)
	{
		this.name = name;
		this.rollNo=c.rollNo;
		System.out.println("Parameterised constructor");
	}
	
	CopyConstructor(CopyConstructor c, String name, String rollNo)
	{
		this.rollNo = rollNo;
		this.name=c.name;

	}
    
	CopyConstructor(CopyConstructor c, String name, String rollNo, int age)
	{
		this.name= c.name;
		this.rollNo= rollNo;
		this.age = age;
	}
	public static void main(String[] args) {
		System.out.println("Main method started");
		CopyConstructor cc = new CopyConstructor();
		cc.show();
		
		CopyConstructor cc1 = new CopyConstructor(cc,"Lilli");
		cc1.show();
		
		CopyConstructor cc2 = new CopyConstructor(cc1, "Lalli", "G1", 22);
		cc2.show();
	}

	void show() {
		System.out.println("My name is:"    + name);
		System.out.println("My roll no is:"    + rollNo);
		System.out.println("My age is:"     + age);
	}
	*/
}
