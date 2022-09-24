package chapter04;

public class WhileLoop {

	public static void main(String[] args) {
		// 5번 "JAVA"를 출력하는 코드 작성
		// 5번 출력물 실행

//		System.out.println("JAVA");
//		System.out.println("JAVA");
//		System.out.println("JAVA");
//		System.out.println("JAVA");
//		System.out.println("JAVA");

		/*
		 * //기본적인 while의 문 반복체크 할 변수
		 * 
		 * while(반복의 조건) { 반복해야할 코드
		 * 
		 * 변수 증감 연산 }
		 */

		// 5번 "JAVA"를 출력하는 코드 작성
		// 5번 출력물 실행
		int count = 0; // 0 1 2 3 4 5

		while (count++ < 5) { // 0
			System.out.println("JAVA");

			// 반복문을 탈출할 수 있는 증감식
			// count = count + 1; // count가 2번 들어갈 수 있는 이유는 count가 변수이기 때문에 가능하다.
			// count += 1;
			// count++;
			// ++count; //<-이걸 생략하는 대신 조건문에 count++을 달아서 코드를 줄일 수 있다.

		}
	}

}
