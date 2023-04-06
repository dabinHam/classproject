package verTest;

public class SmartPhoneMain {

	public static void main(String[] args) {

//		① SmartPhone 클래스의 인스턴스를 생성합니다.
		SmartPhone sp = SmartPhone.getInstance();
		
		while(true) {
			printMenu();
			int select = Integer.parseInt(sp.sc.nextLine());
			
//		1. 메뉴 입력 시 발생할 수 있는 예외에 대하여 예외 처리합시다. 
		try {
			if(!(select<0 && select>7)) {
				throw new Exception();
			}
		} catch(Exception e) {
			System.out.println("\n1~6까지 메뉴중 선택해주세요.\n");
		}
			switch(select) {
//			④ 배열의 모든 요소를 저장합니다.
				case 1 :
					sp.insertContact();
					break;
//			⑤ 배열의 모든 요소를 검색합니다.
				case 2 :
					sp.serchInfoPrint();
					break;
//			⑥ 배열의 요소를 수정합니다.
				case 3 :
					sp.editContact();
					break;
//			⑥ 배열의 요소를 삭제합니다..
				case 4 :
					sp.deleteCotact();
					break;
//			④ 배열의 모든 요소를 출력합니다.
				case 5 :
					sp.printAllDate();
					break;
				case 6 :
					System.out.println("프로그램을 종료합니다");
					return;
			}
		}	
		 
		
			
}
	
	static void printMenu() {
		
		System.out.println("====================================");
		System.out.println("# 전화번호부");
		System.out.println("1. 연락처 저장");
		System.out.println("2. 연락처 검색");
		System.out.println("3. 연락처 수정");
		System.out.println("4. 연락처 삭제");
		System.out.println("5. 연락처 전제 출력");
		System.out.println("6. 종료");
		System.out.println("====================================");
		System.out.println("원하시는 메뉴 번호를 입력해주세요.");
	}

}