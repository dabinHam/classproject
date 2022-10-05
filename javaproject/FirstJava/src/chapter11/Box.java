package chapter11;
// 제너릭
public class Box {
	
	
	// 객체를 하나에 하나씩 넣을 수 있다.
//	void push(Orange o) { // Orange 타입의 o 를 넣고 싶을때
//		o.print();
//	}
//	
//	void push(Apple a) { // Apple 타입의 a 를 넣고 싶을때
//		a.print();
//	}
	// 하지만 위와같은 문제점은 하나하나 넣다보면 객체가 많아질수록 메소드가 증가하기때문! 
	
	
	// 하나의 박스에 여러종류의 과일을 넣을 수 있게 하는 법
	void push(Object o) {
		// o.print(); // 매개변수로 받는건 문제없다.
		System.out.println(o);
	}
	
	public static void main(String[] args) { // 다른타입이 들어오지 못하게 한다 = 제너릭
		Box box = new Box();
		box.push(new Orange());
		box.push(new Apple());
		box.push(new String("Apple")); 
		box.push(new String("Banana")); // 아래 객체가 아닌 문자열로도 추가할 수 있다.
	}
	
}

class Apple {
	void print() {
		System.out.println("Apple");
	}
}

class Orange{
	void print() {
		System.out.println("Orange");
	}
}