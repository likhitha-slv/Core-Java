package JavaConstructor;

public class Book {
	String BookName;
	String AuthorName;
	double price;
	int ReleasedOn;
	
	Book()
	{
		this("hello");
	}
	Book(String BookName)
	{
		this("hello", "Namaha");
		System.out.println("One arg constructor called");
	}
	Book(String BookName, String AuthorName)
	{
		this("Hello","Namaha", 500);
		System.out.println("Two arg constructor called");
	}
	Book(String BookName, String AuthorName, double price)
	{
		this("Hello", "Namaha", 500, 1234);
		System.out.println("Three arg constructor called");
	}
	Book(String BookName, String AuthorName, double price, int ReleasedOn)
	{
		System.out.println("Four arg constructor called");
		this.BookName=BookName;
		this.AuthorName = AuthorName;
		this.price=price;
		this.ReleasedOn=ReleasedOn;
		//this();//Exception in thread "main" java.lang.StackOverflowError
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
        Book b1 = new Book();
        System.out.println("My book name is" + b1.BookName);
        System.out.println("My author name is" +b1.AuthorName);
        System.out.println("My price is" +b1.price);
        System.out.println("Released Date is" +b1.ReleasedOn);
	}

}
