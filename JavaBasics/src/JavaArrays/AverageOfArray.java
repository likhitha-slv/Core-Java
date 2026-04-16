package JavaArrays;

public class AverageOfArray {

	public static void main(String[] args) {
    System.out.println("main method started");
    double[] d = {1232, 54390, 432123, 65432345};
    double avg =0;
	double sum=0;
    for(int i=0;i< d.length;i++)
    {
    	sum = sum + d[i];
    	
    }
    avg = sum / d.length ;
    System.out.println("The average value of an array is: " +avg);
	}

}
