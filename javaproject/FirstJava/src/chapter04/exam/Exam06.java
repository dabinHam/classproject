package chapter04.exam;

public class Exam06 {

	public static void main(String[] args) {

		/*
		 * 1 부터 99까지의 합을 구하는 프로그램 작성 => 필요한 숫자를 뽑아내는 것이 중. while문, for문, do while 문을 각각
		 * 사용
		 */

		int num = 1;

		int sum = 0;

		// while문
		while (num < 100) {
			System.out.println(num);
			sum += num;
			num++; // 추가하지 않으면 무한루프. 추가하면 99까지 나옴.
		}

		System.out.println("while 문을 이용한 1~99 까지의 합 : " + sum);
		num = 1;
		sum = 0;

		// for문
		for (num = 1; num < 100; num++) {
			// System.out.println(num);
			sum += num;
			num++;
		}
		System.out.println("for문을 이용한 1~99 까지의 합 : " + sum);

		// System.out.println(num); // 초기화를 시켜줌 으로써 밖으로 빠져나와 99까지만 나오던 숫자가 100까지 나옴.

		num = 1;
		sum = 0;

		// do while문
		do {
			// System.out.println(num);
			sum += num;
			num++;

		} while (num < 100);

		System.out.println("do while문을 이용한 1~99 까지의 합 : " + sum);

	}

}
