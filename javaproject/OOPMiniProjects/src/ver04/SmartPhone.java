package ver04;
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
	
	
	// 이름을 입력 받고 배열에 해당 이름의 Contact 객체가 있는 index 반환
	private int getIndex() {
		
		String name = sc.nextLine();

		// 이름 검색 하는 index 찾아야 한다!
		int searchIndex = -1; // 현재 검색의 결과는 없다! 

		// 데이터 찾기
		for (int i = 0; i < numOfContact; i++) {
			if (contacts[i].getName().equals(name)) {
				searchIndex = i;
				break;
			}
		}
		return searchIndex;
		
	}
	
	

	// 검색된 이름 수정
	void editContact() {
		// 검색어 받기
		System.out.println("데이터 수정이 진행됩니다.");
		System.out.println("수정 하고자 하는 이름을 입력해주세요.");

		int searchIndex = getIndex();
		// 검색한 index 값으로 분기 : 시프트 하거나 검색 결과 이름이 존재하지 않는다!
		if (searchIndex  < 0) {
			System.out.println("찾으시는 이름의 데이터가 존재하지 않습니다.");
			return;
		}
		Contact contact = contacts[searchIndex];

		System.out.println("데이터 수정을 진행합니다.");

		System.out.println("변경하고자 하는 이름을 입력해주세요.(현재값:" + contact.getName() + ")\n" + "변경하지않으려면 엔터를 치세요 >");

		String newName = sc.nextLine();

		// " abc " -> "abc" => trim의 역할 : 공백을 제어해줌
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
		
		if(contact instanceof CompanyContact) {
			
			CompanyContact companyContact = (CompanyContact) contact;
			
			System.out.println("변경하고자 하는 회사 이름을 입력해주세요.(현재값:" +companyContact.getCompany() + ")\n" + "변경하지않으려면 엔터를 치세요 >");
			String company = sc.nextLine();			
			if(company!=null && company.trim().length()>0) {
				companyContact.setCompany(company);
			}
			
			System.out.println("변경하고자 하는 부서 이름을 입력해주세요.(현재값:" +companyContact.getDivision() + ")\n" + "변경하지않으려면 엔터를 치세요 >");
			String division = sc.nextLine();			
			if(division!=null && division.trim().length()>0) {
				companyContact.setDivision(division);
			}
			
			System.out.println("변경하고자 하는 직급 이름을 입력해주세요.(현재값:" +companyContact.getManager() + ")\n" + "변경하지않으려면 엔터를 치세요 >");
			String manager = sc.nextLine();			
			if(manager!=null && manager.trim().length()>0) {
				companyContact.setManager(manager);
			}
			
			
		}else if(contact instanceof CustomerContact) {
			
			CustomerContact customerContact = (CustomerContact) contact;
			
			System.out.println("변경하고자 하는 거래처 이름 입력해주세요.(현재값:" +customerContact.getCompany() + ")\n" + "변경하지않으려면 엔터를 치세요 >");
			String company = sc.nextLine();			
			if(company!=null && company.trim().length()>0) {
				customerContact.setCompany(company);
			}
			
			System.out.println("변경하고자 하는 거래품목을 입력해주세요.(현재값:" +customerContact.getProduct()+ ")\n" + "변경하지않으려면 엔터를 치세요 >");
			String product = sc.nextLine();			
			if(product!=null && product.trim().length()>0) {
				customerContact.setProduct(product);
			}
			
			System.out.println("변경하고자 하는 담당자 이름을 입력해주세요.(현재값:" +customerContact.getManager()+ ")\n" + "변경하지않으려면 엔터를 치세요 >");
			String manager = sc.nextLine();			
			if(manager!=null && manager.trim().length()>0) {
				customerContact.setManager(manager);
			}
		}else {
			System.out.println("오류");
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
		
		int searchIndex = getIndex();
		
		
		
		// 3. 결과 출력 : "검색한 이름의 정보가 없습니다."
		System.out.println("검색의 결과 =================");
		if (searchIndex < 0) {
			System.out.println("검색한 이름 " + name + "의 정보가 없습니다.");
		} else {
			contacts[searchIndex].printInfo();
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

	// 친구 정보 입력
	void insertContact() {
		// 배열에 인스턴스를 저장하고,
		// 수정하고,
		// 삭제,
		// 저장된 데이터의 리스트를 출력하는 메소드를 정의합니다.
		
		if (numOfContact == contacts.length) { // 현재사이즈와 최대사이즈를 비교
			System.out.println("최대 저장 개수는 " + contacts + "개 입니다.");
			return;
		}
		
		// 회사 친구 입력?
		// 거래처 정보 입력
		
		System.out.println("입력하고자 하는 친구 타입을 선택해주세요");
		System.out.println("1. 회사동료 \t 2. 거래");
		int select = Integer.parseInt( sc.nextLine());

		String name = null;
		String phoneNumber = null;
		String email = null;
		String address = null;
		String birthDay = null;
		String group = null;

		// 1. 데이터 받고
		System.out.println("입력을 시작합니다.");

		System.out.print(" 이름 > ");
		name = getString();

		System.out.print("전화번호 > ");
		phoneNumber = getString();

		System.out.print("이메일 > ");
		email = getString();

		System.out.print("주소 > ");
		address = getString();

		System.out.print("생일 > ");
		birthDay = getString();

		System.out.print("그룹 > ");
		group = getString();
		
		Contact contact = null;
		
		// 분기 1. 회사 3. 거래
		
		if(select == 1) {
			// CompanyContact 인스턴스 생성
			
			System.out.print("회사이름 >> ");
			String company = sc.nextLine();
			System.out.print("부서이름 >> ");
			String division = sc.nextLine();
			System.out.print("직급 >> ");
			String manager = sc.nextLine();
			
			// 2. 인스턴스 생성
			contact = new CompanyContact(
					name, phoneNumber, email, 
					address, birthDay, group, 
					company, division, manager);
			
		}else {
			// CompanyContact 인스턴스 생성
			
			System.out.print("거래처 이름 >> ");
			String company = sc.nextLine();
			System.out.print("거래 품목 >> ");
			String product = sc.nextLine();
			System.out.print("담당자 >> ");
			String manager = sc.nextLine();
			
			// 2. 인스턴스 생성
			contact = new CustomerContact(
					name, phoneNumber, email, 
					address, birthDay, group, 
					company, product, manager);
		}
		
		
		// 3. 배열에 저장
		// 처음 입력 : numOfContact => 0
		contacts[numOfContact++] = contact;
		// numOfContact++;

	}

	// Scanner 를 통해서 사용자에게 문자열을 받아서 반환하는 메소드
	// 입력문자가 공백일 경우 다시 입력하도록 하는 기능 
	private String getString() {

		String str = null;

		while (true) {
			str = sc.nextLine();{
				if (str != null && str.trim().length() != 0) {
					break;
				} else {
					System.out.println("공백은 허용하지 않습니다. 정상적인 문자를 입력해주세요");
				}
			}
			return str;
		}
		return str;
	}
	
	
	// 이름정보를 받아서 중복 여부 체크 후 문자열 반환
	private String getName() {
		String name = null;
		
		while (true) {
			name = sc.nextLine();
			
				if (name != null && name.trim().length() != 0) {
					// 배열 요소에 같은 이름의 요소가 있는지 체크
					boolean check = false;
					
					// 이름 검색
					for(int i=0; i<numOfContact ; i++) {
						if(name.equals(contacts[i].getName())) {
							check = true;
							break;
						}
					}
					
					if(check) {
						System.out.println("같은 이름의 데이터가 존재합니다.\n다시 입력해주세요 >> ");
						//continue; 
					} else { // 중복되는게 없다면 break! 
						break;	
						
					}
					
					
				} else {
					System.out.println("공백은 허용하지 않습니다. 정상적인 문자를 입력해주세요");
				}
			}
		
		return name;
	}
	
	// 전화번호를 받아서 중복된 전화번호가 있는지 체크. 중복되지 않는 전화번호를 받아서 반환
	private String getPhoneNumber() {

		String phoneNumber = null;

		while (true) {

			phoneNumber = sc.nextLine();

			if (phoneNumber != null && phoneNumber.trim().length() > 0) {

				boolean check = false;
				
				// 중복여부 체크
				for(int i =0; i<numOfContact;i++) {
					if(phoneNumber.equals(contacts[i].getPhoneNumber())) {
						check = true;
					}
				}

				if (check) {
					System.out.println("중복된 전화번호가 존재합니다. \n다시 입력해주세요");
				} else {
					break;
				}

			} else {
				System.out.println("공백은 허용하지 않습니다. 정상적인 문자를 입력해주세요");
			}
		}
		return phoneNumber;

	}
	
	
	
}
