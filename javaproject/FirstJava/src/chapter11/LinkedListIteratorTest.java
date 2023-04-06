package chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIteratorTest {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(50);

		// Iterator 를 이용한 일괄처리
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			Integer integer = itr.next(); // 간혹 itr.next()를 두번사용하는경우가 있는데 그럼 안된다.
//			itr.next();
			System.out.println(integer);
		}
		
	}
	
	static <E> void printAll(ArrayList<E> list) {
		for (E obj : list) {
			System.out.println(obj);
		}

	}
}
