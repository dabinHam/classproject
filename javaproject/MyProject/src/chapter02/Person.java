package chapter02;

import java.util.Scanner;

public class Person {
//	① 회원이름을 저장하는 변수
//	② 회원 전화번호 ( 000-0000-0000 )를 저장하는 변수 // 문자열(String)으로 받기 숫자형식이긴 하지만 '-'이 들어가서 문자열이다.
//	③ 회원 주민등록번호 ( 000000-0000000 또는 0000000000000 )를 저장하는 변수 //<-최근에는 법이 개정되어 금융권이나 공공기관이 아니면 받지않는다. 숫자로 표현하고 싶다면 int가 아닌 long 타입으로 들어가야한다.
	
	public static void main(String[] args) {

		//회원이름을 저장하는 변수
		String memberName = null; 
		//회원 전화번호 ( 000-0000-0000 )를 저장하는 변수 
		String phoneNumber = null;  
		//회원 주민등록번호 ( 000000-0000000 또는 0000000000000 )를 저장하는 변수
		String personNumber = null;
		
		memberName = "함다빈";
		phoneNumber = "010-1234-5678";
		personNumber = "950726";
		
		System.out.println("회원이름 : " + memberName);
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("주민등록번호 : " + personNumber);
		
	}

}
