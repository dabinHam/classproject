package chapter06;

public class ArrayTest3 {

	public static void main(String[] args) {

		// 10명의 국어점수를 저장하는 배열 선언하고 생성
		int[] korScore = new int[10];

		
		// 배열 요소의 초기화 <-실질적인 값을 입력하는 곳.
		korScore[0] = 84;
		korScore[1] = 50;
		korScore[2] = 20;
		korScore[3] = 88;
		korScore[4] = 77;
		korScore[5] = 10;
		korScore[6] = 100;
		korScore[7] = 50;
		korScore[8] = 32;
		korScore[9] = 92;

		System.out.println();
		sum(korScore);

	}

	public static void sum(int[] arr) {

		// arr => korScore 의 배열 인스터스 주
		int sum = 0;

		// for문을 몰랐다면 하나하나 일일히 다 더해야함..
		// sum = korScore[0] + korScore[1] + korScore[2] + ..... korScore[9];

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

		}

		System.out.println("전체 점수의 총점 : " + sum);
		System.out.println("반 평균 : " + (float) sum / arr.length); // float타입으로 나오게 하고싶을때
	}

}