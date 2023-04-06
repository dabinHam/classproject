package chapter10;

import java.util.Scanner;

// 명시적(논리적) 예외 발생
// 1. main 메소드에 throws Exception를 넣어서 하는 방법
// 2. try ~ catch 구문 이용 방법
// 3. 2번 + while 를 이용하는 방법
public class ExceptionTest2 {

	public static void main(String[] args) {

		// 명시적인 예외 발생!
		// throw new Exception("강제적 예외발생");

		// 국어 점수 입력 받기 : 점수 범위 -> 0~100

		Scanner sc = new Scanner(System.in);
		while (true) { // <- 정상값이 나올 때 까지 반복
			System.out.print("국어 점수를 입력하세요 >> ");
			int score = sc.nextInt();

			// 특정 조건을 벗어났을 때 예외를 발생시킴. (throw e;)
			// main 메소드에 throws Exception 가 있어야함.
//		if(!(score>=0 && score<100)) { // 논리부정을 사용하는 방법.
//			throw new Exception("입력한 점수는 정상 범위가 아닙니다."); //<- 예외가 발생 할 수있는 부분
//		}
//		
//		System.out.println("국어 점수는 : " + score + "점 입니다.");

			// try를 이용하는 방법
			try {
				if (!(score >= 0 && score < 100)) { // 논리부정을 사용하는 방법.
					//throw new Exception("입력한 점수는 정상 범위가 아닙니다."); // <- 예외가 발생 할 수있는 부분
					throw new BadInputException(score);
				}
				System.out.println("국어 점수는 : " + score + "점 입니다.");
				break; // <- 정상처리가 되었을때 여기서 종료하게 만드는것.
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("다시 입력해주세요.");
			}
		}
	}

}
