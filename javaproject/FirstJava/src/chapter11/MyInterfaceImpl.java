package chapter11;

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
		MyInterfaceImpl<String,Integer> myClass = new MyInterfaceImpl<String, Integer>();
		
		System.out.println("Ten");
		System.out.println((10));
		
	}
	
	
}
