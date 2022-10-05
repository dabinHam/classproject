package chapter08;
// InnerClass
// 내부 클래스 : 클래스 내부에 다른 클래스 정의
// 캡슐화 : 클래스들이 외부에 노출되지 않아야 할때 (내부클래스의 목적)
// 이벤트 클래스(더블클릭,드래그...) 들이 내부클래스로 구성되어있다.
public class OuterClass {

	private String name;
	private int num; // 생성되는 횟수를 카운팅하기 위해서 만든 것.

	public OuterClass(String name) {
		super();// Object클래스는 default생성자(아무것도 처리하지 않음)만 있음. 그래서 super가 있어도 없어도 똑같다.
		this.name = name;
		this.num = 0;
	}

	public void tellYourName() {// 어떤 OuterClass인지 식별 하기 위한 것 ,(+ " - " + num++)을 추가하여 몇번째 인스턴스인지 보는 것.
		System.out.println("OuterClass Name : " + this.name + " - " + num++); // num++ = 후위형 : 출력 후 증가 , 
	}

	////////////////////////////////////////////////////
	
	// 이 클래스 (InnerClass) 는 위에 있는 메소드나 변수 다 같은 멤버로 인식을 한다.
	// 이유는 OuterClass 인스턴스 가 만들어 지고 나서 InnerClass를 생성할 수 있었다.
	// 그 이야기는 메모리에 위의 메소드들이 이미 올라와져 있는 상태이고 InnerClass의 생성자 호출 시점에는 메소드가 사용할 수 있는
	// 상태.
	class InnerClass {

		InnerClass() { // 생성자 호출
			tellYourName();
		}

	}

	public static void main(String[] args) {

		// 내부 클래스의 인스턴스 생성은 외부 클래스의 인스턴스 생성 후 생성이 가능하다.
		OuterClass out1 = new OuterClass("King");
		OuterClass out2 = new OuterClass("Scott");

		// 멤버호출
		// out1.tellYourName();
		// out2.tellYourName();

		// 내부 클래스 변수 선언과 인스턴스 생성
		// 감싸고 있는 클래스명.InnerClass in1 = 참조변수.new InnerClass();
		OuterClass.InnerClass in1 = out1.new InnerClass();
		OuterClass.InnerClass in2 = out2.new InnerClass();

		OuterClass.InnerClass in3 = out1.new InnerClass();
		OuterClass.InnerClass in4 = out2.new InnerClass();

		OuterClass.InnerClass in5 = out1.new InnerClass();
	}

}
