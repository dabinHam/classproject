package chapter08;
// NestedClass
// inner 클래스 중 static 키워드를 가지는 내부클래스를 Nested 클래스(static class)라고 함.
// 목적 : 외부클래스의 클래스 메소드에 사용될 목적으로 선언.
// 내부에 메소드를 생성하여 이벤트 처리하는 경우도 있고 ,리스너 라고 하는것도 만들어서 처리함.
// static이 붙으면 static멤버처럼 인스턴스 생성없이 클래스를 바로 처리할 수 있다.
public class OuterClass1 {
	
	OuterClass1(){ // 인스턴스 생성
		NestedClass nst = new NestedClass(); // 호출
		nst.simpleMethod();
	}

	static class NestedClass{ // static 를 앞에 붙혀줘야함. static가 먼저 만들어지
		public void simpleMethod() {
			System.out.println("NestedClass Instance");
		}
	}
	
	public static void main(String[] args) {
		OuterClass1.NestedClass nst1 = new OuterClass1.NestedClass();
		//nst1.simpleMethod(); // 출력
		
		OuterClass1 o = new OuterClass1(); // OuterClass1 = 생성자
		
	}
	
	
	
}
