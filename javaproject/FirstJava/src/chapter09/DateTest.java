package chapter09;

import java.util.Date; // ctrl + shift + O 단축키(import)

public class DateTest {

	public static void main(String[] args) {
		
		Date now = new Date();
		
		System.out.println("현재 시간 : "+ now);
		
		System.out.println(now.getTime());
		
		// long 타입의 데이터로 Date 인스턴스 생성
		Date day = new Date(1664327155083L); // 리터럴 L 넣어주기
		System.out.println("day " + day);
		
		System.out.println(now.toString());
		System.out.println(day.toString());
		
		
		
	}
}
