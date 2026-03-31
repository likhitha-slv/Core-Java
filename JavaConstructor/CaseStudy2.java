package JavaConstructor;

public class CaseStudy2 {
	String ename;
	double salary;

	CaseStudy2(String ename) {
		this.ename = ename;
	
	}

	CaseStudy2(String s, double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
  CaseStudy2 cs2 = new CaseStudy2("Lalli", 50000);
  System.out.println(cs2.ename);
  
	}

}
