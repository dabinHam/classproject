package chapter03;

public class PrefixOperator {

	public static void main(String[] args) {

		int num1 = 5;

		System.out.println("num1 : " + num1);

		int num2 = ++num1; // num1 = num1 + 1 -> num2 = num1 ;

		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);

		System.out.println("num1 : " + ++num1); // <- 오른쪽에서 왼쪽으로 계산된다. 전위형은 먼저 증가시키고 대입한다.

	}

}
