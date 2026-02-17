package basics;

public class LangPractice
{
	byte b = (byte) 133;// explicit type casting
	short s;
	int i=8765688;
	long l= 76568076098697869l;
	float f;
	double d;
	char c;
	boolean bool;

public static void main(String args[]) 
{
	LangPractice lp = new LangPractice();
	System.out.println(lp.b);
	System.out.println(lp.s);
	System.out.println(lp.i);
	System.out.println(lp.l);
	System.out.println(lp.f);
	System.out.println(lp.d);
	System.out.println(lp.c);
	System.out.println(lp.bool);
}
}
