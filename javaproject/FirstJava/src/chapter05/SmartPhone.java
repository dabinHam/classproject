package chapter05;

// 클래스는 인스턴스를 생성하기 위한 설계도 역할을 한다.
// 클래스에서 정의한 변수, 메소드는 바로 사용이 불가하다!
// 클래스로 인스턴스를 만들어서 사용한다! 
// Class 정의는 class 키워드를 사용해서 정의한다.
public class SmartPhone {

	// 스마트 인스턴스를 만들기 위한 설계도 역할

	// 클래스는 변수와 메소드로 구상한다.
	// 생성자 : 필수이지만 생략 가능.

	// 클래스 멤버 : 변수, 메소드
	// 클래스 내부에 정의된 변수 : 멤버 변수, 인스턴스 변수
	// 클래스 내부에 정의된 메소드 : 멤버 메소드 , 인스턴스 메소드

	// 스마트 폰의 속성 : 컬러, 사이즈, 제조사, 볼륨사이즈
	// 속성 = 변수
	// color, size, brand, volumeSize = 인스턴스 변수 , 초기화 생략 가능 => 인스턴스 생성시에 초기값으로 할당을
	// 해주기 때문.
	String color; // 스마트폰을 표현하기 위한 변수이기 때문에 클래스 블럭 안에서 바로 선언함.
	float size; // or double //0.0
	String brand = "삼성"; // 가끔 초기화를 해줘야 할땐 해줘야한다. /null
	int volumeSize; // 0

	// 전화걸기
	void call() {
		System.out.println("전화 걸기!");
	}

	// 볼륨 키우기 (음향)
	void volumeUp() {
		System.out.println("볼륨을 키웁니다.");
		volumeSize++;

	}

	// 볼륨 내리기 (음향)
	void volumeDown() {
		System.out.println("볼륨을 낮춥니다.");
		volumeSize--;

	}

	void showInfo() {
		System.out.println("폰정보");
		System.out.println("제조사 : " + brand);
		System.out.println("색상 : " + this.color); // 인스턴스의 멤버를 가르키는 키워드 : this
		System.out.println("사이즈 : " + size);
		System.out.println("볼륨크키s : " + volumeSize);
	}

}
