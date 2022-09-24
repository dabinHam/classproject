package chapter04.exam;

public class Exam03 {

	public static void main(String[] args) {
		/*
		 * 구구단의 짝수 단(2,4,8)만 출력하는 프로그램 작성. 단, 2단은 2x2까지, 4단은 4x4까지, 8단은 8x8 까지 출력
		 */

		for (int i = 2; i < 10; i *= 2) { // 만약 마지막 i *= 2 를 +=로 변경하면 2 4 6 8 이 나온
			System.out.println(i); // 2 4 8

			for (int j = 1; j <= i; j++) { // for(int j=1; j<10; j++) 이렇게 하면 2단의 1~9 까지의 곱이 다 나온다.
				System.out.println(i + " X " + j + " = " + i * j);
			}

		}

	}

}
