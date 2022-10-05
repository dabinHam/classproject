package chapter11;
// 제네릭은 클래스뿐만 아니라 메소드 매개변수, 반환타입으로도 사용가능하다.
// 제네릭 인터페이스를 생성하여 추상메소드로 구현 할 수있다.
public class MyInterfaceImpl<T1, T2> implements MyInterface<T1, T2> {

	@Override
	public T1 method1(T1 t) {
		return t;
	}

	@Override
	public T2 method2(T2 t) {
		return t;
	}

	public static void main(String[] args) {

		// <> 안에 기본형<T1,T2> 가 아닌 참조형<String,Integer>이 와야한다.
		MyInterfaceImpl<String, Integer> myClass = new MyInterfaceImpl<String, Integer>();

		System.out.println("Ten");
		System.out.println((10));

	}

}
