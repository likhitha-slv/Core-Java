// Conversion of Celsius to Fahrenheit 
package basics;

public class TemperatureConverter 
{

	public static void main(String[] args)
	{
		double cel = 30;
		double fah = ((cel * 9/5) + 32);
		System.out.println(fah);
		
		cel = ((fah - 32) * 5/9);
		System.out.println(cel);
	}

}
