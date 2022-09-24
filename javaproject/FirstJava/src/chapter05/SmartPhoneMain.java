package chapter05;

// 프로그램의 시작 포인트
public class SmartPhoneMain {

	public static void main(String[] args) {

		// SmartPhone 위에 '마우스커서 + Ctrl'을 하게되면 해당클래스로 이동할 수 있다. 맞는지 확인 한번씩 하는게 좋다.
		// 참조변수 선언 : 인스턴스의 메모리 주소값을 저장
		SmartPhone sp = null;

		// 인스턴스 생성 : class에서 정의한 변수와 메소드를 사용할 수 있는 상태로 만드는것
		// 인스턴스화 -> 변수와 메소드를 메모리에 로드한다!
		sp = new SmartPhone(); // 인스턴스 메모리를 생성하고 주소값을 반환

		// 인스턴스 변수 참조 방법 : 참조변수.인스턴스변수이름
		System.out.println("스마트폰의 제조사 : " + sp.brand);
		System.out.println("스마트폰의 색상 : " + sp.color);
		System.out.println("스마트폰의 크기 : " + sp.size);
		System.out.println("스마트폰의 볼륨 크기 : " + sp.volumeSize);

		// 인스턴스 변수 할당
//		int num =1;
//		num = 10;  이런 형식과 같다고 보면 됨. 
		sp.brand = "Samsung";
		sp.color = "White";
		sp.size = 4.7f;
		sp.volumeSize = 10;

		// 인스턴스 변수 참조 방법 : 참조변수.인스턴스변수이름
		System.out.println();
		System.out.println("인스턴스의 변수의 값 할당 후 =================== : ");
//		System.out.println("스마트폰의 제조사 : " + sp.brand);
//		System.out.println("스마트폰의 색상 : " + sp.color);
//		System.out.println("스마트폰의 크기 : " + sp.size);
//		System.out.println("스마트폰의 볼륨 크기 : " + sp.volumeSize);

		// 인스턴스의 메소드 호출 : 참조변수.메소드이름();
		sp.showInfo();

		// 볼륨 조정 : 키우기
		sp.volumeUp();
		System.out.println("현재 볼륨 : " + sp.volumeSize);

		sp.volumeDown();
		sp.volumeDown();
		System.out.println("현재 볼륨 : " + sp.volumeSize);

		// sp=null; //잘 사용하진 않는다. 참조변수를 할당하지 않는 상태가오면 소멸대상이 된다.

	}

}
