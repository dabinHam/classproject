package chapter10.exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam2Main {

	public static void main(String[] args) {
//		2. Scanner 클래스로 태어난 년도를 입력 받을 때 int 타입으로 받도록 합시다.
//		이때 nextInt() 메소드를 사용하게 되는데 이때 발생하는 예외처리를 하도록 합시다.

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요. >>"); // 0123456789

		int num = 0;

		//finally를 사용하면 변수처리들을 못하니까 상위에 변수선언을 하여 초기화를 해준다...? 
		try {
			num = sc.nextInt();// <<예외처리 포인트
			System.out.println("num =" + num);// 예외가 발생하면 출력되면 안되는 부분, 정상적으로 처리되었을때만 나타
			
		} catch (InputMismatchException e) {
			System.out.println("예외발생");
			System.out.println("정상적인 숫자를 입력해주세요.");
		}

	}

}
