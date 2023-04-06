package chapter10.exam;

import java.util.regex.Pattern;

public class Exam1Main {
	/*
	 * 콘솔에서 사용자 아이디를 입력 받아 
	 * 정상적인 영문자와 숫자로만 이루어진 값을 입력했는지 확인하는 프로그램을 만들어봅시다. 
	 * 1 사용자 예외클래스를 정의해서 예외를 발생 시켜 봅시다. 
	 * 2 예외 클래스 이름은 BadIdInputException이라고 정의합시다.
	 */
	public static void main(String[] args) {
		// 정상적인 영문자와 숫자로만 이루어진 값을 입력했는지 확인하는 프로그램을 만들어봅시다.
		// 'a' <= c <= 'z' || 'A' <= c <= 'Z' || '0' <= c <= '9'   < char c = str.charAt(i);
		// = "^[a-z0-9A-z]*$"
		
		// 
		
		String str = "abc12ABC";
		
		// ^ : 패턴의 시작을 의미 , $ : 패턴의 종료를의미 , 
		// [] : 특정데이터들의 집합 , - : 범위 , * : 앞에 문자가 있을수도있고 없을수도있고..
		boolean chk1=Pattern.matches("^[a-z0-9A-Z]*$", str); 
		System.out.println(chk1);
		
		try {
		if(!chk1) {
			throw new Exception();
			}
		}catch(Exception e) {
			System.out.println("소문자, 대문자, 숫자 입력만 가능합니다.");
		}
		
	 // "^[a-z]*$" : a~z(영소문자) 까지만 들어가는 패턴, "^[a-z0-9]*$" : a~z, 0~9까지만 들어가는패턴
		// 숫자만 -> ^[0-9]*$
		// 영문자만 ->[a-zA-Z]*$
		// 한글만 -> ^[가-힣]*$
		// 영어+숫자 -> ^[a-z0-9A-Z]*$
		// 이메일 : ^[a-zA-Z0-9]+@+[a-zA-Z0-9]+\.+[a-z-Z]+$ 			입력조건 : qqq@naver.com
		// + : 기호의 앞이나 뒤에 써줘야한다. ex) +@ : @앞에 숫자나 문자가 꼭 있어야 한다는 뜻. 앞뒤로있으면 +@+ 다써줘야한다. [패턴]인경우는 필수적으로 사용해줘야한다. 
		
		// 핸드폰 번호 : ^\d{3}-\d{4}-\d{4}
		
		// ? : 앞에 문자가 하나 이거나 없거나
		// | : or 과 같음 또는이라는 뜻
		// . : dot 이라는 문자표현 , . 하나만 쓰면 인식하지못하기 때문에 \.역슬래시 들어가야한다.
		// \w : 알파벳 + 숫자
		// \d : = [0-9]숫자형식의 문자가 들어온다. \d{2,3} : 어떤 숫자가 2,3개 들어온다. 
		
		System.out.println(Pattern.matches("^\\d{3,4}-\\d{4}-\\d{4}+$", "010-9999-9999"));
	}
}
