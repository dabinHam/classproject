package chapter11;

import java.util.HashSet;

public class SmartPhoneTreeSetTest2 {

	public static void main(String[] args) {

		HashSet<SmartPhone> set = new HashSet<>();

		set.add(new SmartPhone("AAA", "010-0000-0000"));
		set.add(new SmartPhone("BBB", "010-1222-1111"));
		set.add(new SmartPhone("CCC", "010-2323-8888"));
		set.add(new SmartPhone("DDD", "010-3222-0000"));
		set.add(new SmartPhone("EEE", "010-4333-3333"));
		set.add(new SmartPhone("FFF", "010-5111-5555"));

		System.out.println("요소의 개수 : " + set.size());
		// hashcode , equals 를 설정해 두지 않은 참조객체(내가만든)는 결과값이 중복되어 나온다.
		// 설정 해 주면 중복은 제외되어 출력된다.

		for (SmartPhone sp : set) {
			System.out.println(sp);
		}

	}

}
