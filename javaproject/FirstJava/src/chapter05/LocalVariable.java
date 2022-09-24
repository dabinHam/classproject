package chapter05;

public class LocalVariable {
	// 지역변수

	void method(int num) {
		// 매개변수도 지역변수

		int lv = 10; // method 내부에서 선언되는 변수도 지역변수

		if (num > 10) { // 이런 경우는 많이는 없지만 있으니까 알고있짜.
			boolean check = true; // 참 과 거짓인 경우가 다르게 나눠지기 때문에 오류나지않음.
		} else {
			boolean check = false;
		}

		// int lv = 100;

		for (int i = 0; i < 10; i++) { // i는 for 블럭 안에서만 유효한 범위를 가진다.
			// i는 for 블록 안에서만 사용 가능한 지역변수
			System.out.println(num++);
		}
		// System.out.println(i);

		while (lv < 0) {
			int lv2 = 0;
			System.out.println(num++);
		}
		// System.out.println(lv2);

	}

	public static void main(String[] args) {

		LocalVariable lv = new LocalVariable();
		lv.method(0);

	}

}
