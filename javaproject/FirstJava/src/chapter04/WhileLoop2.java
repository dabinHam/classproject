package chapter04;

public class WhileLoop2 {

	public static void main(String[] args) {

		int cnt = 0;

		// 무한 반복을 이용해서 5번 출력
		while (true) {
			System.out.println("JAVA");

			if (++cnt > 4) { // 몇번 반복 해야할지 모를때 사용 // 결과 값 5
				break; // 블럭을 벗어나도록 해주는 역할
			}
		}

		// 짝수 이면서 : num%2 == 0
		// 7의 배수인 수 : num%7 == 0

		int num = 0;

		while (true) {

			if (num % 2 == 0 && num % 7 == 0) {
				System.out.println("짝수 이면서 7의 배수인 0과 가장 가까운 수 : " + num);
				break;
			} else {
				num++;
			}
		}

	}

}
