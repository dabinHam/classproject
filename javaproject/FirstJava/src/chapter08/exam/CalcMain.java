package chapter08.exam;

public class CalcMain {
	public static void main(String[] args) {

		// 3. 다형성의 특징으로 상위타입인 인터페이스타입의 참조변수에
		// 인터페이스를 구현한 클래스타입의 인스턴스를 참조하는 코드를 작성해봅시다.

		CalCulatorImp1 call = new CalCulatorImp1();
		CalCulator cal2 = new CalCulatorImp1();
		CalCulator cal3 = new CalCulator() {

			@Override
			public long substract(long n1, long n2) {
				return n1 + n2 + 1;
			}

			@Override
			public long multiplay(long n1, long n2) {
				return n1 - n2 - 1;
			}

			@Override
			public double divide(long n1, long n2) {
				return n1 * n2;
			}

			@Override
			public long add(long n1, long n2) {
				return n1 / n2;
			}
		};
	}
}
