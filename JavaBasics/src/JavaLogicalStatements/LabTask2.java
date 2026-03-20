package JavaLogicalStatements;

public class LabTask2 {

	public static void main(String[] args) {
    System.out.println("main method started");
    int x = 3;
    System.out.println(x << 2 + 1);
    int a=8;
    int b=2;
    int c = a >> b << 1;
    System.out.println(c);
    System.out.println(1 << 2 << 3);    
    
    int x1 = 5;
    int y = (x1 > 3) ? x1++ : ++x1;// (x1 > 3) ? x1++   in this the condition is true, then it will increment by ++
    System.out.println(x1 + " " + y);
	}
    
}
