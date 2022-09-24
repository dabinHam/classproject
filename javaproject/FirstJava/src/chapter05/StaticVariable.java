package chapter05;

public class StaticVariable {

	static int cv; // class 변수
	int iv;

	// static float pi = 3.14f;
	// 상수를 생성할때에는 final 이라는 키워드를 사용해준다
	// 상수 : 변하지 않는 수
	// 상수의 식별자 는 모두 대문자로 사용
	static final float PI = 3.14f;

	public static void main(String[] args) { // class 변수

		System.out.println(cv);
		// System.out.println(iv); // iv 는 class변수가 아니기 때문에 오류, 사용할수 없다.
		System.out.println(StaticVariable.PI);

	}

}
