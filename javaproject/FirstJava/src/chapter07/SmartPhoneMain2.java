package chapter07;

public class SmartPhoneMain2 {
	

	public static void main(String[] args) {
		
		AndroidPhone androidPhone = new AndroidPhone("010-0000-0000");
		IPhone iPhone = new IPhone("010-2222-2222");
		GooglePhone googlePhone = new GooglePhone("010-1111-1111");
		
		callByPhone(androidPhone);
		callByPhone(iPhone);
		callByPhone(googlePhone);
		
	}
	
	static void callByPhone(Phone phone) { // 이거 하나만 있으면 아래 3개는 필요가 없다. 
		//메소드의 매개변수
		// 이게 상위변수 이기 때문에! 
		//Phone phone = androidPhone;      // 매개변수를 상위타입으로 정의하자! 
		phone.call();
	}

//	// 구글 폰
//	static void callByPhone(GooglePhone phone) {
//		phone.call();
//	}
//	
//	// 안드로이드 폰
//	static void callByPhone(AndroidPhone phone) {
//		phone.call();
//	}
//	
//	// 아이 폰
//	static void callByPhone(IPhone phone) {
//		phone.call();
//	}
	
	
}
