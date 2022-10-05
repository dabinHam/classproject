package chapter08.phone;

public class PhoneMain {

	public static void main(String[] args) {

		PhoneImpl phone1 = new PhoneImpl();
		// 전원을 켠다!
		phone1.turnOn();
		// 전화 걸기!
		phone1.call();
		// 전원 끄기!
		phone1.turnOff();
		
		SmartPhone2 smartPhone2 = new SmartPhone2("BBB@gmail.com");
		smartPhone2.turnOn();
		smartPhone2.call();
		
		System.out.println();
		
		smartPhone2.appRun("카카오톡");
		System.out.println();
		
		smartPhone2.appStop("카카오톡");
		
		//.....
		
		smartPhone2.turnOff();
		
		SmartPhone3 phone3 = new SmartPhone3("CCC@gamil.com");
		phone3.turnOn();
		phone3.call();
		phone3.appRun("네이버");
		phone3.appStop("네이버");
		
		//.....
		
		phone3.turnOff();
		
		
		
		
	}
}
