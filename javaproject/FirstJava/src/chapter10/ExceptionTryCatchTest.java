package chapter10;

import java.util.Scanner;

// try ~ catch문을 이용한 예외처리
// 중요한건 예외발생으로 인하여 프로그램이 중간에 멈추지 않도록 하는것!
public class ExceptionTryCatchTest {

	public static void main(String[] args) {

		// 사용자로부터 숫자 두개를 받자

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 1을 입력하세요. >>> ");
		int num1 = sc.nextInt();

		System.out.print("숫자 2를 입력하세요. >>> ");
		int num2 = sc.nextInt();

		try {
			System.out.println("num1 / num2 = " + (num1 / num2)); // <= 예외가 발생할 수 있는 위치

			String str = null; // <- 참조해야하는데 할수가 없음.

			System.out.println(str.length()); // <- 참조할 수 가 없는데 호출함. 오류발생

		} catch (ArithmeticException e) { // <= 예외가 발생 시 처리할 구문 , 예외가 발생하지 않으면 여기부터 무시하고 다음구문으로 넘어간다.
			System.out.println("0으로 나누는것은 불가합니다."); //
			e.printStackTrace(); // <= 메소드의 호출이력을 볼 수 있다. / 오류내 : "java.lang.ArithmeticException: / by zero at
									// chapter10.ExceptionTryCatchTest.main(ExceptionTryCatchTest.java:21)"
			System.out.println(e.getMessage()); // <- 예외가 발생한 메시지를 볼 수있다. / 위에서 출력된 오류를 메시지로 출력"/ by zero"
		} catch (NullPointerException e) {
			System.out.println("null!!!!!!!!!!");
		}

		catch (Exception e) {
			System.out.println("예외발생!");
			e.printStackTrace();
		}

		// 중요!! 예외는 디테일하게 세밀한것 부터 시작하여 아래로 갈수록 상위개념(Exception)을 놓는게 좋다 . [모든 예외는 Exception을 상속하기 때문에 먼저오면 다른것은 인식불가]
		// 그래서 catch 블럭은 여러개를 만들어서 사용한다.
		// 다른 예외가 있는데 불구하고 굳이 Exception을 두는 이유는 내가 잘 알지 못하는 예외가 발생 했을 때 에도 사용할 수 있게 둔다.

		// 여러개의 catch중 하나라도 걸리면 걸린것만 처리되고 나머지는 무시 , 아래로 내려감. switch~case 구문과 비슷

		System.out.println("프로그램을 종료합니다.");

	}

}
