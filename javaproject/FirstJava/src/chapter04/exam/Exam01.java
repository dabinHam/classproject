package chapter04.exam;

public class Exam01 {

	public static void main(String[] args) {
		// 문제 1.
		// for 문을 이용하여 1부터 10까지를 곱해서 그 결과를 출력하는 프로그램을 작성

		// 1*2*3*4...*10 -> (1*2)*3*4...*10 -> ((1*2)*3)*4...*10 -> (((1*2)*3)*4)...*10
		// -> ((((1*2)*3)*4)...*10)

		int result = 1; // 곱셈의 경우는 0으로 초기화하면 안된다 0은 어떠한 수를 곱해도 0 이기 때문. 덧셈일때만 0
		int sum = 0;

		for (int i = 1; i < 11; i++) {
			// System.out.println(i);

			// result = result *i;
			result *= i;
			System.out.println(i + " : " + result + "\n");
		}

	}

}
