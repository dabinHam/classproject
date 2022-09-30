package chapter04;

public class SwitchCaseTest {
	// 특정한 값을 비교하는 경우

	public static void main(String[] args) {

		int key = 3;

		// switch case : 특정 값 하나를 비교해서 분기 하는 조건
		// key 값과 case 다음에 오는 값(value)을 비교해서 실행
		switch (key) {
		case 1:
			System.out.println("1의 결과 !!!!");
			// DB
			// 변수
			// 연산
			// 메소드호출
			// 객체 생성
			// break; // breack 가 생략 되면 멈추지 않고 위에서 부터 계속 처리된다.

		case 2:
			System.out.println("2일 때 처리");
			// break;

			// default: // 위에 정의 된 case 조건에 맞지 않는 나머지
			// System.out.println("1이 아닌 나머지");
			// break; //생략가능
		}

		// 결과 값이 나오지 않는 이유는 case1 에서도 case2 에서도 만족하지 못했기 때문에 아무결과도 나오지 않는다.
		// ->default도 생략 했기에 나머지값도 없음.
	}

}
