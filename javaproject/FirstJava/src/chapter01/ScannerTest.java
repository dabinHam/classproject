package chapter01;

import java.util.Scanner; //import로 가져오지 않으면 name을 full로 적어줘야함. 해당 메소드명에 커서를 올리면 나타남. 

public class ScannerTest { // Scanner의 용도는 학습,테스트용

	public static void main(String[] args) {

		// Scanner in; 이렇게 쓰면 오류남.
		// java.util.Scanner in = new Scanner();
		// java.util.Scanner in = new java.util.Scanner(System.in);
		Scanner in = new Scanner(System.in);

		System.out.print("이름을 입력해주세요.>>>");

		String name = in.nextLine(); // 문자열 반환 , 커서가 nextLine에 대기중!

		System.out.println("이름 : " + name); // 사용자의 이름을 입력받아서 출력함.

		System.out.print("나이를 입력해주세요.>>>");

		int age = in.nextInt();// 숫자열 반환

		System.out.println("나이 : " + age);

	}

}
