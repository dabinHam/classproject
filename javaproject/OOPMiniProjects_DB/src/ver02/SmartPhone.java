package ver02;

import java.util.Scanner;

public class SmartPhone {
	/**
	 **** 연락처 정보를 관리하는 SmartPhone클래스를 정의 합니다.
	 * 1 Contact 클래스의 인스턴스 10개를 저장 할 수 있는 배열을 정의합시다. ok
	 * 2 배열에 인스턴스를 저장하고, 수정하고, 삭제, 저장된 데이터의 리스트를 출력하는 메소드를 정의합니다.
	 */
	
	/**
	 **** main()메소드를아래의요구조건을정의해봅니다.
	 * 1 SmartPhone 클래스의 인스턴스를 생성합니다.
	 * 2 사용자로부터 입력을 받아 Contact 인스턴스를 생성해서 SmartPhone 클래스의 인스턴스가 가지고 있는 배열에 추가합니다. 
	 * 3 10번 반복해서 배열에 추가합니다.
	 * 4 배열의 모든 요소를 출력합니다.
	 * 5 배열의 모든 요소를 검색합니다.
	 * 6 배열의 요소를 삭제해 봅시다.
	 * 7 배열의 요소를 수정해 봅시다.*/
	
	private Contact[] contacts;
	private int numOfContact; // numOfContact? 입력된 정보의 개수 , 배열의 index 값으로 사용
	Scanner sc;
	
	SmartPhone(int size){
		contacts = new Contact[size];
		numOfContact = 0;
		sc = new Scanner(System.in);
	}

	// Contact 클래스의 인스턴스 10개를 저장 할 수 있는 배열을 정의합시다.
	private static SmartPhone sp = new SmartPhone(10); 
	
	public static SmartPhone getInstance() {
		if(sp == null)
			sp = new SmartPhone(10);
		return sp;
	}
	
	 // 배열에 저장된 데이터를 모두 출력
	void printAllData() {
		System.out.println("======== 전체 데이터를 출력합니다. ========");
		if(numOfContact == 0) {
			System.out.println("입력된 정보가 없습니다.");
			return;
		}
		
		for (int i = 0; i < numOfContact; i++) {
			contacts[i].printInfo();
		}
	} // printAllData() 모든 데이터 출력 //
	
	
	
	
	
	// 배열에 인스턴스를 저장하고, <- ( 이름으로 검색)
	// 수정하고, 
	// 삭제, <- 참조를 끊는다. = 참조가 더이상 존재하지 안흔다. 
	// 저장된 데이터의 리스트를 출력하는 메소드를 정의
	
	void insertContact() {
		
		if (numOfContact == contacts.length) { // 현재사이즈와 최대사이즈를 비교
			System.out.println("최대 저장 개수는 " + contacts +"개 입니다.");
			return;
		}
		
		String name = null;
		String phoneNumber = null;
		String email = null;
		String address = null;
		String birth = null;
		String group = null;
		
		System.out.println("입력을 시작합니다.");
		
		System.out.println("이름 >> ");
		name = sc.nextLine();
		System.out.println("전화번호 >> ");
		phoneNumber = sc.nextLine();
		System.out.println("이메일 >> ");
		email = sc.nextLine();
		System.out.println("주소 >> ");
		address = sc.nextLine();
		System.out.println("생일 >> ");
		address = sc.nextLine();
		System.out.println("그룹 >> ");
		group = sc.nextLine();
		
		Contact contact = new Contact(name, phoneNumber, email, address, birth, group);
		
		contacts[numOfContact++] = contact;
		
		
		
		
		
	}
	
	
	
	
}
