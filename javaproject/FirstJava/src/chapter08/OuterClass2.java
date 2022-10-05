package chapter08;

// LocalClass
// LocalClass : 외부클래스의 인스턴스 메소드 내에 정의가 된 내부클래스를 Local클래스 라고한다.
// 메소드 내에서만 인스턴스의 생성 및 참조 변수의 선언이 가능.
// 메소드를 이용해야만 해당 객체의 참조 변수를 얻을 수 있음.
// 반환형 클래스 타입이 외부에서 참조가 되지 않기에 문제가 발생. -> 상속으로 해결
public class OuterClass2 {

	private String name;

	public OuterClass2(String name) {
		super();
		this.name = name;
	}

	public BasicClass createLocalClassInstance() {

		// LocalClass : 메소드 내부에 선언 되어 사용되는 클래스
		// 외부 클래스에서는 내부 클래스를 참조할수 없다!
		// 상속의 구조로 다형성이용해서 외부에서 사용할수 있도록 정의

		class LocalClass extends BasicClass {
			void tell() {
				System.out.println("안녕하세요 " + name + "입니다.");
			}
		}

		return new LocalClass();

		// 메소드 내부에서 내부클래스를 이용한 인스턴스 생성가능
		// new LocalClass().tell();

	}

	public static void main(String[] args) {
		OuterClass2 o = new OuterClass2("kiong");
		BasicClass localClassInst = o.createLocalClassInstance();
		localClassInst.tell();
	}

}

abstract class BasicClass {

	abstract void tell();

}
