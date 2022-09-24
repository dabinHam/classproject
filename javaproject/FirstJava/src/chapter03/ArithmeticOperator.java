package chapter03;

public class ArithmeticOperator {

	public static void main(String[] args) {

		int num1 = 15;
		int num2 = 4;
		float num3 = 2.0f;

		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);

		// int / int = int
		System.out.println(num1 / num2); // 소수를 표현하지 못하기 때문에 원래 값은 3.75이지만 출력은 3 나옴.

		// float / float = float
		System.out.println(num1 / num3);
		System.out.println(num1 % num2); // 나머지 계산
		System.out.println(num1 % num3); //

		int result = num1 / 0; // 인타임 오류 라고 부른다.

	}

}
