package JavaArrays;

import java.util.Scanner;

public class CharVowelsFound {

	public static void main(String[] args) {
    System.out.println("main method started");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size");
    int size = sc.nextInt();
    System.out.println("Enter the word");
    char[] ch = new char[size];
    for(int i=0;i<ch.length;i++)
    {
    	ch[i] = sc.next().charAt(0);
    }
    for(char c:ch)
    {
    	if(c=='a'|| c== 'e' || c=='i'|| c=='o'|| c=='u'   ||
    			c=='A'|| c== 'E' || c=='I'|| c=='O'|| c=='U')
    	{
    		System.out.println("Letter Starting With Vowel Only:" +c);
    	}
    	else
    	{
    		System.out.println("Letter Starts with consonants:" +c);
    	}
    }
    
	}
}
