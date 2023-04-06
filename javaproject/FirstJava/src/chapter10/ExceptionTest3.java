package chapter10;
// 사용자 정의 예외 클래스
public class ExceptionTest3 {
	// 보통은 큰 흐름에서 예외처리가 적절하다.
	public static void main(String[] args) {
		try {
			check1();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	static void check1() throws ClassNotFoundException {
		check2();
	}

	static void check2() throws ClassNotFoundException {

		Class.forName("Null");

	}

}
