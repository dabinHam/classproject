package chapter10;
// 자주 사용하는 JAVA에서 제공하는 예외클래스
// 하나로 묶어서 처리할 수 있는 방법. 하지만 만약 예외클래스중 위에 있는게 예외발생되면 그 다음껀 처리되지 못한다는 단점이 있다.
public class ExceptionClassTest2 {

	public static void main(String[] args) {

		int[] arr = new int[3];
		String str = null;
		try {

			Class c1 = Class.forName("Test");

			int num = 10 / 0;

			arr[3] = 10;

			String[] names = new String[-1];

			System.out.println(str.toString());

		} catch (ClassNotFoundException e) {
			// e.printStackTrace();
		} catch (ArithmeticException e) {

		} catch (ArrayIndexOutOfBoundsException e) {

		} catch (NullPointerException e) {// 내가 인스턴스 참조값을 받아서 사용하는 경우 예외가 발생할 수 있다라고 판단이 될때 사용.

		}

	}

}
