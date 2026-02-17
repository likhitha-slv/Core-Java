package basics;

public class EmpInfo {
	int eid;
	String ename;
	float sal;

	void bonus()

	{
		System.out.println(sal);
		System.out.println(eid);
		System.out.println(ename);

		double bonus1 = 20;
		sal = sal + sal * 0.2f;
		System.out.println(sal);

	}

	public static void main(String[] args) {
		EmpInfo e = new EmpInfo();
		e.eid = 1234;
//		
		e.ename = "Lolly";
		// System.out.println(e.ename);
		e.sal = 150000;
		e.bonus();
	}

}
