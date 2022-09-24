package chapter05.exam;

/*
Member 클래스에는 아래 요구사항에 맞는 변수와 메소드를 정의하고, main()메소드 에 해당 메소드를 호출해서 결과를 확인해보세요.
단 인스턴스의 생성은 생성자를 이용해서 초기화하는 코드를 작성해 봅시다.

1 아래의 데이터를 저장 이름, 전화번호, 전공, 학년, email, 생일, 주소
2 위에서 정의한 정보를 출력하는 메소드 정의
3 모든 정보를 저장하도록 하는 생성자와 생일과 주소는 저장하지 않을수 있는 생성자를 정의
4 main() 메소드에서 두 가지 생성자를 이용해서 인스턴스 생성하고 출력 메소드를 통해 저장된 데이터 출력
* */

public class MemberInstence2 {
//1. 아래의 데이터를 저장 이름, 전화번호, 전공, 학년, email, 생일, 주소

	// 변수 선언
	private String name;
	private String phoneNumber;
	private String major;
	private int grade;
	private String email;
	// 생일표현 : 문자열? 정수? 19990101 20020101
	private int birth;
	private String address;

	// Source - using Fields.
	public MemberInstence2(String name, String phoneNumber, String major, int grade, String email, int birth,
			String address) {
		// super(); // 생략가능
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;
		this.birth = birth;
		this.address = address;
	}

	public MemberInstence2(String name, String phoneNumber, String major, int grade, String email) {
		this(name, phoneNumber, major, grade, email, 0, null);
		// super(); // 생략가능
//		this.name = name;
//		this.phoneNumber = phoneNumber;
//		this.major = major;
//		this.grade = grade;
//		this.email = email;
		// this.birth = birth;
		// this.adress = address;
	}

	// 메소드 정의
	public void showMemberInfo() {
		System.out.println("-----회원 정보-----");
		System.out.println("이름 : " + this.name);
		System.out.println("전화 : " + this.phoneNumber);
		System.out.println("전공 : " + this.major);
		System.out.println("학년 : " + this.grade);
		System.out.println("이메일 : " + this.email);
		System.out.println("생일 : " + (this.birth == 0 ? "미입력" : this.birth)); // 삼항연산자 이용
		System.out.println("주소 : " + (this.address == null ? "미입력" : this.address));

//	      if(this.birthday != 0 && this.address != null) {
//	         System.out.println("생일 : " + this.birthday);
//	         System.out.println("주소 : " + this.address);
//	      }
	}

}
