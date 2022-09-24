package chapter05.exam;

/*
Member 클래스에는 아래 요구사항에 맞는 변수와 메소드를 정의하고, main()메소드 에 해당 메소드를 호출해서 결과를 확인해보세요.
단 인스턴스의 생성은 생성자를 이용해서 초기화하는 코드를 작성해 봅시다.

1 아래의 데이터를 저장 이름, 전화번호, 전공, 학년, email, 생일, 주소
2 위에서 정의한 정보를 출력하는 메소드 정의
3 모든 정보를 저장하도록 하는 생성자와 생일과 주소는 저장하지 않을수 있는 생성자를 정의
4 main() 메소드에서 두 가지 생성자를 이용해서 인스턴스 생성하고 출력 메소드를 통해 저장된 데이터 출력
* */

public class MemberInstence {
//1. 아래의 데이터를 저장 이름, 전화번호, 전공, 학년, email, 생일, 주소

	String name;
	String phoneNum;
	String major;
	int schoolLevel;
	String email;
	int birth;
	String address;

	MemberInstence(String name, String phoneNum, String major, int schoolLevel, String email, int birth,
			String aderss) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.major = major;
		this.schoolLevel = schoolLevel;
		this.email = email;
		this.birth = birth;
		this.address = aderss;
	}

	// 3. 모든 정보를 저장하도록 하는 생성자와 생일과 주소는 저장하지 않을수 있는 생성자를 정의
	MemberInstence(String name, String phoneNum, String major, int schoolLevel, String email) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.major = major;
		this.schoolLevel = schoolLevel;
		this.email = email;
	}

	// 2. 위에서 정의한 정보를 출력하는 메소드 정의
	void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNum);
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + schoolLevel + " 학년");
		System.out.println("이메일 : " + email);
		System.out.println("생년월일 : " + birth);
		System.out.println("주소 : " + address);
	}

}
