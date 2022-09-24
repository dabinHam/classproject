package ver02;
// numOfContact 중요한 역할! 

// Index 로 사용하기도 하고 돌아가는 횟수 카운팅!

// 자주 사용하는건 지역변수 말고 인스턴스 변수로 선언하여 사용하는것이 낫다. 
import java.util.Scanner;

public class SmartPhone {

	// 기능 클래스 : 속성을 가지지 않고 메소드들로만 정의된 클래스
	// 여러개의 인스턴스가 생성될 필요 없다! => 싱글톤 패턴
	// 싱글톤패턴
	// 1. private 생성자 (어떠한 경우에도 외부에서 인스턴스생성이 불가능)
	// 2. 클래스 내부에서 인스턴스를 생성 static private
	// 3. 내부에서 생성한 참조 값을 반환 해 주는 메소드 static public 보통 public 사용, default로 변경하면 내부에서만
	// 사용

	// 1 요구사항
	// Contact 클래스의 인스턴스 10개를 저장 할 수 있는 배열을 정의합시다.
	// => 10개의 정보를 저장할 수 있다. -> 배열 인스턴스를 생성 Contact[]
	// Contact 클래스 기반의 인스턴스를 최대 10개까지 만들어서 배열에 참조값을 저장

	private Contact[] contacts;// 데이터는 생성자를 통해서 초기화를 해주는것을 권장. // 외부에 직접 보여질 필요 없다. private타입
	private int numOfContact; // 외부에서 보이면 안됨. private처리 // 입력된 정보의 개수 , 배열의 index 값으로 사용
	Scanner sc;

	SmartPhone(int size) {
		contacts = new Contact[size];
		numOfContact = 0;
		sc = new Scanner(System.in); // <= 계속해서 나오기 때문에 지역변수로 쓰지않고 인스턴수 변수로 변경하여 사용.
	}

	private static SmartPhone sp = new SmartPhone(10);

	public static SmartPhone getInstance() {
		if (sp == null)
			sp = new SmartPhone(10);
		return sp;
	}
//	new SmartPhone(10);

	////////////////////////////////
	// 2 기능
	// 배열에 인스턴스를 저장하고, ( 이름 으로 검색 )
	// 수정하고, ( 이름 으로 검색 )
	// 삭제, ( 이름 으로 검색 ) 참조를 끊는다 = 참조가 더이상 존재하지않는다. 
	// 저장된 데이터의 리스트를 출력하는 메소드를 정의합니다.

	// 검색된 이름 수정
	void editContact() {
		// 검색어 받기
		System.out.println("데이터 수정이 진행됩니다.");
		System.out.println("수정 하고자 하는 이름을 입력해주세요.");
		String name = sc.nextLine();

		// 삭제하고자 하는 index 찾아야 한다! ->(index를 찾으면 참조변수를 쉽게 찾을 수 있음. 참조하지 못하도록 변경하고싶음.) 
		// 시프트 (왼쪽으로 시프트한다 , = 옆으로 값을 민다 =
		// 기존값 없어진다..!
		// searchIndex?내가 찾고자 하는 인덱스
		int searchIndex = -1; // 현재 검색의 결과는 없다! 

		// 데이터 찾기
		for (int i = 0; i < numOfContact; i++) {

			if (contacts[i].getName().equals(name)) {
				searchIndex = i;
				break;
			}
		}

		// 검색한 index 값으로 분기 : 시프트 하거나 검색 결과 이름이 존재하지 않는다!
		if (searchIndex < 0) {
			System.out.println("찾으시는 이름의 데이터가 존재하지 않습니다.");
			return;
		}
		Contact contact = contacts[searchIndex];

		System.out.println("데이터 수정을 진행합니다.");

		System.out.println("변경하고자 하는 이름을 입력해주세요.(현재값:" + contact.getName() + ")\n" + "변경하지않으려면 엔터를 치세요 >");

		String newName = sc.nextLine();

		// " abc " -> "abc" => trim의 역할 공백을 제어해줌
		// " "

		if (newName == null && newName.trim().length() > 0) {
			contact.setName(newName);
		}

		System.out.println("변경하고자 하는 전화번호를 입력해주세요.(현재값:" + contact.getPhoneNumber() + ")\n" + "변경하지않으려면 엔터를 치세요 >");
		String newPhoneNumber = sc.nextLine();
		if(newPhoneNumber!=null && newPhoneNumber.trim().length()>0) {
			contact.setPhoneNumber(newPhoneNumber);
		}
		
		System.out.println("변경하고자 하는 이메일을 입력해주세요.(현재값:" + contact.getEmail() + ")\n" + "변경하지않으려면 엔터를 치세요 >");
		String newEmail = sc.nextLine();
		if(newEmail!=null && newEmail.trim().length()>0) {
			contact.setEmail(newEmail);
		}
		
		System.out.println("변경하고자 하는 주소를 입력해주세요.(현재값:" + contact.getAddress() + ")\n" + "변경하지않으려면 엔터를 치세요 >");
		String newAddress = sc.nextLine();
		if(newAddress!=null && newAddress.trim().length()>0) {
			contact.setAddress(newAddress);
		}

		System.out.println("변경하고자 하는 생일을 입력해주세요.(현재값:" + contact.getBirthDay() + ")\n" + "변경하지않으려면 엔터를 치세요 >");
		String newBirthDay = sc.nextLine();
		if(newBirthDay!= null && newBirthDay.trim().length()>0){
			contact.setBirthDay(newBirthDay);
		} 
		
		System.out.println("변경하고자 하는 그룹을 입력해주세요.(현재값:" + contact.getGroup() + ")\n" + "변경하지않으려면 엔터를 치세요 >");
		String newGroup = sc.nextLine();
		if(newGroup!=null && newGroup.trim().length()>0) {
			contact.setGroup(newGroup);
		}
		
		System.out.println("정보가 수정되었습니다.");
		System.out.println();
		
	}

