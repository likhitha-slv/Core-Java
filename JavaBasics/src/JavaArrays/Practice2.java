package JavaArrays;

public class Practice2 {

	public static void main(String[] args) {
     short[] s = new short[5];
     int i1 = 0;
	 s[i1]=12256;
	 for(int i = 0;i<s.length;i++)
	 {
		System.out.println(s[i1]); //12256 --> 5 times
		System.out.println(s[i]);//12256 0 0 0 0
	 }
	}

}
