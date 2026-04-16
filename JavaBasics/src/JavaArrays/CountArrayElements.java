package JavaArrays;

public class CountArrayElements {

	public static void main(String[] args) {
     int[] a = {2,4,6,4,8,9};
     int count =0;
     for(int i=0;i< a.length;i++)
     {
    	 count++;
    	 System.out.println(a[i]);
     }
     System.out.println("My element count is:" +count);
	}

}
