package chapter01;

public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub (자동으로 만들어 졌으니 메소드 작성 하라는 안내문구 [생성시 체크 해서 만들면
		// 생김])

		// 메소드 : 기능
		// 메소드의 정의

		// 필요한 데이터 유무 : 매개 변수 결정, 필수 사항은 아니다
		// 어떤 연산 : 목적/문제 해결을 위한 코드
		// 반환 데이터 : 메소드 선언부 맨 앞에 데이터 타입 정의, return 키워드로 데이터 반환
		// 데이터 반환이 없는 경우 : return 키워드를 생략, 반환 타입은 => void

		// 숫자 두개를 전달 받아 덧셈한 결과를 반환하는 메소드 정의해보자!
		// 숫자 두개를 전달 받아 -> 매개변수
		// 덧셈한 -> 덧셈 연산
		// 결과를 반환하는 -> return 결과값
		// 메소드 정의해보자!

		// 메소드의 호출
		int sum = add(100, 50);

		System.out.print(sum);

		System.out.println(add(100, 90));

		addResultPrint(50, 60);

	}

	// 반환 타입
	public static int add(int num1, int num2) {// int num1, int num2 은 블럭 안에서만 사용되는 변수

		// add(100,50); 메소드의 호출

		// 합을 저장하는 변수
		int sum; // 정수 데이터를 저장하는 변수 선언

		sum = 0; // sum 변수에 최초 데이터를 저장 = 변수 초기화

		sum = num1 + num2; // 대입연산 (값을 넣어 주는 것) 연산에도 순서가 있다.

		// 연산의 결과를 반환.
		return sum;

	}

	// 정수 두개를 전달받아 합을 출력하는 메소드를 정의
	public static void addResultPrint(int num1, int num2) { // Camel Case(낙타등)

		int sum = num1 + num2;

		System.out.print(sum);

	}

}
