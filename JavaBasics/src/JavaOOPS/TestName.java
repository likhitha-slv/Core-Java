package JavaOOPS;

public class TestName {

	public static void main(String[] args) {
    Name nm = new Name("Likki", "114");
    System.out.println(nm.getName());
    System.out.println(nm.getId());
    nm.setId("-101");
    System.out.println(nm.getId());
    nm.setName("Sha");
    System.out.println(nm.getName());
	}

}
