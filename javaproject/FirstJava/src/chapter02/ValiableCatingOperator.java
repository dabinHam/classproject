package chapter02;

public class ValiableCatingOperator {

	public static void main(String[] args) {

		char c1 = 'a';

		int result = c1 + 10; // char + int => int + int => 결과 int

		System.out.println(result);

		int num1 = 10;
		float num2 = 10.0f;

		float result2 = num1 + num2; // int + float => float + float => float

		System.out.println(result2);

		float num3 = 1.2f;

		double num4 = num3; // 대입연산

		System.out.println(num4);

		// double result3 = num3 + num4; // 출력값 : 2.4000000953674316
		// double result3 = num3*10 + num4*10; // 출력값 : 24.000000476837158
		// double result3 = (int)(num3*10 + num4*10); // 출력값 : 24.0
		double result3 = (int) (num3 * 10 + num4 * 10) / 10.0; // 출력값 : 2.4

		System.out.println(result3);

	}

}
