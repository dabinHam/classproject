package chapter05.modifier;

public class PrivateTest {
//	String name;
//	int age;
	// private를 앞에 붙히면 다른 곳에서 볼 수 없다.
	private String name;
	private int age;

	public PrivateTest() {
		this.name = "함다빈";
		this.age = 28;
	}

	public void showInfo() {
		System.out.println("이름 : " + this + name);
		System.out.println("나이 : " + this + age);
	}
}
