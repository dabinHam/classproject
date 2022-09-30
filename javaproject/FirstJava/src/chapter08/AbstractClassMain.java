package chapter08;

public class AbstractClassMain {

	public static void main(String[] args) {

		// 추상 클래스는 인스턴스 생성에 목적이 없다!
		// 인스턴스 생성을 하면 문제가 된다!!!
		AbstractClass abstractClass; // = new AbstractClass(); // 인스턴스 생성 불가

		NewClass newClass = new NewClass(); // 오버라이딩 되어있고 완성이 되어있기 때문에 가능하다.
		newClass.abstractMethod();

		abstractClass = newClass; // 다형성

		abstractClass.abstractMethod();

	}

}
