package JavaArrays;

public class Intro {

	public static void main(String[] args) {
         // Declaration  
		//int a[];
		//creation
          int a[]=new int[5];
         //initialization
         a[0] = 23;
         a[1] = 19;
         a[2] = 22;
         a[3] = 34;
         a[4] = 60;
         //Representation
         System.out.println(a[0]);
         System.out.println(a[1]);
         System.out.println(a[2]);
         System.out.println(a[3]);
         System.out.println(a[4]);
         System.out.println("----------------------------");
         
//         (or)
         
         for(int i =0; i< 5;i++)
         {
        	 System.out.println(a[i]);
         }
         System.out.println("******************************");
         for(int i=1;i<=5;i++)//ArrayIndexOutOfBoundsException  if we give <=
         {
        	 System.out.println(a[i]);
         }
	}

}
