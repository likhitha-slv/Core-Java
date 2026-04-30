package JavaLoopStatements;

public class ToStringMethodExample {

	String name = "Likhitha";
	int id = 1;

	@Override
	public String toString() {
		return "ToStringMethodExample [name=" + name + ", id=" + id + "]";
	}

	public static void main(String[] args) {
		System.out.println("--------------------");

		ToStringMethodExample ts = new ToStringMethodExample();
		System.out.println(ts);
	}

}
