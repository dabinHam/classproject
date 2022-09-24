package chapter03;

public class CharTypeOperator {

	public static void main(String[] args) {

		char c1 = 'A';

		int codeNum = c1 + 0; // char +int => int + int = int

		System.out.println(codeNum);

		// 실질적으로 c1 은 67을 출력한 적이 없다.
		System.out.println(++c1); // 66 출력 c1 = 66
		System.out.println(c1++); // 66 출력 c1 = 67
		System.out.println(++c1); // 68 출력 c1 = 68

	}

}
