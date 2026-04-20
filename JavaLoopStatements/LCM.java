package JavaLoopStatements;

public class LCM {

	public static void main(String[] args) {
    System.out.println("main method started");
    int a = 4;
    int b = 6;
    int max = Math.max(a, b);
    while(true)
    {
    if(max % a ==0 && max % b == 0)
    {
    	System.out.println("LCM IS: "+max);
    	break;
    }
    max++;
	}
	}
}
