package ver02;

public class SmartPhoneMain {

	public static void main(String[] args) {
		// SmartPhone을 싱글톤 패턴으로 만들어 두었기 때문에 new 선언으로 할 수 없다.
		SmartPhone smartPhone = SmartPhone.getInstance();
		

		// 입력
		smartPhone.insertContact();
		System.out.println();

		// 전체 출력
		smartPhone.printAllData();
		System.out.println();
		
//		// 이름 검색 후 결과 출력
//		smartPhone.searchInfoPrint();
//		System.out.println();
		
		// 이름 검색 후 정보 수정
		smartPhone.editContact();
		smartPhone.searchInfoPrint();
		System.out.println();
		smartPhone.searchInfoPrint();
		System.out.println();
		smartPhone.printAllData();
		System.out.println();
		
		// 이름 검색 후 삭제 ( 다른이름을 검색해서 지워지지 않았다라는걸 확인)test1
		smartPhone.deleteContat();
		System.out.println();
		smartPhone.searchInfoPrint();
		System.out.println();
		smartPhone.printAllData();
		System.out.println();
		
		// 이름 검색 후 삭제 (진짜 이름을 검색해서 지워지는것을 확인)test2
		smartPhone.deleteContat();
		System.out.println();
		smartPhone.searchInfoPrint();
		System.out.println();
		smartPhone.printAllData();
	}

}
