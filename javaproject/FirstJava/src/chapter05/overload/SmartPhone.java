package chapter05.overload;

// 클래스는 인스턴스를 생성하기 위한 설계도 역할을 한다.
// 클래스에서 정의한 변수, 메소드는 바로 사용이 불가하다!
// 클래스로 인스턴스를 만들어서 사용한다! 
// Class 정의는 class 키워드를 사용해서 정의
public class SmartPhone {
	
	//스마트 인스턴스를 만들기 위한 설계도 역할
	
	// 클래스는 변수와 메소드로 구상한다.
	// 생성자 : 필수이지만 생략 가능.
	
	// 클래스 멤버 : 변수, 메소드
	// 클래스 내부에 정의된 변수 : 멤버 변수, 인스턴스 변수
	// 클래스 내부에 정의된 메소드 : 멤버 메소드 , 인스턴스 메소드
	
	// 스마트 폰의 속성 : 컬러, 사이즈, 제조사, 볼륨사이즈
	// 속성 = 변수 
	// color, size, brand, volumeSize = 인스턴스 변수 , 초기화 생략 가능 => 인스턴스 생성시에 초기값으로 할당을 해주기 때문.  
	String color; //스마트폰을 표현하기 위한 변수이기 때문에 클래스 블럭 안에서 바로 선언함.
	float size; // or double  //0.0
	String brand = "삼성"; //가끔 초기화를 해줘야 할땐 해줘야한다. /null
	int volumeSize; //0
	
	// 변수
	// 생성자 
	// 메소드 
	
	// 생성자 : 인스턴스 생성시 단 한번 실행하는 초기화 메소드
	// 클래스이름 (매개변수...){
	// 초기화 코드
	// }
	SmartPhone(){
		// 매개변수 없고, 처리 내용이 없는 생성자(=기본생성자(Defalut)) => 기본생성, 생략가 
		// 생성자가 하나라도 있다면 자동으로 생성하지 않기 때문에 필요하다면 명시적으로 추가를 해줘야한다.
		// 사용자가 아무것도 정의하지 않았을때 생성해준다.
	}
	
	// 생성자의 오버로딩 : 같은 이름의 생성자 정의
	SmartPhone(String color, float size, String brand, int volumSize){
		// 인스턴스를 생성하면 this  참조변수도 생성
		// this 는 현재 인스턴스 자신의 주소값을 가지는 변수
		// 자바 내부에서 사용하는 
		this.color = color;
		this.size = size;
		this.brand = brand;
		this.volumeSize = volumSize;
	}
	
	SmartPhone(String brand, float size) {
//		this.brand = brand;
//		this.size = size;
//		this.color = "black";
//		this.volumeSize = 10;
		this("black", size, brand, 10);
	}
	
	SmartPhone(String brand){
//		this.brand = brand;
//		this.size = 4f;
//		this.color = "black";
//		this.volumeSize = 10;
		this("black", 4f, brand, 10);
	}
	
	
	
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
