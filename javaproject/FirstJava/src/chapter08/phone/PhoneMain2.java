package chapter08.phone;

public class PhoneMain2 {

	public static void main(String[] args) {

		PhoneImpl phone1 = new PhoneImpl();
		// 전원을 켠다!
		phone1.turnOn();
		// 전화 걸기!
		phone1.call();
		// 전원 끄기!
		phone1.turnOff();
		
		//-----------------------------------
		
		// 인스턴스의 다형성
		Phone phone01 = phone1; // 형 변환 연산 생략
		//( 상위 타입인 )Phone = new (하위 타입인 )PhoneImpl
		phone01.turnOn();
		phone01.call();
		phone01.turnOff();
		//System.out.println(phone01.power); // Phone인터페이스의 멤버는 power이 없다. PhoneImpl 타입으로 해줘야 볼수있다 =상속과 같음. 

		//-----------------------------------
		
		
		SmartPhone2 smartPhone2 = new SmartPhone2("BBB@gmail.com");
		smartPhone2.turnOn();
		smartPhone2.call();
		
		System.out.println();
		
		smartPhone2.appRun("카카오톡");
		System.out.println();
		
		smartPhone2.appStop("카카오톡");
		
		// 인터페이스의 다형성을 통하여 상위타입인 Computer, Phone, Application로 변수를 만들 수 있다. 
		Computer phone02 = smartPhone2;	// 문제가 없는 이유는 smartPhone2에 Computer를 상속하고 있기 때문에
		Phone phone03 = smartPhone2;
		Application phone04 = smartPhone2;
		
		
		//.....
		
		smartPhone2.turnOff();
		
		SmartPhone3 phone3 = new SmartPhone3("CCC@gamil.com");
		phone3.turnOn();
		phone3.call();
		phone3.appRun("네이버");
		phone3.appStop("네이버");
		
		Phone phone05 = phone3;
		
		//.....
		
		phone3.turnOff();
		 
		// Phone 타입의 배열
		Phone[] list = new Phone[3];
		list[0] = phone1;
		list[1] = smartPhone2;
		list[2] = phone3;
		
		for(int i=0; i<list.length; i++) {
			list[i].turnOn(); 	// 스마트폰마다 켜지는게 다를텐데 일괄적으로 처리해줄 수 있는 기능
		}
	}
}
