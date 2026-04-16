package JavaArrays;

public class Practice1 {

	public static void main(String[] args) {
      short b[] = new short[5];
      b[0] = 24;
      b[1] = 23;
      b[2] = 21;
      b[3] = 14;
      b[4] = 19;
      for(int i=0;i<5;i++)
      {
    
    	if(i % 2==0)
    	{
    		System.out.println("Even :" + b[i]);
    	}
    	else
    	{
    		System.out.println("Odd :" + b[i]);
    	}
      }
     
	}

}
