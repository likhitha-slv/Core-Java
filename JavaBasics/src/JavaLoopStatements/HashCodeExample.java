package JavaLoopStatements;

public class HashCodeExample {

	

	String name= "Likhitha";
	int id=897;
	
	public static void main(String[] args) {
    System.out.println("--------------------------");
    HashCodeExample hc = new HashCodeExample();
    System.out.println(hc.hashCode());
    System.out.println(hc.name.hashCode());
    //System.out.println(hc.id.hashCode());//Cannot invoke hashCode() on the primitive type int
	}

}
