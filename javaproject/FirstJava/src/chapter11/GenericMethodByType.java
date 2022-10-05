package chapter11;
// 제너릭은 클래스뿐만 아니라 메소드에만 지정 사용 가능
public class GenericMethodByType {

	public <T> void hello(T t) { // 반환타입앞에 지정
		System.out.println("안녕하세요. " + t.toString() + "입니다.");
	}

	public static void main(String[] args) {
		GenericMethodByType byType = new GenericMethodByType();
		byType.<String>hello("손흥민"); // 메소드앞에 지정할 타입을 선언해놓고 다른타입을 적으면 오류남.
		byType.hello(10); // 메소드 앞에 생략하고 선언을 해주면 자동으로 앞에 사용했던 타입이 적용된다. : 오토박싱

	}

}
