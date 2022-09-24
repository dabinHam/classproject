package chapter05.modifier;

public class SingletonMain {

	public static void main(String[] args) {

		Singleton s = null;

		// s = new Singletn(); // Singleton 파일에서 private 처리가 되어있으면 사용못함.

		s = Singleton.getInstance(); // Singleton 파일에서 getInstance라는 메소드를 사용하여 제공받음.

	}

}
