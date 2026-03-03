package JavaBasicsMethods;
import java.util.*;
public class ClassPractice {
          // Inthis code we were created a instance methods.It is not calling also 
//	the methods are executing without object reference variable.
	public static void main(String[] args) 
	{
		ClassPractice cp = new ClassPractice();	
		
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the name");
		String name = sc.next();
        cp.getName(name);
        System.out.println("My name is:" +name);
        
        System.out.println("**********************************");
        System.out.println("enter the last name");
        String lname = sc.next();
        cp.lastName(lname);
        System.out.println("My last name is:" +lname);
        System.out.println("*************************************");
        System.out.println("enter the age");
        int age = sc.nextInt();
        System.out.println("my age is" +age);
        cp.age(age);
        System.out.println("***************************************");
       
        System.out.println("tell me the gender");
        boolean boo = sc.nextBoolean();
        cp.gender(boo);
        System.out.println("my gender is" +boo);
        System.out.println("**************************************");
        System.out.println("enter the mobile number");
        float mobile = sc.nextFloat();
        System.out.println("my mobile number is" + mobile);
        mobile(mobile);
        System.out.println("*****************************");
        
        
        
        System.out.println("enter your mail");
        String mail = sc.next();
        System.out.println("my main is");
        cp.mail(mail);
        System.out.println("***********************************");
        System.out.println("enter the salary");
        double sal = sc.nextDouble();
        System.out.println("My salary is" +sal );
        System.out.println("*************************************");
        System.out.println("Enter the bonus");
        long bonus = sc.nextLong();
        System.out.println("My bonus is"+ bonus);
        System.out.println("****************************");
        
        System.out.println("enter the marks");
        long marks1 = sc.nextLong();
        float marks2 = sc.nextFloat();
        System.out.println("my marks are" +(marks1 + marks2));
        cp.marks(marks1, marks2);
        System.out.println("*******************************************");
        System.out.println("enter the percentage");
        byte per = sc.nextByte();
        System.out.println("My percentage is" +per);
        //cp.percentage(45);
        System.out.println("***********************************");
        System.out.println("Enter the graduation");
        char bllod=sc.next().charAt(0);
        System.out.println("my graduation year is" +bllod);
        System.out.println("Enter the weight");
        short weight = sc.nextShort();
        System.out.println("My weight is" + weight);
        System.out.println("****************************************");
        
        System.out.println("enter the a, b value");
        int a= sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("the addition of two" +c);
        cp.add(a,b);
        System.out.println("******************************");
        System.out.println("enter the d,f values");
        float d= sc.nextFloat();
        float f=sc.nextFloat();
        float e = d-f;
        System.out.println("the subtraction of two numbers " +e);
        System.out.println("******************************************");
        System.out.println("enter the g,h values");
        long g= sc.nextLong();
        long h=sc.nextLong();
        long i = g * h;
        System.out.println("the multiplication of two numbers " +i);
        System.out.println("***************************************************");
        System.out.println("enter the j,k values");
        double j= sc.nextDouble();
        double k=sc.nextDouble();
        double l = j/k;
        System.out.println("the division of two numbers " +l);
        System.out.println("****************************************************************");
        System.out.println("enter the m,n values");
        double m= sc.nextDouble();
        double n=sc.nextDouble();
        double o = m%n;
        System.out.println("the modulus of two numbers " +o);
        System.out.println("******************************************");
        System.out.println("enter the p,q values");
        double p= sc.nextDouble();
        double q=sc.nextDouble();
        double r = p*q;
        System.out.println("the multiply of two numbers same data type " +r);
        show();
        cp.greet();
        cp.talk();
        cp.present();
        check();
        verify();
        System.out.println("*******************");
        int ab= sc.nextInt();
        int bc = sc.nextInt();
        int cd = sc.nextInt();
        System.out.println("enter the roll" + ab);
        System.out.println("enter the rollnumber" + bc);
        System.out.println("enter the class" + cd);
        cp.studentInfo(ab,bc,cd);
        System.out.println("******************************************************************************");
        sc.close();
        
	}
	void getName(String name)
	{
		//System.out.println("Enter the name");
	}
	void lastName(String name)
	{
//		System.out.println("enter the last name");
	}
	void age(int age)
	{
		
	}
	boolean gender(boolean gender)
	{
		return gender;   // Why console is giving default value here.
	}
	static float mobile(float mobile)
	{
		return mobile;
	}
	void mail(String mail)
	{
		// Output is not coming and scanner is not giving the taking the output
	}
    static double salary(double sal)
    {
    	return sal;
    }
    static long bonus(long bon)
    {
    	return bon;
    }
    void marks(float marks1, float marks2)
    {
    	float marks = marks1+marks2;// here marks are not adding
    }
    byte percentage(byte percent)
    {
    	return percent;
    }
    char blood(char blood)
    {
       return blood;
    }
    short weight(short weight)
    {
    	return weight;
    }
    int add(int a, int b)
    {
    	int c = a+b;
    	//System.out.println("Addition");
    	return c;
    }
    float sub(int a, int b)
    {
    	int c = a-b;
    	return c;
    }
    long mul(long a, int b)
    {
    	long c = a*b;
    	return c;
    }
    double div(long a, int b)
    {
    	double c = a/b;
    	return c;
    }
    double mod(long a, int b)
    {
    	double c = a*b;
    	return c;
    }
    float multiply(float a, float b)
    {
    	float c = a * b;
    	return c;
    }
    static void show()
    {
    	System.out.println("Show the image");
    }
    void greet()
    {
    	System.out.println("Good morning");
    }
    void talk()
    {
    	System.out.println("Tell me your name");
    }
    void present()
    {
    	System.out.println("give me the presentation");
    }
    static void verify()
    {
    	System.out.println("Verify the books");
    }
    
    static void check()
    {
    	System.out.println("Check the roll nember");
    }
    int studentInfo(int num, int roll, int cls)
    {
    	return 0;
    }
    
}
