package chapter03;

public class Logica10perator {

	public static void main(String[] args) {

		// 변수는 내가 true 라고 하는 경우는 드물다.

		boolean chk1 = true;
		boolean chk2 = false;
		boolean chk3 = true;
		boolean chk4 = false;

		// AND연산 &&
		System.out.println(chk1 && chk3); // true
		System.out.println(chk1 && chk2); // false
		System.out.println(chk2 && chk3); // false
		System.out.println(chk2 && chk4); // false

		System.out.println("----------------------");

		// OR연산 ||
		System.out.println(chk1 || chk3); // true || true //true
		System.out.println(chk1 || chk2); // true || false //true
		System.out.println(chk2 || chk3); // false || false //true
		System.out.println(chk2 || chk4); // false || false //false

	}

}
