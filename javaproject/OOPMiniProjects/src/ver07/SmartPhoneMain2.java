package ver07;

public class SmartPhoneMain2 {
	
	public static void main(String[] args) {
		
		SmartPhone sp = SmartPhone.getInstance();
		while(true) {
			printMenu();
			
			// 기본형타입을 객체로 만들어줄때 사용하는 클래스 int타입의 
			int select = Integer.parseInt(sp.sc.nextLine()); // 사용자가 입력한 값 - select
			
			
			switch(select) {
			case 1:
				sp.insertContact();
				break;
			case 2:
				sp.searchInfoPrint();
				break;
			case 3:
				sp.editContact();
				break;
			case 4:
				sp.deleteContat();
				break;
			case 5:
				sp.printAllData();
			case 6:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
		
	}

	static void printMenu() {
		System.out.println("===================================");
		System.out.println("# 전화번호부");
		System.out.println("1. 연락처 저장");
		System.out.println("2. 연락처 검색");
		System.out.println("3. 연락처 수정");
		System.out.println("4. 연락처 삭제");
		System.out.println("5. 연락처 전체 출력");
		System.out.println("6. 프로그램 종료");
		System.out.println("===================================");
		System.out.println("원하시는 메뉴 번호를 입력해주세요.");
		
		
		
		
	}
	
}
