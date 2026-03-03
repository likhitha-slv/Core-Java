package JavaBasicsMethods;
// with argument + with return type
import java.util.*;
// WRITE A PROGRAM OF AREA OF TRIANGLE , SQUARE , RECTANGLE AND CIRCLE
public class LabTask2 {

	public static void main(String[] args) {
		LabTask2 l = new LabTask2();
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		// Area Of Traingle
		System.out.println("enter the base of the triangle is:");
		float b = sc.nextFloat();
		System.out.println("Enter the height of the triangle is");
		float l1 = sc.nextFloat();
		float aoT = l.areaOfTraingle(b, l1);
		System.out.println("The area of triangle is:" + aoT);
		// sc.close();"main" java.lang.IllegalStateException: Scanner closed
		System.out.println("*****************************");
		System.out.println("Enter the radius of the circle is");
		double radius = sc.nextDouble();
		double aoC = l.areaOfCircle(radius);
		System.out.println("The area of Circle is:" + aoC);

		System.out.println("************************************");
		System.out.println("Enter the side of the square is");
		int side = sc.nextInt();
		int aoS = l.areaOfSquare(side);
		System.out.println("The area of Square:" + aoS);
		System.out.println("*****************************");

		System.out.println("enter the length of the rectangle");
		short length = sc.nextShort();
		System.out.println("enter the breadth of the rectangle");
		short breadth = sc.nextShort();
		short aoR = l.areaOfRectangle(length, breadth);
		System.out.println("area of rectangle is" + aoR);
		sc.close();

	}

	float areaOfTraingle(float base, float height) {
		float aoT = (float) (0.5 * base * height);
		return aoT;
	}

	double areaOfCircle(double radius) {
		double aoC = Math.PI * radius * radius;
		return aoC;
	}

	int areaOfSquare(int side) {
		int aoS = side * side;
		return aoS;
	}

	short areaOfRectangle(int length, int breadth) {
		short aoR = (short) (length * breadth);
		return aoR;
	}
    
}
