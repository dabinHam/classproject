package chapter09;

public class StringBufferTest {

	public static void main(String[] args) {
		
		// string의 문제점 : 연산할때 마다 계속해서 인스턴스생성함.
		
		// StringBuffer(동기화o)멀티스레드, StringBuilder,단일스레드 = 이름만 다르지 거의 같다.
		// 동기화를 해줄수 있느냐 없느냐로 구분함.
		// 하나의 데이터를 여러명이 사용하게 되면 오류가 날 수 있는데 이걸 처리하는게 동기화라고 한다.
		
		StringBuffer sb = new StringBuffer("Hello~"); // 6 + 16
		
		System.out.println(sb);
		
		// 문자열 붙이기
		sb.append('~');
		sb.append(false);
		
		System.out.println(sb);
		
		// 특정 문자열 삭제하기
		System.out.println(sb.delete(0, 1));
		
		// 특정 위치에 문자열 삽입 (중간에 삽입)
		System.out.println(sb.insert(6, "~"));
		System.out.println(sb.insert(sb.length(), true)); // append = insert 	거의 비슷하다
		
		// 문자열을 역순으로 바뀜
		System.out.println(sb.reverse());
	}
	
}
