package chapter09.exam;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// * 4. 자신의 생일을 기준으로 오늘까지 몇 일을 살았는지 출력하는 프로그램을 만들어봅시다.
public class Exam4Main {

	public static void main(String[] args) {
		
		LocalDate birthDay = LocalDate.of(1995, 7, 26);
		LocalDate now = LocalDate.now();
		
		long days = ChronoUnit.DAYS.between(birthDay, now);	// 일수
		long days1 = ChronoUnit.MONTHS.between(birthDay, now); // 개월
		long days2 = ChronoUnit.YEARS.between(birthDay, now); // 년도
		System.out.println("내가 태어난지 "+days+"일");
		System.out.println("내가 태어난지 "+days1+"개월");
		System.out.println("내가 태어난지 "+days2+"년");
		
		LocalDate cDay = LocalDate.of(2022, 12, 25);
		long days3 = ChronoUnit.DAYS.between(now, cDay);
		System.out.println("크리스마스지 남은 일 수?"+days3 + "일");
		
		LocalDate dDay = now.plusDays(88);
		System.out.println("오늘부터 88일이 지나면? >>"+dDay);
	}
	
}
