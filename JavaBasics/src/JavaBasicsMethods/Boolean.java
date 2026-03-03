package JavaBasicsMethods;
import java.util.*;
public class Boolean {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("tell me the gender");
        boolean boo = sc.nextBoolean();
        gender(boo);
        System.out.println("my gender is" +boo);
	}
	 static boolean gender(boolean gender)
	{
		return gender;   // Why console is giving default value here.
	}
}
