package chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionTest {

	public static void main(String[] args) {

//		Random random = new Random();
//		
//		//랜덤적으로 -21억~ 21억 사이의 수를 뽑아낸다.
//		System.out.println(random.nextInt());
//		// 10의 범위안에서 수를 뽑아낸다.
//		System.out.println(random.nextInt(10));
//		
//		for(int i=0; i<10; i++) {
//			// 10의 범위안에 리스트 뽑는다
//			System.out.println(random.nextInt(10));
//		}

		List<Integer> lottoNumber = new ArrayList<>();

		for (int i = 0; i < 6; i++) {
			lottoNumber.add(new Random(System.nanoTime()).nextInt(45)-1);
		}
		
		System.out.println("로또 번호");
		printAll(lottoNumber);
		
		System.out.println();
		
		System.out.println("최대값 : " + Collections.max(lottoNumber));
		System.out.println("최소값 : " + Collections.min(lottoNumber));
		
		Collections.sort(lottoNumber);
		System.out.println("정렬 ===============");
		printAll(lottoNumber);
		
		// 역순으로 정렬
		Collections.reverse(lottoNumber);
		System.out.println("역순으로 정렬 ===============");
		printAll(lottoNumber);
		
		// 섞기
		Collections.shuffle(lottoNumber);
		System.out.println("요소 위치 섞기 : 셔플 ===============");
		printAll(lottoNumber);
		
		List<Integer> list1 = Collections.emptyList();
		System.out.println("리스트 요소의 개수 : " + list1.size());
		
		
		
		
		// printAll(lottoNumber);이 대신 해줌
//		for (int n : lottoNumber) {
//		System.out.println(n);
//	}

	}
	
	static void printAll(List<Integer> list) {
		for(int n : list) {
			System.out.println(n);
		}
	}

}
