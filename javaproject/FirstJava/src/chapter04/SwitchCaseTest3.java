package chapter04;

public class SwitchCaseTest3 {
	// 권한을 부여하는 경우

	public static void main(String[] args) {

		String grade = "admin";
		// admin / manager / member / anyone

		// 쓰기 / 읽기 / 회원 승인 / 지표 보기

		// Switch문 대신 if문을 사용 했을 때
		if (grade.equals("admin")) { // 문자가 같은지 비교해준것 / equals 메서드 = grade의 문자열과 매개 변수로 받은 문자열이 같은지 비교하여 참,거짓으로 알려줌
										// **문자열을 비교할땐 무조건 equals를 사용한다.
			System.out.println("지표보기 기능 가능");
			System.out.println("회원승인 가능");
			System.out.println("쓰기 기능 가능");
			System.out.println("읽기 가능");
		} else if (grade.equals("manager")) {
			System.out.println("지표보기 기능 가능");
			System.out.println("회원승인 가능");
			System.out.println("쓰기 기능 가능");
			System.out.println("읽기 가능");
		} else if (grade.equals("member")) {
			System.out.println("쓰기 기능 가능");
			System.out.println("읽기 가능");
		} else if (grade.equals("anyone")) {
			System.out.println("읽기 가능");
		}

		// 위의 if문을 switch으로 변경하였을 때
		switch (grade) {
		case "admin":
			System.out.println("지표보기 기능 가능");
		case "manager":
			System.out.println("회원승인 가능");
		case "member":
			System.out.println("쓰기 기능  가능");
		default:
			System.out.println("읽기 가능");
		}

	}

}
