package JavaLogicalStatements;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter the character");
        char c1 = sc.next().charAt(0);
        if(c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u')
        {
        	System.out.println("It is a vowel");
        }
        else if(c1 == 'A' || c1 == 'E' || c1 == 'I' || c1 == 'O' || c1 == 'U')
        {
        	System.out.println("Vowel");
        }
        else
        {
        	System.out.println("It is a consonant");
        }
	}

}
