package chapter03;

public class Relationa10perator3 {

	public static void main(String[] args) {

		// 관계연산자 ( 비교연산자 )
		// > < >= <= == !=

		// 참조변수 : 주소를 가지는 변수
		// 주소 : 객체를 가르키는 주소 값
		// 크다 작다 비교는 하지 않는다.
		// 같은 주소를 가지는지 확인하는 연산이 주로 사용된다.

		String str1 = "JAVA";
		String str2 = "HTML";
		String str3 = "JAVJA";

		System.out.println(str1 == str2); // 주소값 == 주소값 //false
		System.out.println(str1 != str2); // 주소값 != 주소값 //true

		System.out.println("str1 == str3 => " + (str1 == str2));

		// System.out.println(str1 > str2); // 참조변수를 사용할 때 에는 크다,작다를 사용하지 않기때문에 오류발생

	}

}
