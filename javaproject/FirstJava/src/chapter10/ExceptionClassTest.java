package chapter10;
// 자주 사용하는 JAVA에서 제공하는 예외클래스

public class ExceptionClassTest {

	public static void main(String[] args) {

		// ClassNotFoundException
		try {
			Class c1 = Class.forName("Test");
		} catch (ClassNotFoundException e) {

			// e.printStackTrace();
		}

		// ArithmeticException
		try {
			int num = 10 / 0;
		} catch (ArithmeticException e) {

		}

		// ArrayIndexOutOfBoundsException
		int[] arr = new int[3];
		try {
			arr[3] = 10;
		} catch (ArrayIndexOutOfBoundsException e) {

		}

		// ArrayIndexOutOfBoundsException
		try {
			String[] names = new String[-1];
		} catch (ArrayIndexOutOfBoundsException e) {

		}
		
		String str = null; 
		
		try {
		System.out.println(str.toString());
		} catch(NullPointerException e) {// 내가 인스턴스 참조값을 받아서 사용하는 경우 예외(null)가 발생할 수 있다라고 판단이 될때 사용.
			
		}
		
		

	}

}
