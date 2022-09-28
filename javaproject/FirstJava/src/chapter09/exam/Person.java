package chapter09.exam;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/* 위 Person 클래스의 equals() 메소드를 오버라이딩해서 주민등록번호가 같으면 인스턴스로 판별하는 프로그램을 만들어봅시다.
 * 2. 1~100,000,000까지 더하기하는 연산의 실행 시간을 측정하는 프로그램을 만들어봅시다.
 * 3. 사용자에게 이름을 입력 받아 입력 받은 문자열을 정상적인 문자열의 이름으로 표현하는지 판별하고,
 * 	  공백으로 입력되었는지도 판별하는 프로그램을 만들어봅시다.
 * 4. 자신의 생일을 기준으로 오늘까지 몇 일을 살았는지 출력하는 프로그램을 만들어봅시다.
 * */

public class Person {
	String name;
	String personNumber;

	public Person(String name, String personNumber) {
		super();
		this.name = name;
		this.personNumber = personNumber;
	}

	// Person 클래스의 equals() 메소드를 오버라이딩
	// 주민등록번호가 같으면 인스턴스로 판별하는 프로그램을 만들어봅시다.

	@Override
	public boolean equals(Object obj) {
		boolean result = false;

		if (obj != null && obj instanceof Person) {
			Person person = (Person) obj;
			result = this.personNumber.equals(person.personNumber);
		}
		return result;
	}

	public static void main(String[] args) {
		///////////// 문제 1
		Person p1 = new Person("AAA", "000000-3333333");
		Person p2 = new Person("BBB", "111111-2222222");
		Person p3 = new Person("CCC", "000000-3333333");
		Person p4 = new Person("DDD", "000000-1111111");

		System.out.println("문제1. 주민등록번호가 같으면 인스턴스로 판별하는 프로그램\n");
		System.out.println("p1과 p2는 동일인물 인가요? =>" + p1.equals(p2));
		System.out.println("p2과 p3는 동일인물 인가요? =>" + p2.equals(p3));
		System.out.println("p3과 p1는 동일인물 인가요? =>" + p3.equals(p1));
		System.out.println("p4과 p2는 동일인물 인가요? =>" + p4.equals(p2));
		System.out.println();
		System.out.println("--------------------------------------\n");

		////////////// 문제 2
		// 1~100,000,000까지 더하기하는 연산의 실행 시간을 측정하는 프로그램을 만들어봅시다.
		System.out.println("문제2. 1~100,000,000까지 더하기하는 연산의 실행시간을 측정하는 프로그램 \n");
		long startTime = System.currentTimeMillis();
		System.out.println("시작 : " + startTime);

		int sum = 0;
		for (int i = 1; i <= 100000000; i++) {
			sum += i;
		}

		long endTime = System.currentTimeMillis();
		System.out.println("종료 : " + endTime);

		long checkTime = endTime - startTime;
		System.out.println("연산 소요 시간 : " + checkTime);

		System.out.println("1 ~ 100,000,000 의 총 합은? : " + sum);
		System.out.println();
		System.out.println("--------------------------------------\n");
		
		//////////////문제 4
		// 자신의 생일을 기준으로 오늘까지 몇 일을 살았는지 출력하는 프로그램을 만들어봅시다.
		System.out.println("문제4. 생일을 기준으로 나는 오늘까지 몇 일을 살았는지 출력하는 프로그램\n");
		System.out.println("생일 : 1995년 7월 26일\n");
		LocalDate birthDay = LocalDate.of(1995, 7, 26);
		LocalDate now = LocalDate.now();
		
		long days = ChronoUnit.DAYS.between(birthDay, now);
		long days1 = ChronoUnit.MONTHS.between(birthDay, now);
		long days2 = ChronoUnit.YEARS.between(birthDay, now);
		
		System.out.println("내가 태어난지 "+days+" 일");
		System.out.println("내가 태어난지 "+days1+" 개월");
		System.out.println("내가 태어난지 "+days2+" 년");
		System.out.println();
		LocalDate cDay = LocalDate.of(2023, 01, 01);
		long days3 = ChronoUnit.DAYS.between(now, cDay);
		System.out.println("새해 까지 남은 일 수? >> "+days3 + "일");
		
		LocalDate dDay = now.plusDays(days3);
		System.out.println("오늘부터 "+days3+"일이 지나면? >>"+ dDay);

	}

}
