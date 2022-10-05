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
		// 내가 저장하고싶은 지정하고싶은 타입만을 사용 = 안전하게 사용하는것 이게 바로 제네릭의 가치!
		MyInterfaceImpl<String, Integer> myClass = new MyInterfaceImpl<String, Integer>();

		System.out.println("Ten");
		
//		System.out.println((new Integer(10)));
//		System.out.println((new Integer("10")));
		System.out.println((10)); // 기본형을 자동으로(위와같이)참조형으로 변경해준다 : 오토박싱

	}

}
