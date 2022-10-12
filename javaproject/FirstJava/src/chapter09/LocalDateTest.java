package chapter09;
// time패키지
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTest {

	public static void main(String[] args) {
		
		// jdk 1.8 : LocalDate, LocalDateTime, LocalTime
		// 현재 날짜 가져오자!
		LocalDate now = LocalDate.now(); // 현재날짜정보를 가져온다.
		System.out.println(now);
		System.out.println(now.getYear()); // 년도 반환 // 2022
		System.out.println(now.getMonth()); // 해당 월 이름 반환 // SEPTEMBER
		System.out.println(now.getMonthValue()); // 해당 월 반환 // 9
		System.out.println(now.getDayOfWeek()); // 요일 반환 //WEDNESDAY
		System.out.println(now.getDayOfMonth()); // 일자 반환 // 28 
		
		// plusDays(1) 일자추가 , plusMonths(1) 월 추가 , plusYears(1) 년도 추가. 빼기도 가능
		LocalDate nextDay = now.plusDays(1).plusMonths(1).plusYears(1); // 날짜를 추가해준다. 
		System.out.println(nextDay);
		
		// LocalTime
		System.out.println("==================================");
		LocalTime now1 = LocalTime.now(); 
		System.out.println(now1); // 나노단위 초 까지 표현 // 11:08:48.379494
		
		System.out.println(now1.getHour()); // 현재 시간만 반환
		System.out.println(now1.getMinute()); // 현재 분 반환
		System.out.println(now1.getSecond()); // 현재 초 반환
		System.out.println(now1.getNano()); // 현재 초(나노단위) 반환 //879505000
		
		System.out.println("==================================");
		LocalDateTime now2 = LocalDateTime.now();
		System.out.println(now2);  //2022-09-28T11:12:36.243147
		System.out.println(now2.getHour());
		System.out.println(now2.getYear());
		
		System.out.println("==================================");
		// 특정 날짜, 시간 출력
		LocalDate day = LocalDate.of(2002, 12, 25);
		System.out.println(day);
		LocalTime time = LocalTime.of(15, 30, 35);
		System.out.println(time);
		LocalDateTime localDateTime = LocalDateTime.of(2022, 10, 11, 17, 05);
		System.out.println(localDateTime);
		
	}

}
