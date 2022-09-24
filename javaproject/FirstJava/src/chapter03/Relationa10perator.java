package chapter03;

public class Relationa10perator {

	public static void main(String[] args) {

		// 관계연산자 ( 비교연산자 )
		// > < >= <= == !=

		int num1 = 30;
		int num2 = 2;

		System.out.println(num1 > num2); // true
		System.out.println(num1 < num2); // false
		System.out.println(num1 >= num2); // true
		System.out.println(num1 <= num2); // false
		System.out.println(num1 == num2); // false
		System.out.println(num1 != num2); // true

		if (num1 > num2) {
			// 참일때 처리되는 블록
			System.out.println("num1 이 num2보다 큽니다.");
		}

	}

}
