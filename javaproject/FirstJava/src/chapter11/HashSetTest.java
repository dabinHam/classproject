package chapter11;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	
	public static void main(String[] args) {
	
		HashSet<String> set = new HashSet<>();
		
		// 저장
		set.add("빨강색");
		set.add("주황색");
		set.add("노랑색");
		set.add("주황색");
		set.add("빨강색");
		
		System.out.println("저장된 요소의 개수 :" + set.size()); // 3 <-중복저장하지 않는다.
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next()); // 순서가 없이 리스트가 나온다. 중복저장하지 않는다.
		}
		
	}
	
	
}
