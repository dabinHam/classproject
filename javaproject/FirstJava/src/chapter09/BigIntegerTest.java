package chapter09;

import java.math.BigInteger;
// long 타입을 넘어가는 경우 계산법
public class BigIntegerTest {
	
	public static void main(String[] args) {
		
		// long 타입(8byte)을 넘어가는 경우는 계산할 수 없기 때문에 문자열로 표현함.
		BigInteger bi1 = new BigInteger("10000000000000000000000000");
		BigInteger bi2 = new BigInteger("10000000000000000000000000");
		
		System.out.println(bi1.add(bi2));
		System.out.println(bi1.subtract(bi2));
		System.out.println(bi1.multiply(bi2));
		System.out.println(bi1.divide(bi2));
		
		
		
	}
}
