package chapter07.exam;

//2)Person 클래스를 상속해서 확장하는 새로운 클래스 Male 클래스와 Female 클래스를 정의 해봅시다.
//1 각 클래스는 상속 받은 멤버 외에 추가적인 변수와 메소드를 추가해서 새로운 클래스를 정의해봅시다. 
//2 Person 클래스에서 정의된 인사하는 메소드를 오버라이딩 해봅시다.
//3 Person 클래스에 생성자를 정의해서 인스턴스 변수들을 초기화 해봅시다.

public class Male extends Person {

	int grade;
	String gender;
	
	public Male(String name, String personNumber, int grade,String gender) {
		super(name, personNumber);
		this.grade = grade;
		this.gender = gender;
	}
	
	void hi() {
		System.out.println("안녕하세요!");
	}
	
	@Override
	void printInfo() {
		super.printInfo();
		System.out.printf("학년은 %d 이고 , 성별은 %s 입니다.",this.grade, this.gender);
	}

}
