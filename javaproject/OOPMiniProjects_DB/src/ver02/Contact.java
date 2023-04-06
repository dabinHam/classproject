package ver02;
// 저장정보 : 이름, 전화번호, 이메일, 주소, 생일, 그룹
// 출력기능 만들기 

/**
* - 변수들은 직접 참조를 막아 캡슐화 처리를 하도록 해봅시다. ok 
* - 변수의 직접 참조는 안되지만 변수의 값을 얻을 수 있는 메소드(getter)와 
* 	변수에 값을 저장할 수 있는 메소드(setter)를 정의합니다. ok
* - 인스턴스 생성과 함께 데이터를 초기화 할 수 있도록 생성자를 정의해봅시다. ok
* - 저장할 데이터를 콘솔에서 사용자의 입력 값으로 인스턴스를 생성해봅시다. 
*/

public class Contact {
	// 저장정보 변수 선언 (캡슐화 처리)
	private String name;
	private String phoneNumber;
	private String email;
	private String address;
	private String birth;
	private String group;

	// 인스턴스 생성과 함께 데이터를 초기화 할 수 있도록 생성자를 정의해봅시다
	public Contact(String name, String phoneNumber, String email, String address, String birth, String group) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.birth = birth;
		this.group = group;
	}

	// getter , setter 메소드 정의 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	// ----------------------------------------------------//

	// 위 데이터를 출력하는 기능
	public void printInfo() {
		System.out.println();
		System.out.println("이름 : " + this.name);
		System.out.println("전화번호 : " + this.phoneNumber);
		System.out.println("이메일 : " + this.email);
		System.out.println("주소 : " + this.address);
		System.out.println("생일 : " + this.birth);
		System.out.println("그룹 : " + this.group);
		System.out.println("=============================");
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + ", address=" + address
				+ ", birth=" + birth + ", group=" + group + "]";
	}

}
