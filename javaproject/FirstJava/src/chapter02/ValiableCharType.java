package chapter02;

public class ValiableCharType {

	public static void main(String[] args) {

		// 문자 타입 : char 2byte(음수는 표현x)
		// 유니코드 : 숫자를 저장 - 실제 메모리 저장 (실제메모리는 숫자가 저장된다)
		// 유니코드를 외울 필요는 없고, 모를 때 아래처럼 찾아서 확인하면 된다.

		char ch1 = 'A';

		int codeNumber = ch1 + 0; // 덧셈 연산 = int //결과값 : A : 65

		System.out.println(ch1 + " : " + codeNumber);

		char ch2 = 66; // 결과값 : B

		System.out.println(ch2);

		char ch3 = 51088; // 결과값 : 자

		System.out.println(ch3);

	}

}
