package chapter09.exam;

import java.util.Scanner;

public class PersonMain1 {
	public static void main(String[] args) {
		////////////// 문제 3
		// 3. 사용자에게 이름을 입력 받아 입력 받은 문자열을 정상적인 문자열의 이름으로 표현하는지 판별하고,
		// 공백으로 입력되었는지도 판별하는 프로그램을 만들어봅시다.
		
		// 추가적으로 입력조건이 틀리면 다시입력해야 하고 , 완료될때까지 무한반복으로 만들어 놓았습니다.

		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("입력 받은 문자열이 정상적으로 표현하는지 판별, 공백 판별 프로그램 \n");
		
		System.out.println("이름을 입력 하세요. >>> ");
		String name = sc.nextLine();



		while (true) {

			if (name.trim().length() == 0) {
				System.out.println("공백은 입력할 수 없습니다.");
				System.out.println("이름을 다시 입력하세요. >>> ");
				name = sc.nextLine();
			} else {
				if (checkName(name)) {
//					System.out.println(name);
					break;
				} else {
					System.out.println("이름은 영문만 입력이 가능합니다.");
					System.out.println("이름을 다시 입력하세요. >>> ");
					name = sc.nextLine();
				} // if2(영문) 끝

			} // if(trim) 끝

		} // while 끝
		System.out.println("이름 : " + name);
	} // main 끝

	static boolean checkName(String name) {
		boolean result = true;
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (!(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')) {
				result = false;
				break;
			}
		}
		return result;
	}

//	private String getName() {
//		
//		String getName = null;
//		
//		name = sc.nextLine();
//	}
}
