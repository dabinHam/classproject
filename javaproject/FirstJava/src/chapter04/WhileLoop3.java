package chapter04;

public class WhileLoop3 {
	// 응용하여 총 매출액을 구할수 도 있다.
	public static void main(String[] args) {

		// 1~10까지의 합 => 55

		// 반복 10번, 변수가 1~10

		int num = 1;

		int sum = 0; // 합을 구하는 것 이기 때문에 초기화는 무조건 0 으로 해줘야 한다.

		while (num <= 100) {

			// 합을 구하는 연
			sum = sum + num; // ((((0+1)+2)+3)...+20)

			// 증가식
			num++;

			// System.out.println(sum + "+" + num + "=" + (sum += num) );
		}

		System.out.println("1~10 까지의 합 :" + sum);
	}

}
