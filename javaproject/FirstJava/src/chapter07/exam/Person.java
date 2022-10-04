package chapter07.exam;

import java.time.LocalDate;

/* 1) Person 이라는 클래스를 정의해봅시다.
 * 1 이름을 저장하는 변수, - 주민등록번호를 저장하는 변수를 정의해봅시다.
 * 2 인사하는 메소드를 정의해봅시다. - “안녕하세요. 저는 OOO입니다. 00살 입니다.”라는 문자열이 출력하도록 정의합시다.
 * ---------------------------------
 * 2) Person 클래스를 상속해서 확장하는 새로운 클래스 Male 클래스와 Female 클래스를 정의 해봅시다.
 * 1 각 클래스는 상속 받은 멤버 외에 추가적인 변수와 메소드를 추가해서 새로운 클래스를 정의해봅시다. 
 * 2 Person 클래스에서 정의된 인사하는 메소드를 오버라이딩 해봅시다.
 * 3 Person 클래스에 생성자를 정의해서 인스턴스 변수들을 초기화 해봅시다.
 * ---------------------------------
 * 3) main()메소드를 정의해봅시다.
 * 1 Person 클래스를 상속받은 Male클래스와 Female클래스를 이용해서 인스턴스를 생성해 봅시다. 
 * 2 생성된 인스턴스들을 이용해서 메소드를 호출해봅시다.
 */

public class Person {

	// Person 이라는 클래스를 정의해봅시다.
	// 이름을 저장하는 변수, - 주민등록번호를 저장하는 변수를 정의해봅시다.

	String name;
	String personNumber;

	public Person(String name, String personNumber) {
		super();
		this.name = name;
		this.personNumber = personNumber;
	}

	int getAge() {
		int result = 0;

		String tempYear = personNumber.substring(0, 2);
		String tempGender = personNumber.substring(7, 8);

		int curYear = LocalDate.now().getYear();
		int birthYear = Integer.parseInt(tempYear);
		int genderVal = Integer.parseInt(tempGender);

		if (genderVal == 1 || genderVal == 2) {
			result = curYear - (1900 + birthYear);
		} else if (genderVal == 3 || genderVal == 4) {
			result = curYear - (2000 + birthYear);
		}
		return result;
	}

	// 인사하는 메소드를 정의해봅시다.
	// - “안녕하세요. 저는 OOO입니다. 00살 입니다.”라는 문자열이 출력하도록 정의합시다.
	void printInfo() {
		System.out.printf("안녕하세요! 저는 %s입니다. %d살 입니다.", this.name, getAge());
	}

	public static void main(String[] args) {

		LocalDate curDate = LocalDate.now();
		System.out.println("오늘은 " + curDate + " 입니다.");

		Person p = new Person("함다빈", "010821-3049231");
		p.printInfo();

	}

}
