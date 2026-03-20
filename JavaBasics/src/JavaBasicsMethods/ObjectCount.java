package JavaBasicsMethods;

public class ObjectCount {
	static int count = 0;
   {
   
	   count++;
	  
  }

	
	static void display() {
		System.out.println("display the no.of objects");
	}

	public static void main(String[] args) {
		ObjectCount oc1 = new ObjectCount();
		ObjectCount oc2 = new ObjectCount();
		ObjectCount oc3 = new ObjectCount();

		System.out.println(" the number of objects are " + count);
		// display();
	}

}
