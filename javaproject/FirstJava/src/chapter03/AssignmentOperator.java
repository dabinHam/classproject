package chapter03;

public class AssignmentOperator {

	public static void main(String[] args) {

		int num = 10;

		num += 5; // num = num + 5 -> num = 10 + 5 -> 15
		System.out.println("num : " + num);
		num -= 3; // num = num - 3 ->num = 15 - 3 -> 12
		System.out.println("num : " + num);
		num *= 2; // num = num * 2 -> num = 12 * 2 -> 24
		System.out.println("num : " + num);
		num /= 4; // num = num / 4 -> num = 24 / 4 -> 6
		System.out.println("num : " + num);
		num %= 4; // num = num % 4 -> num = 6 % 4 -> 2
		System.out.println("num : " + num);

		// 문자열이 긴 경우에 사용하는 방법 //서버에선 잘 안사용 하는 방법이다.
		String str = "안녕하세요.";
		str += "저는 함다빈 입니다."; // "안녕하세요." + "저는 함다빈 입니다."
		str += "저는 학생 입니다.";

		System.out.println(str);

	}

}
