package chapter10;

import java.util.Scanner;

// finally
public class Exceptionfinally {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 1을 입력하세요. >>> ");
		int num1 = sc.nextInt();

		System.out.print("숫자 2를 입력하세요. >>> ");
		int num2 = sc.nextInt();

		try {
			System.out.println("num1 / num2 = " + (num1 / num2));
			String str = null;
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누는것은 불가합니다."); //
			e.printStackTrace();
			System.out.println(e.getMessage());
			return; // <- 프로그램을 종료하는 return 이지만 아래 finally가 있기때문에 finally 실행 후 종료된다.
		} catch (NullPointerException e) {
			System.out.println("null!!!!!!!!!!");
		} catch (Exception e) {
			System.out.println("예외발생!");
			e.printStackTrace();
		} finally { // 무조건 실행한다.
			System.out.println("무조건 실행하는 블록입니다.");
		}

		// try{} finally{} , try{} catch{}, try{} catch{} finally{}

		System.out.println("프로그램 처리 완료");

	}

}
