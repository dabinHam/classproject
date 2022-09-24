package chapter03;

public class PostfixOperator {

	public static void main(String[] args) {

		int num1 = 5;
		System.out.println("num1 : " + num1);

		int num2 = num1++; // num2 = num1 -> num1 = num1 + 1
							// num2 = 5, num1 =6

		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);

		System.out.println("num1 : " + num1++); // 출력값은 6이지만 연산이 끝나면 7이 된다. 그래서 어느값을 선택해서 넣어야하는지 확인하고 선택해서 넣어야 한다.

		//

	}

}
