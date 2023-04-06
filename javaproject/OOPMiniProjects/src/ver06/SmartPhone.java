package ver06;

import java.util.Scanner;
/* 6번 문제
1. 메뉴 입력시 발생할 수 있는 예외에 대하여 예외처리 합시다.
2. 연락처 이름 이력시에 공백에 대한 예외처리와 영문자와 한글만 허용하는 예외처리를 해봅시다.
3. 전화번호형식에 맞지않을 때 예외처리를 하고 중복될때 예외상황이 발생 하도록하고 예외처리를 합시다.
*/

public class SmartPhone {

	private Contact[] contacts;
	private int numOfContact; 
	Scanner sc;

	SmartPhone(int size) {
		contacts = new Contact[size];
		numOfContact = 0;
		sc = new Scanner(System.in);
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

		int searchIndex = -1; // 현재 검색의 결과는 없다! 

		// 데이터 찾기
		for (int i = 0; i < numOfContact; i++) {

			if (contacts[i].getName().equals(name)) {
				searchIndex = i;
				break;
			}
		}

		if (searchIndex < 0) {
			System.out.println("찾으시는 이름의 데이터가 존재하지 않습니다.");
			return;
		}
		Contact contact = contacts[searchIndex];

		System.out.println("데이터 수정을 진행합니다.");

		System.out.println("변경하고자 하는 이름을 입력해주세요.(현재값:" + contact.getName() + ")\n" + "변경하지않으려면 엔터를 치세요 >");

		String newName = sc.nextLine();

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

		int searchIndex = -1; // 현재 검색의 결과는 없다! 
		
		// 데이터 찾기
		for (int i = 0; i < numOfContact; i++) {

			if (contacts[i].getName().equals(name)) {
				searchIndex = i;
				break;
			}
		}

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

}
