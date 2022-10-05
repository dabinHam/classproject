package chapter08.phone;
// 구현하는 클래스의 경우 구현클래스명+Impl 을 붙혀준다.

public class PhoneImpl implements Phone {

	boolean power; // 
	
	
	@Override
	public void call() {
		// 119에 전화를 합니다.
		// 상수를 이용해서 번호를 만들고 출력
		
		String number1 = String.valueOf(Phone.PHONE_NUM_1);
		String number9 = String.valueOf(Phone.PHONE_NUM_9);
		System.out.println( number1+number1+number9+ "에 전화를 합니다.!!! 불났어요!");
		
	}

	@Override
	public void turnOn() {
		// 전원키기
		//power가 true -> 전원이 있는상태
		// false -> 전원이 없는 상태
		
		if(!power) {
			power = true;
		}
		
	}

	@Override
	public void turnOff() {
		if(power) {
			power = false;
		}
	}
	
	
}
