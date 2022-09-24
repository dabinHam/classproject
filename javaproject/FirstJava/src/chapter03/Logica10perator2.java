package chapter03;

public class Logica10perator2 {

	public static void main(String[] args) {

		// 범위를 찾는 코드
		int age = 15;

		// 청소년 : 13 ~ 19
		boolean chk = age >= 13 && age <= 19;

		System.out.println("청소년 판별 : " + chk); // true

		System.out.println('a' < 'b'); // true

		// 해당 문자가 소문자 인지 판별
		char c = '#';
		// 소문자 판별
		boolean chk2 = c >= 'a' && c <= 'z';

		// 대문자 판별
		boolean chk3 = c >= 'A' && c <= 'Z';

		// 숫자 판별
		boolean chk4 = c >= '0' && c <= '9';

		System.out.println("c 변수의 값이 소문자 인지 판별 : " + chk2);

		// 대문자 또는 소문자 또는 숫자 만 사용
		// 대문자 판별 || 소문자 판별 || 숫자 판별
		// boolean result = chk3 || chk2 || chk4;
		boolean result = chk3 = c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= '0' && c <= '9';

		System.out.println("대문자 또는 소문자 또는 숫자 만 사용 : " + result);

		String uid = "cool#";

	}

}