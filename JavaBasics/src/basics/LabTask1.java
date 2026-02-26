package basics;

public class LabTask1 {
	int bookid;
	String title;
	String author;
	int price;
	float discount = 0.10f * price;

	float totalAmount = price - discount;

	public static void main(String[] args) {
		LabTask1 lt = new LabTask1();
		lt.bookid = 1234;
		System.out.println(lt.bookid);
		lt.title = "akitha";
		System.out.println(lt.title);
		lt.author = "vaibhav";
		System.out.println(lt.author);
		lt.price = 500;
		System.out.println(lt.price);
		lt.discount = 0.10f * lt.price;

		lt.totalAmount = lt.price - lt.discount;
		System.out.println(lt.totalAmount);
		System.out.println();
		LabTask1 lt1 = new LabTask1();
		lt1.bookid = 2345;
		System.out.println(lt1.bookid);
		lt1.title = "akila";
		System.out.println(lt1.title);
		lt1.author = "vibhu";
		System.out.println(lt1.author);
		lt1.price = 600;
		System.out.println(lt1.price);
		lt1.discount = 0.10f * lt1.price;

		lt1.totalAmount = lt1.price - lt1.discount;

		System.out.println(lt1.totalAmount);

	}

}
