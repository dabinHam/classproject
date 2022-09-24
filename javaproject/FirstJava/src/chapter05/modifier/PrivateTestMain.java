package chapter05.modifier;

public class PrivateTestMain {

	public static void main(String[] args) {

		PrivateTest pt = new PrivateTest();

		pt.showInfo(); // <- 아래 private으로 설정되어 출력하지 못하는 오류가 발생한걸 해결할 수 있는 방법

//		System.out.println(pt.name); // 오류발생 : The field PrivateTest.name is not visible <-데이터는 있지만 private로 만들어놨기 떄문에 건들일 수 없다.
//		System.out.println(pt.age);
//		pt.age = 28;
//		
//		System.out.println(pt.age);

	}

}
