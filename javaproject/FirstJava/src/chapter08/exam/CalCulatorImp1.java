package chapter08.exam;

//2. Calulator인터페이스를 상속 하는 인스턴스를 생성 할수있는 클래스를 정의 해봅시다.
public class CalCulatorImp1 implements CalCulator {

	@Override
	public long add(long n1, long n2) {
		return n1 + n2;
	}

	@Override
	public long substract(long n1, long n2) {
		return n1 - n2;
	}

	@Override
	public long multiplay(long n1, long n2) {
		return n1 * n2;
	}

	@Override
	public double divide(long n1, long n2) {
		return n1 / n2;
	}

	
}
