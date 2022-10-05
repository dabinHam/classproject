package chapter08.test;

import chapter08.NewClass; // 다른 패키지에 있기 때문에 import 해줘야 한다.

// 인터페이스를 사용하면 다중상속할수 있다는 장점이 있다. 
// 특정 클래스를 상속하고 특정 인터페이스를 구현(=상속)하는 = 다중상속
// 보통 꼭 필요한 메소드 한 두개 정도만 인터페이스에서 사용하는 경우가 대부분이다.

public class PhoneImpl extends NewClass implements Phone { // NewClass , Phone 2개의 클래스를 상속받은상태 = 다중상속

	// 멤버인 추상메소드가 구현되어 있지 않은 상태이기 때문에 PhoneImpl 앞에  abstract를 붙히거나 구현해줘야한다.
	
	public void print() { // public abstract가 생략되어 있는거라서 void 앞에 public를 붙혀줘야한다
		System.out.println("print 메소드를 구현했습니다.");
		
	}
}
