package chapter03;

import java.util.Scanner;

public class CalculatorTest3 {
	
	// 2. 콘솔에서 사용자에게 데이터를 받아 메소드를 호출할 때 사용자에게 받은 데이터를 메소드의 매개변수의 인자로 전달하는 코드를 main() 메소드 에 추가해봅시다.
	// 3. 정수 두 개를 매개변수의 인자로 전달받아 더하기연산 후 출력하는 메소드를 정의
	// 4. 정수 두 개를 매개변수의 인자로 전달받아 빼기연산 후 출력하는 메소드를 정의
	// 5. 정수 두 개를 매개변수의 인자로 전달받아 곱하기연산 후 출력하는 메소드를 정의
	// 6. 정수 두 개를 매개변수의 인자로 전달받아 나누기연산 후 출력하는 메소드를 정의
	// 7. 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 둘레를 구해 반환하는 메소드를 반환하는 메소드를 정의
	// 8. 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 넓이를 구해 반환하는 메소드를 반환하는 메소드를 정의 원의 둘레 : 2 x π x r , 월의 넓이 : π x r x r //π :3.14

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("");

		System.out.println("5+10 : " + add(5, 10));
		
		
	}
	
	// 1. main() 메소드를 정의하고 각각의 메소드를 호출해서 결과를 콘솔에 출력해봅시다.
	
	
	public static long add(long num1,long num2) {
		long result = num1 + num2 ;
		return result;
	}
	
}
