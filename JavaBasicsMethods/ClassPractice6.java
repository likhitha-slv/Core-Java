package JavaBasicsMethods;

public class ClassPractice6 {

	public static void main(String[] args) {
		ClassPractice6 c6 = new ClassPractice6();
		System.out.println("main method started");
		System.out.println("Student information");
		System.out.println("student id" +c6.getStudentId());
		System.out.println("Student Name" +c6.getStudentName());
		System.out.println("Student age" +c6.getStudentAge());
		System.out.println("Student rank" +c6.getStudentRank());
		System.out.println("Student gender" +c6.getStudentGender());
		System.out.println("Student Height " +c6.getStudentHeight());
		System.out.println("Student Weight" +c6.getStudentWeight());
		System.out.println("Student status" +c6.isStudentPassed());
		
	}
	
	byte getStudentId()
	{
		return 101;
	}
	short getStudentAge()
	{
		short age = 13;
		return age;
	}
	int getStudentRank()
	{
		int rank=5;
		return rank;
		// return 5;    it is also acceptable
	}
	float getStudentHeight()
	{
		float height = 5.2f;
		return height;
	}
	double getStudentWeight()
	{
		double weight = 109.8;
		return weight;
	}
	char getStudentGender()
	{
		char gen = 'F';
		return gen;
	}
	
	boolean isStudentPassed()
	{
		boolean status = true;
		return status;
	}
	String getStudentName()
	{
		String name = "Likhitha";
		return name;
	}
	

}
