package basics;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ObjectDataTypeExample 
{
	BigDecimal b = new BigDecimal("12");
	BigDecimal b1 = new BigDecimal("2");
	BigInteger bi = new BigInteger("12345");
	BigInteger bi1 = new BigInteger("67859");

	public static void main(String[] args) {
		ObjectDataTypeExample o = new ObjectDataTypeExample();
		System.out.println(o.b.add(o.b1));
		System.out.println(o.b.multiply(o.b1));
		System.out.println(o.b.subtract(o.b1));
		System.out.println(o.b.divide(o.b1));
		
		BigInteger bi = new BigInteger("12345");
		BigInteger bi1 = new BigInteger("67859");
		System.out.println(o.bi.multiply(bi1));
		System.out.println(o.bi.subtract(bi1));
		System.out.println(o.bi.mod(bi1));
		System.out.println(o.bi.gcd(bi1));
		System.out.println(o.bi.add(o.bi1));
		

	}

}
