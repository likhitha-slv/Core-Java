package JavaArrays;

public class Practice10 {

	public static void main(String[] args) {
    int[] marks= {10,87,34,21,12,9,87};
    int sum=0;
    int avg=0;
    for(int i=0;i<marks.length;i++)
    {
    	sum = sum + marks[i];
    	avg = sum/marks.length;
    }
    System.out.println("Sum of the marks:" +sum);
    System.out.println("Average of the marks:" +avg);
	}

}
