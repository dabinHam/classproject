package chapter11;

import java.util.HashSet;

public class SmartPhoneSetTest {

	public static void main(String[] args) {

		HashSet<SmartPhone> set = new HashSet<>();

		set.add(new SmartPhone("name1", "010-0000-0000"));
		set.add(new SmartPhone("name2", "010-1111-1111"));
		set.add(new SmartPhone("name3", "010-0000-0000"));
		set.add(new SmartPhone("name4", "010-0000-0000"));
		set.add(new SmartPhone("name5", "010-3333-3333"));
		set.add(new SmartPhone("name6", "010-1111-1111"));

		System.out.println("요소의 개수 : " + set.size());
		// hashcode , equals 를 설정해 두지 않은 참조객체(내가만든)는 결과값이 중복되어 나온다.
		// 설정 해 주면 중복은 제외되어 출력된다.

		for (SmartPhone sp : set) {
			System.out.println(sp);
		}

	}

}
