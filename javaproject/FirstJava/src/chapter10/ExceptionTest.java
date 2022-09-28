package chapter10;

import java.util.Scanner;

// if 문을 이용한 예외처리 방법
public class ExceptionTest {

	public static void main(String[] args) {
		// 사용자로부터 숫자 두개를 받자
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 1을 입력하세요. >>> ");
		int num1 = sc.nextInt();
		
		System.out.print("숫자 2를 입력하세요. >>> ");
		int num2 = sc.nextInt();
		
//		// 0으로 나눌 수 없다.
//		// 10 / 0 <- 문법적으로 문제없지만 실행하면 오류발생.
//		System.out.println("num1 / num2 = "+(num1/num2)); // <- 여기까지만 오고 더 내려오지도않음.
//		
//		System.out.println("프로그램을 종료합니다.");
		//////////////////////////////////////////// 아래와 같이 재 정의
		if(num2 == 0) {
			System.out.println("나누는 수는 0이 될 수 없습니다.");
			//System.out.println("프로그램을 종료합니다.");
		} else {
			System.out.println("num1 / num2 = "+(num1/num2)); // <- 예외 발생 지점
			//System.out.println("프로그램을 종료합니다.");
		}
		System.out.println("프로그램을 종료합니다.");
		
		
		

		
		
		
		
		
	}

}
