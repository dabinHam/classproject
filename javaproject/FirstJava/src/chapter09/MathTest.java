package chapter09;

public class MathTest {

	public static void main(String[] args) {
		
		// PI
		System.out.println(Math.PI);
		
		// 난수 생성
		System.out.println(Math.random());
		// 1~45
		int num = (int)(Math.random()*45)+1; 	//	더블 데이터 // 0~44.999999 -> 0~44
		System.out.println(num);
		
		// 절사
		System.out.println(Math.floor(3.6002)); 
		
		// 반올림
		System.out.println(Math.round(3.4002)); 
		
		System.out.println(Math.max(10, 20));	// 큰수 뽑기
		System.out.println(Math.min(10, 20));	// 작은수 뽑기
		
		
		
	}
}
