package chapter05.exam;

public class MemberInstenceMain {

	// 4. main() 메소드에서 두 가지 생성자를 이용해서 인스턴스 생성하고 출력 메소드를 통해 저장된 데이터 출력

	public static void main(String[] args) {
		System.out.println("모든 정보 출력");
		System.out.println();
		// 2. 위에서 정의한 정보를 출력하는 메소드 정의
		MemberInstence mi = new MemberInstence("함다빈", "010-1234-5678", "웹개발", 3, "hdabin0906@gmail.com", 950726,
				"서울시 강동구");
		mi.showInfo();

		System.out.println();
		System.out.println();
		System.out.println("생일,주소를 제외한 정보 출력");
		System.out.println();

		MemberInstence mi1 = new MemberInstence("함다빈", "010-1234-5678", "웹개발", 3, "hdabin0906@gmail.com");
		mi.showInfo();
	}

}
