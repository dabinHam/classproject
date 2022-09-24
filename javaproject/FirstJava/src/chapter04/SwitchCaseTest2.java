package chapter04;

public class SwitchCaseTest2 {
	// 범위를 비교할때 사용하는 경우

	public static void main(String[] args) {

		// 90점 이상 : A 90~100 => score / 10 = 9또는 10
		// 80점 이상 : B 80~89 => score / 10 = 8
		// 70점 이상 : C 70~79 => score / 10 = 7
		// 70점 미만 : F 69 이하 //조건을 정해주지 않아도 위에 조건대로 따라 내려옴

		int score = 99;
		char c = 'A';

		// key : int 가능한 숫자, String(문자열)
		// key : byte, short, int, char(유니코드로 표현할 수있기 때문에 사용가능하다.)
		switch (score / 10) {

		/*
		 * case 10 : System.out.println("A"); break;
		 */
		// 값이 공통 되어서 합칠 수 있을 때 아래와 같이 적어서 합칠 수 있다. case8 도 합칠 수 있으면 옆에 case8: 을 붙히면 된다.
		case 9:
		case 10:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("F");
		}

	}

}
