package chapter10.exam;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

import chapter10.BadInputException;

public class ExamMain {
	/*
	 * 콘솔에서 사용자 아이디를 입력 받아 
	 * 정상적인 영문자와 숫자로만 이루어진 값을 입력했는지 확인하는 프로그램을 만들어봅시다. 
	 * 1 사용자 예외클래스를 정의해서 예외를 발생 시켜 봅시다. 
	 * 2 예외 클래스 이름은 BadIdInputException이라고 정의합시다.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int birth = 0;
		String str = "qqq@naver.com";
		while (true) {
			System.out.println("ID를 입력 해 주세요 >> ");
			String userId = sc.nextLine();
			boolean chk = Pattern.matches("^[a-z0-9A-Z]+@+[a-z0-9A-Z]+\\.+[a-z-Z]+$", str);
			try {
				if (!chk) {
					throw new BadIdInputException(userId);
				}
				System.out.println("ID : " + userId);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("다시 입력해주세요");
			}
		}
		
		
//		2. Scanner 클래스로 태어난 년도를 입력 받을 때 int 타입으로 받도록 합시다.
//		이때 nextInt() 메소드를 사용하게 되는데 이때 발생하는 예외처리를 하도록 합시다.
		System.out.println();
		System.out.println("태어난 년도 4자리를 입력하세요 (ex. 1995)>> ");
		
		try {
			birth = sc.nextInt();
			System.out.println("생년월일 : "+birth);
			
		} catch (InputMismatchException e) {
			System.out.println("정상적인 숫자를 입력해주세요");
			System.out.println("4자리 입력만 가능합니다.");
		}
		

	}
}
