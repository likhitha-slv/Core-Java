package JavaArrays;

public class Practice5 {

	public static void main(String[] args) {
     double [] d = new double[2];
     d[0]=122333333.5;
     d[1] = 6654651365.9;
     double e=0;
     for(int i = 0;i<d.length;i++)
     {
    	 e = d[0] * d[1];
    	 //System.out.println(e);
     }
     System.out.println(e);//e cannot be resolved to a variable
	}

}
