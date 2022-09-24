package chapter04;

public class ForLoopTest2 {

	public static void main(String[] args) {

		// 구구단 2단
		// 2 X 1 = 2
		// 2 X 2 = 4
		// ....
		// 2 X 9 = 18
		// 구구단 3단
		// 3 X 1 = 3
		// 3 X 2 = 6
		// ....
		// 3 X 9 = 27
		// ....
		// 구구단 9단
		// 9 X 1 = 9
		// 9 X 2 = 18
		// .../.
		// 9 X 9 = 81

		//// 반복의 규칙을 찾자.
		// -------------------------------------------

		// 단의 반복: 2~9
		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			System.out.println("-----------------");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + i * j);

			}

			System.out.println("-----------------");

		}

		// 보통 중첩의 경우 바깥에 큰 요소들이 있고 안쪽으로 갈수록 작아짐. 많이 쓰이는 경우는 없다.

//		for(int i=1 ; i<=9 ; i++) { // 1++만 쓰지말고 변화되는 패턴과 횟수를 찾아서 적합하게 사용
//			System.out.println("2 X " + i + " = " + (2*i) ); //(2*i)의 () 는 생략 할 수있지만 우선순위를 위하여 삽입

//	}

	}

}
