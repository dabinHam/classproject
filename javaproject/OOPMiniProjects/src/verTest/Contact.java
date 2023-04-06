package verTest;

//	2. Contact클래스가 ShowData인터페이스를 상속하면서 추상 메소드를 보유하는 관계로 생성 
abstract class Contact implements ShowData {

//		변수들은 직접 참조를 막아 캡슐화 처리를 하도록 해봅시다.
	private String name;	// 이름
	private String number;	// 전화번호
	private String email;	// 이메일
	private String address;	// 주소
	private String birth;	// 생일
	private String group;	// 그룹
	
	
//		인스턴스 생성과 함께 데이터를 초기화 할 수 있도록 생성자를 정의해봅시다.
	public Contact(String name, String number, String email, String address, String birth, String group) {
		this.name = name;
		this.number = number;
		this.email = email;
		this.address = address;
		this.birth = birth;
		this.group = group;
	}

	
//		변수의 직접 참조는 안되지만 변수의 값을 얻을 수 있는 메소드(getter)와
	public String getName() {
		return name;
	}
	public String getNumber() {
		return number;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	public String getBirth() {
		return birth;
	}
	public String getGroup() {
		return group;
	}

	
//	변수에 값을 저장할 수 있는 메소드(setter)를 정의합니다.
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public void setGroup(String group) {
		this.group = group;
	}

	
//		저장할 데이터를 콘솔에서 사용자의 입력 값으로 인스턴스를 생성해봅시다.
	public void printData() {
		System.out.println("저장정보 ==========================");
		System.out.println("이름:" + this.name);
		System.out.println("번호:" + this.number);
		System.out.println("이메일:" + this.email);
		System.out.println("주소:" + this.address);
		System.out.println("생일:" + this.birth);
		System.out.println("그룹:" + this.group);
	}
	
	
	@Override
	public String toString() {
		return "Contact [name=" + name + ", number=" + number + ", email=" + email + ", address=" + address + ", birth="
				+ birth + ", group=" + group + "]";
	}

}