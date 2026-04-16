package JavaArrays;

public class StringArray {

	public static void main(String[] args) {
    String names[] = new String[8];
    names[0] = "Sree";
    names[1] = "Dady";
    names[2] = "Mommy";
    names[3] = "Ahaa";
    for(String s: names)
    {
    	//System.out.println(names);// It prints the address 8 times
    	System.out.println(s);
    }
	}

}
