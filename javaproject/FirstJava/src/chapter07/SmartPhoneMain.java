package chapter07;

public class SmartPhoneMain {

	public static void main(String[] args) {
		
		AndroidPhone ap = new AndroidPhone("010-2222-2222");
		
		Phone phone = (Phone)ap ; // 하위타입 -> 상위타입 형변환일 때 형변환 연산은 생략 가능하다.
		
		ap.call();
		
		Phone phone2 = new Phone("010-0000-0000");
		
		// 형변환 연산자 : 확인하고자 하는 참조변수 instanceof 확인할 타입
		System.out.println(phone2 instanceof IPhone);
		//IPhone ip = (IPhone)phone2; // 오류
		if(phone2 instanceof IPhone) {
			IPhone ip = (IPhone)phone2;
			System.out.println("아이폰으로 변경");
		} else {
			System.out.println("아이폰으로 변경 불가");
		}
		
		
		Phone phone3 = new IPhone("010-1234-1234");
		
		if(phone3 instanceof IPhone) {
			IPhone ip = (IPhone)phone3;
			ip.call();
		}
		
		
		
		
		
	}
}
