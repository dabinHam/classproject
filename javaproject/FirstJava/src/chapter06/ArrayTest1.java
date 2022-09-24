package chapter06;

public class ArrayTest1 {

	public static void main(String[] args) {

		// 배열 : 많은 수 의 변수를 다루어야할 때 사용
		// 일괄 처리 할수있는 장점을 가진다.
		// 배열의 특징 : 변수 여러개를 순차적으로 만든것과 같은 효과를 가진다
		// 메모리를 옆에 붙여서 생성
		// 배열 변수 => 타입[] 변수이름 -> 이걸 제일 많이 사용한다.
		// 타입 변수이름[]
		// 배열 생성 : 메모리 공간 생성, 변수들을 생성
		// new 타입[개수] => []안에 입력한 숫자만큼의 메모리공간(변수)을 생성

		// 10명의 국어점수를 저장하는 배열 선언하고 생성
		int[] korScore = new int[10];

		// 배열의 사이즈를 가지고 있는 length
		System.out.println("배열의 요소 개수 : " + korScore.length);

		// 배열의 참조 방법 : 변수이름[index]
		// index 0부터 배열요소개수 -1
		// index => 0~9
		for (int i = 0; i < korScore.length; i++) { // index 는 0 부터 1 까지 1씩 증가하니까 ++

			int temp = korScore[i];
			System.out.println(i + " : " + temp);

		}

		// 배열 요소의 초기화
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

		int sum = 0;

		// for문을 몰랐다면 하나하나 일일히 다 더해야함..
		// sum = korScore[0] + korScore[1] + korScore[2] + ..... korScore[9];

		for (int i = 0; i < korScore.length; i++) {
			sum += korScore[i];

		}

		System.out.println("전체 점수의 총점 : " + sum);
//		System.out.println("반 평균 : " + sum/korScore.length);
		System.out.println("반 평균 : " + (float) sum / korScore.length); // float타입으로 나오게 하고싶을때

	}



}
