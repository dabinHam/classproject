package chapter02;

public class ValiableIntergerTest {

	public static void main(String[] args) {

		// 정수 : byte short int(기본타입) long
		// 1byte 2byte 4byte 8byte

		int num = 100;

		// byte type
		byte byteNum1 = 10;
		byte byteNum2 = 127;
		// byte byteNum3 = 128; // byte 는 -127~128까지의 값을 저장.
		byte byteNum3 = (byte) 200; // 형 변환을 시켜줌

		System.out.println(byteNum1);
		System.out.println(byteNum2);
		System.out.println(byteNum3);

		// long type
		// int longNum1 = 2200000000; // int는 21억까지밖에 저장이 안됨.
		// long longNum1 = 2200000000; // 그래서 long를 했는데도 오류가 나는 이유는?
		long longNum1 = 2200000000L; // 접미사를 안썻기 때문에

		int num1 = 100000;
		int num2 = 100000;

		// 곱 연산
		// int result = num1 * num2; //결과 값 : 1410065408 [int로 연산을 했기 때문에 앞자리는 짤리고
		// 다른결과값이 나온다.]
		// int result = (long)num1 * num2; // long * long => long
		long result = (long) num1 * num2;

		System.out.println(result);

	}

}
