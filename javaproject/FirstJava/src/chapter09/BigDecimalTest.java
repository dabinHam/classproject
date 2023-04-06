package chapter09;

import java.math.BigDecimal;
// 소수점계산
public class BigDecimalTest {

	public static void main(String[] args) {
		
		BigDecimal bd1 = new BigDecimal("1.8");
		BigDecimal bd2 = new BigDecimal("1.2");
		
		System.out.println(bd1.add(bd2)); // 3.0
		//System.out.println(0.3+0.2);
		System.out.println(bd1.subtract(bd2)); // 0.6
		System.out.println(bd1.multiply(bd2)); // 2.16
		System.out.println(bd1.divide(bd2));  // 1.5
		//System.out.println(1.8-1.2);	// 0.6000000000000001
		
		
		
	}
	
}
