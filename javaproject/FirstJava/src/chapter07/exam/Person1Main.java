package chapter07.exam;

public class Person1Main {

	public static void main(String[] args) {
		
		Male1 m = new Male1("Yun","930608-1111111","kukui");
		Female1 f = new Female1("Ham","000726-3333333","음악",3);
		
		m.printInfo();
		m.hi();
		
		System.out.println();
		
		f.printInfo();
		System.out.println();
		System.out.println();
		f.printSchoolInfo();
		
		//상위타입 = Person , 하위타입 = m 
		//Person p1 = (Person)m; 
		Person1 p1 = m; //형변환 연산자인 (Person)을 넣어야 했지만 하위타입인 m 으로 가는거기 때문에 생략이 가능하다. 
		Person1 p2 = f;
		
		//p1.hi();	// hi()는 Person 클래스의 멤버가 아니기 때문에 호출이 불가하다.<-다형성의 특징
		//p2.printSchoolInfo(); // printSchoolInfo()는 Person 클래스의 멤버가 아니기 때문에 호출이 불가하다
		
		System.out.println();
		System.out.println("------------------------");
		p2.printInfo(); // <- 오버라이딩 되어있는 정보 출력. 오버라이딩 되어있는 메소드는 사용할 수 있다.
		
		
	}
	
}
