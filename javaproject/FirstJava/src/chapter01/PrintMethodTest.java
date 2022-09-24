package chapter01;

public class PrintMethodTest {

	public static void main(String[] args) {

		// print 메소드 : 매개변수로 전달하는 데이터를 출력
		System.out.print("개인 소개");

		// println : 매개변수로 전달된 데이터를 출력하고 개행(줄을 바꾼다) =
		System.out.println();

		System.out.print("이름 : 함다빈");
		System.out.println();
		System.out.println("나이 : 28");
		System.out.println("직업 : 학생");

		// printf("문자열의 규칙", 데이터 , 데이터, 데이터)
		// 정수 : %d
		// 문자열 : %s
		// 실수 : %f(실수) , %e(지수표현)

		// 문자열 저장 변수선언 : String 변수이름 = "함다빈";
		String userName = "함다빈";
		int age = 28;
		float height = 167.1f; // float - 소수점 7~9 까지 표현해주는 실수 [정확한 값을 표현하지 못하기 때문에 0.1로 입력했어도 0.1로 저장되지 않음.]
		String job = "학생";

		// System.out.printf("이름 : 함다빈 , 나이 : 28 , 키: 167.4cm , 직업 : 학생" );
		System.out.printf("이름 : %s , 나이 : %d , 키: %f , 직업 : %s", "함다빈", 28, 167.1f, "학생");

		System.out.println();

		System.out.printf("이름 : %s , 나이 : %d , 키: %f , 직업 : %s", userName, age, height, job);

	}

}