	// 삭제 ( 이름으로 검색),
	void deleteContat() {

		// 검색어 받기
		System.out.println("데이터 삭제가 진행됩니다.");
		System.out.println("삭제하고자 하는 이름을 입력해주세요.");
		String name = sc.nextLine();

		// 삭제하고자 하는 index 찾아야 한다! ->(index를 찾으면 참조변수를 쉽게 찾을 수 있음. 참조하지 못하도록 변경하고싶음.) 
		// 시프트 (왼쪽으로 시프트한다 , = 옆으로 값을 민다 =
		// 기존값 없어진다..!
		// searchIndex?내가 찾고자 하는 인덱스
		int searchIndex = -1; // 현재 검색의 결과는 없다! 
		// 0으로 하지 않는 이유는 데이터 찾기를 해서 searchIndex의 값 에 넣어줄건데 초기값을 0으로 해놓고 찾지 못하면 0으로 유지가 되지만 결과도 0이 되어버린다.
		// 배열은 index가 0부터 시작한다고 했고 갯수 n-1까지 들어간다고 했기 때문에 -1로 넣어줘야 검색의 결과는 없다라는 값이 유지가 된다.  
		// 0보다 작은값을 가진다 = 못찾음

		
		// 데이터 찾기
		for (int i = 0; i < numOfContact; i++) {

			if (contacts[i].getName().equals(name)) {
				searchIndex = i;
				break;
			}
		}

		// 검색한 index 값으로 분기 : 시프트 하거나 검색 결과 이름이 존재하지 않는다!
		if (searchIndex < 0) {
			System.out.println("삭제하고자 하는 이름의 데이터가 존재하지 않습니다.");
		} else {
			for (int i = searchIndex; i < numOfContact - 1; i++) {
				contacts[i] = contacts[i + 1];
			}
			numOfContact--;
			System.out.println("데이터가 삭제 되었습니다.");
		}

	}

	// 검색 후 결과 출력 ( 이름 으로 검색 )
	void searchInfoPrint() {

		// 1. 사용자에게 검색할 키워드 입력받는다!
		// 2. 배열에서 이름 검색
		// 3. 결과 출력 : "검색한 이름의 정보가 없습니다."

		String name = null; // 검색 할 이름 ** 중복되는 이름은 없다 라는 조건으로 만들어 봄.

		System.out.println("검색을 시작합니다.");
		System.out.println("검색할 이름을 입력하세요. >");
		name = sc.nextLine();

		Contact contact = null;

		// 배열에서 검색할 이름을 가지는 인스턴스의 데이터 출력 메소드를 실행
		for (int i = 0; i < numOfContact; i++) {
			// 각 요소의 참조변수로 객체를 참조해서 이름을 비교
			if (contacts[i].getName().equals(name)) {
				contact = contacts[i];
				break; // <= 중복되지 않기 때문에 찾고나서 반복 중단 해주기.
			}
		}

		// 3. 결과 출력 : "검색한 이름의 정보가 없습니다."
		System.out.println("검색의 결과 =================");
		if (contact == null) {
			System.out.println("검색한 이름 " + name + "의 정보가 없습니다.");
		} else {
			contact.printInfo();
		}

	}

	// 전체 입력 데이터의 출력.
//	void PrintAllData() { // <- 오류 아래와 같이 변경
//		// 배열에 저장된 데이터를 모두 출력
//		for(int i=0; i<contacts.length; i++) {
//			contacts[i].printInfo();
//		}
//	}

	// 배열에 저장된 데이터를 모두 출력
	void printAllData() {

		System.out.println(" 전체 데이터를 출력합니다. ==========");
		if (numOfContact == 0) {
			System.out.println("입력된 정보가 없습니다.");
			return;
		}

		for (int i = 0; i < numOfContact; i++) {// <- 입력한 만큼만 반환
			contacts[i].printInfo();
		}
	}

	void insertContact() {
		// 배열에 인스턴스를 저장하고,
		// 수정하고,
		// 삭제,
		// 저장된 데이터의 리스트를 출력하는 메소드를 정의합니다.

		if (numOfContact == contacts.length) { // 현재사이즈와 최대사이즈를 비교
			System.out.println("최대 저장 개수는 " + contacts + "개 입니다.");
			return;
		}

		String name = null;
		String phoneNumber = null;
		String email = null;
		String address = null;
		String birthDay = null;
		String group = null;

		// 1. 데이터 받고
		System.out.println("입력을 시작합니다.");

		System.out.print(" 이름 > ");
		name = sc.nextLine();

		System.out.print("전화번호 > ");
		phoneNumber = sc.nextLine();

		System.out.print("이메일 > ");
		email = sc.nextLine();

		System.out.print("주소 > ");
		address = sc.nextLine();

		System.out.print("생일 > ");
		birthDay = sc.nextLine();

		System.out.print("그룹 > ");
		group = sc.nextLine();

		// 2. 인스턴스 생성
		Contact contact = new Contact(name, phoneNumber, email, address, birthDay, group);

		// 3. 배열에 저장
		// 처음 입력 : numOfContact => 0
		contacts[numOfContact++] = contact;
		// numOfContact++;

	}

}
