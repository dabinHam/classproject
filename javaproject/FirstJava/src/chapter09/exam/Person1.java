package chapter09.exam;

/* 위 Person 클래스의 equals() 메소드를 오버라이딩해서 주민등록번호가 같으면 인스턴스로 판별하는 프로그램을 만들어봅시다.
 * 2. 1~100,000,000까지 더하기하는 연산의 실행 시간을 측정하는 프로그램을 만들어봅시다.
 * 3. 사용자에게 이름을 입력 받아 입력 받은 문자열을 정상적인 문자열의 이름으로 표현하는지 판별하고,
 * 공백으로 입력되었는지도 판별하는 프로그램을 만들어봅시다.
 * 4. 자신의 생일을 기준으로 오늘까지 몇 일을 살았는지 출력하는 프로그램을 만들어봅시다.
 * */
public class Person1 {

	String name;
	String personNumber;

	public Person1(String name, String personNumber) {
		super();
		this.name = name;
		this.personNumber = personNumber;
	}

	// equals() 메소드를 오버라이딩해서 주민등록번호가 같 인스턴스로 판별하는 프로그램을 만들어봅시다.
	// "000000-0000000"
	
	@Override
	public boolean equals(Object obj) { // <- 여기 Object가 person 타입이어야 personNumber를 쓸 수 있다.
		// equals : Object 가지고 있는 메소드, equals 내부에서 참조변수를 비교하여 참,거짓 판단.
		
		boolean result = false; //1순위 반환해야하는 타입 : boolean, 일단 false 만들고 가자!
		
		// 매개변수로 전달받은 객체와 비교 : 주민번호
		if(obj != null && obj instanceof Person1) { // Exam 안에 있는 Person은 형변환이 가능해야 한다.
			// Object -> Person
			Person1 person1 = (Person1)obj;
			// int 와 다르게 문자열의 비교는 equals()로 한다.
			result = this.personNumber.equals(person1.personNumber);
		}
		
		return result; // 2순위 여러개의 return 을 만들게되면 비정상적으로 끝나는 경우를 만들 가능성이 크기 때문에 주의
		
	}
	
	public static void main(String[] args) {
		
		Person1 p1 = new Person1("Yun","000000-1111111");
		Person1 p2 = new Person1("Ham","000000-1111111");
		Person1 p3 = new Person1("San","111111-2222222");
		
		System.out.println("p1 과 p2는 같은 사람인가? >> " + p1.equals(p2));
		System.out.println("p1 과 p3는 같은 사람인가? >> " + p1.equals(p3));
		
	}

}
