package chapter02;

public class ValiableTest {

	// 클래스의 시작
	public static void main(String[] args) {

		// 자료형 변수이름 = 데이터 ;
		int num = 1000;
		// 숫자 1000을 저장하기 위한 메모리 공간 생성, 저장 공간을 찾아갈 수 있는 주소를 가지는 이름 = num
		// 변수 선언 과 초기화

		// 숫자
		// - 정수 : byte, short, int, long [사이즈,범위]
		// - 실수 : float, double
		// 문자 : char
		// 논리값 : boolean(true,false)
		// 문자열( 참조형 ) : String(클래스의이름)

		// 저장하는 사이즈에 타입이 따라서 다르다. 1bit (1,0으로 이루어짐) 범위를 벗어나면 값이 왜곡된다.
		// 정수
		int num1 = 100; // 자료형의 기본값. 실제로 java의 연산은 int로 사용함. 속도면에서 int를 사용하는게 좋다고 함.=어짜피 다 int로 변환되기 때문에
		byte num2 = 100; // 파일에 대한 입,출력 / 파일복사,이동에 사용됨
		short num3 = 100; // 잘 사용하지 않음.
		long num4 = 100;

		// 실수
		float num5 = 0.5f; // 0.5 -> 리터럴 / 아무것도 쓰지않으면 double가 됨.(기본) / 4byte 단위 저장
		double num6 = 0.5; // 8byte 단위 저장

		// 논리값
		boolean check = false; // true, false

		// 참조형
		String str = null; // 초기화 / *null=아무런 문자열이 없다
		str = "String";

	}

}
