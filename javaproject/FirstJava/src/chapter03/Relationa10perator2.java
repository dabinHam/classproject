package chapter03;

public class Relationa10perator2 {

	public static void main(String[] args) {

		// 관계연산자 ( 비교연산자 )
		// > < >= <= == !=

		// 관계연산도 자료형을 일치시켜놓고 연산이 이루어진다.
		// 형변환을 하는것도 연산 = 자료형을 바꾸는 것 이기 때문에
		char c = 'A'; // 65
		int num = 10;

		int codeNum = c + num; // 65 + 10
		System.out.println(codeNum); // 75 // 자동으로 형 변환이 이루어진다.

		System.out.println(c > num); // 65 > 10 /true
		System.out.println('1' > '0');
		System.out.println(num == 10f); // int == float => float == float

	}

}
