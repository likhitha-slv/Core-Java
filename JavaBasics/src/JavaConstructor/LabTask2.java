package JavaConstructor;

class LabTask2 {

	public static void main(String[] args) {
		int days =3;
	LabTask2 lt2 = new LabTask2();
	lt2.welcome();
	System.out.println("Daily price is" +lt2.dailyPrice());
	System.out.println("Days are" +lt2.rentalCost(days));
	System.out.println("Insurance is" +lt2.insurance());
	System.out.println("Total is" + lt2.getDetails(5));
/*
	}

	void welcome()
	{
		System.out.println("Welcome to my retails");
	}
	int dailyPrice(int rent)
	{
		//System.out.println("My day price is" +a);
		return rent;
	}
	double rentalCost(double days)
	{
		return days;
	}
	int insurance(int a)
	{
		return a;
	}
	
	double  getDtails(double days, double rent,int a)
	{
		double day = days * rent;
		double ins = day + a;
		return ins;
		
	}
	*/
	
	}
	void welcome()
	{
		System.out.println("Welcome to retail cars");
	}
	
	int dailyPrice()
	{
		return 1500;
	}
	int insurance()
	{
		return 500;
	}
	int rentalCost(int days)
	{
		return days * dailyPrice();
	}
	int getDetails(int days)
	{
	int a = rentalCost(days);
	int total = a + insurance();
	return total;
	}
	
}

