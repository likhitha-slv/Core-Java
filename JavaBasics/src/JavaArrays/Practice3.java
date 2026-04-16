package JavaArrays;

public class Practice3 {

	public static void main(String[] args) {
    long[] l = new long[9];
    l[0]=2654654145112l;
    l[1]=54536435449l;
    l[2]=365553653l;
    for(long i = 0;i<l.length;i++)
    {
    	//System.out.println(l[i]]);//error
    	System.out.println(l[(int) i]);
    }
	}

}
