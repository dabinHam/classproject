package chapter02;

public class ValiableRealNumber {

	public static void main(String[] args) {

		// 실수 타입 : double, float
		// 8byte 4byte
		// int = 4byte, long = 8byte , 단순히 8byte라서 더 크다 가아니라 표현할 수 있는 범위의 차이.

		// 실수의 기본 = double , 정수의 기본 = int
		// double 타입
		// double num1 = 0.3d; // d=접미사
		double num1 = 0.3; // num1 = double 타입의 데이터
		double num3 = 1.1234567891023456789; // 마지막 789는 표현이안되기 때문에 마지막 6을 반올림하여 값이 1.1234567891023457가 출력됨.

		System.out.println(num1);
		System.out.println(num3);

		// float 타입
		// float num2 = 0.3; // f=접미사 가 없어서 오류
		float num2 = 0.3f; // num2 = double 타입의 데이터
		float num4 = 1.1234567891023456789f;

		System.out.println(num2);
		System.out.println(num4);

		double num5 = 1.1;
		double num6 = 1.3;

		double result = num5 + num6; // 출력 값 : 2.4000000000000004 <- 2.4를 표현할 수 있는 근사 값

		System.out.println(result);

	}

}
