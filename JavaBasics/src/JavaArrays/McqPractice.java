package JavaArrays;

public class McqPractice {

	public static void main(String[] args) {
    //int[] a = new int[-8]; //java.lang.NegativeArraySizeException
    
    int[] b = {10, 30,50,70};
    System.out.println(b[0] + b[2]);//60
    System.out.println("*******************");
    
    
    int[] a = new int[3];
    System.out.println(a[1]);
    System.out.println("***********");
    
    
    
    int[] a1 = {5,10,15};
    System.out.println(a1.length - 1);
    System.out.println("********************");
    
    
    
    int[] a2 = {1,2,3};
    for(int i=0; i<a2.length; i++)
    {
        a2[i] = a2[i] * 2;
    }
    System.out.println(a2[2]);
    
    System.out.println("*******************");
    
    
    int[] c = {1,2,3};
    for(int i=0; i<c.length; i++)
    {
      System.out.println("Hi");
    }
    System.out.println("****************");
    
    int[] a11;
    System.out.println(a[0]);
    System.out.println("**********************************");
    
    int[] a15 = {5,10,15};
    a15[1] = 50;
    System.out.println(a15[1]);
    System.out.println("********************************************");
    
    int[] qqq = {5,10,15};
    System.out.println(qqq.length - qqq[0]);
    
    System.out.println("**********************************************************");
    
    
    int[] a111 = {1,2,3};
    System.out.println(a111[0] == a111[1]);
    
    System.out.println("****************************************************************************");
    
    
    int[] a1111 = {1,2,3};
    int sum = 0;
    for(int i=0;i<a1111.length;i++)
    {
        sum = sum + i;
    }
    System.out.println(sum);
	}

}