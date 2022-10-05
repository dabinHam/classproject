package chapter11;

import chapter08.phone.Phone;
import chapter08.phone.PhoneImpl;

// 제너릭은 클래스뿐만 아니라 메소드에만 지정사용도 가능하다.
public class GenericMethodByType2 {

	public <T extends Phone> void hello(T t) { 
		// <T> -> <T extends Phone> 를 하게되면 main에 호출해둔 메소드에게 문제가 생긴다.
		//System.out.println("안녕하세요. " + t.toString() + "입니다.");
		t.call();
	}

	public static void main(String[] args) {
		GenericMethodByType2 byType = new GenericMethodByType2();
		//byType.<String>hello("손흥민"); 
		//byType.hello(10); // 상위클래스가 Phone가 아니기 때문에 불가능.
		
		//byType.<PhoneImpl>hello(new PhoneImpl());
		//byType.hello(new PhoneImpl()); // 타입은 생략이 가능하다 
		//byType.hello("스마트폰"); // String 타입은 지정해둔 타입이 아니라서 오류발생
		
	}

}
