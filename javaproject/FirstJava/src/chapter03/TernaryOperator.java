package chapter03;

public class TernaryOperator {

	public static void main(String[] args) {

		// 삼항연산문 : 특정값을 비교하여 결과값을 내는것이.
		// 중첩도 가능하다.

		int age = 15; // 회원의 나이
		boolean chk = false; // 성인 판별 : 성인이면 true, 미성년이면 false

		// chk = 상태값(논리값: 조건식) ? true : false ;
		chk = age > 19 ? true : false; // 성인 판별코드
		System.out.println("성인 판별값 : " + chk);

		String msg = age > 19 ? "성인입니다." : "미성년입니다."; // 메시지출력 = age가 19보다 크면 "성인입니다." age가 19보다 작으면 "미성년입니다."

		System.out.println(msg);
		// return 을 사용하면 조건식과 연산코드를 쓰지 않아도 쓸 수 있다.

		System.out.println("-------------------------------------------------");
		// ---------------------------------------------------------

		int num1 = 2;
		int num2 = 5;

		// 큰수 : 같은 수는 없다!!
		int maxNum = num1 > num2 ? num1 : num2;
		System.out.println("큰수 : " + maxNum);

		// 작은수
		int miniNum = num1 > num2 ? num2 : num1;
		System.out.println("작은 수 : " + miniNum);

		// 홀수 짝수 판별 : 2로 나눈 나머지 값으로 비교
		// 홀수 : 나머지 값 = 1
		// 짝수 : 나머지 값 = 2
		String result = num1 % 2 == 1 ? "홀수 입니다." : "짝수 입니다.";
		System.out.println("num1의 값은 " + result);

		System.out.println("-------------------------------------------------");
		// ---------------------------------------------------------

		// 삼항연산자의 중첩
		int num3 = 0;

		// 양수 음수 0 판단해서 결과 메시지를 출력하는 코드를 작성해보자
		// 먼저 0을 판단
		String msg1 = num3 > 0 ? "양수 입니다." : num3 == 0 ? "0입니다." : "음수 입니다."; // "0입니다.", "양수 입니다.", "음수 입니다."

		System.out.println("변수 num3은 " + msg1);

		// 절대값
		int resultNum = num3 > 0 ? num3 : num3 == 0 ? 0 : -num1; // -num1 = (num1 * -1)
		System.out.println("num3의 절대값은 " + resultNum);

	}

}
