package chapter04;

public class ContinueTest {

	public static void main(String[] args) {

		// 1~9 사이에 홀수만 출력

		int num = 0;

		while (++num < 10) { // 아래 continue를 사용하여 여기에 붙혀줘야 실행이 된다.

			if (num % 2 == 0) {
				continue;
			}

			System.out.println(num);

			// num++; // 위에서 continue를 사용하는순간 건너뛰게 되면서 ++이 실행하지 않게된다. 그래서 위에 ++을 붙혀줘야 한다

		}

	}

}
