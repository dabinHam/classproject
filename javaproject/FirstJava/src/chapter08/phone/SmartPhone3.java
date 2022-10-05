package chapter08.phone;

// 다중상속 클래스의상속 + 인터페이스의 구현 + 인터페이스 추가(Application)
// 인터페이스의 상속
public class SmartPhone3 extends Computer implements SmartDevice { // Phone, Application -> SmartDevice로 변경할 수 있다.

	// phone가 가지고 있는 추상메소드를 구현해 주거나 class 앞에 abstract를 붙혀주거나 해야함.
	boolean power;

	public SmartPhone3(String account) {
		super(account);
//		this.power = power;	// 전원이 켜져있는 상태
		this.power = false; // 최초는 전원이 꺼진 상태로 변경
	}

	@Override
	public void call() {
		// 119에 전화를 합니다.
		// 상수를 이용해서 번호를 만들고 출력

		String number1 = String.valueOf(Phone.PHONE_NUM_1);
		String number9 = String.valueOf(Phone.PHONE_NUM_9);
		System.out.println(number1 + number1 + number9 + "에 전화를 합니다.!!! 불났어요!");

	}

	@Override
	public void turnOn() {
		// 전원키기
		// power가 true -> 전원이 있는상태
		// false -> 전원이 없는 상태

		if (!power) {
			power = true;
		}

	}

	@Override
	public void turnOff() {
		if (power) {
			power = false;
		}
	}

	public static void main(String[] args) {

		SmartPhone3 phone = new SmartPhone3("AAA@gamil.com");

		// Computer가 가지고 있는 멤버
		phone.call();
		phone.calculator();

	}

	@Override
	public void appRun(String appName) {

		System.out.println(appName + " 앱을 실행합니다.");
	}

	@Override
	public void appStop(String appName) {

		System.out.println(appName + " 앱을 종료합니다.");
	}

}
