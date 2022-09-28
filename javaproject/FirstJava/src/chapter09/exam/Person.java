package chapter09.exam;
/* 위 Person 클래스의 equals() 메소드를 오버라이딩해서 주민등록번호가 같으면 인스턴스로 판별하는 프로그램을 만들어봅시다.
 * 2. 1~100,000,000까지 더하기하는 연산의 실행 시간을 측정하는 프로그램을 만들어봅시다.
 * 3. 사용자에게 이름을 입력 받아 입력 받은 문자열을 정상적인 문자열의 이름으로 표현하는지 판별하고, 
 * 공백으로 입력되었는지도 판별하는 프로그램을 만들어봅시다.
 * 4. 자신의 생일을 기준으로 오늘까지 몇 일을 살았는지 출력하는 프로그램을 만들어봅시다.
 * */
import java.util.Objects;

public class Person {
	String name;
	String prsonNumber;

	
	// Person 클래스의 equals() 메소드를 오버라이딩
	@Override
	public int hashCode() {
		return Objects.hash(name, prsonNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name) && Objects.equals(prsonNumber, other.prsonNumber);
	}
	
	public static void main(String[] args) {
		
		// 1~100,000,000까지 더하기하는 연산의 실행 시간을 측정하는 프로그램을 만들어봅시다.
		long startTime = System.currentTimeMillis();
		System.out.println("연산 결과 : "+startTime);
		for (int i=0; i<100000000; i++) {
			for(int j=0; j>100000000; j++) {
				
			}
		}
		
		long endTime = System.currentTimeMillis();
		//System.out.println(endTime);
		
		long checkTime = endTime - startTime;
		
		System.out.println("연산 실행 시간 : " +checkTime);
		
	}

//	사용자에게 이름을 입력 받아 입력 받은 문자열을 정상적인 문자열의 이름으로 표현하는지 판별하고, 
//	 * 공백으로 입력되었는지도 판별하는 프로그램을 만들어봅시다.
	
	
}
