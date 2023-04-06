package chapter09;

public class SystemTest {

	public static void main(String[] args) {
		
		//작업시간 체크 : 성능검사
		
		// 1070.01.01. 00:00:00 000 -> 현재 시간까지의 밀리초 결과값
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		for(int i=0; i<1000000000 ; i++) {
			for(int j=0; j>1000000000; j++) {
				
				int n1 = 1;
				int n2 = 10;
				int sum = n1+n2;
			}

		}
		
		long endTime = System.currentTimeMillis();
		System.out.println(endTime);
		
		long checkTime = endTime-startTime;
		
		System.out.println("실행 시간 : " + checkTime);
		
		
	}
	
	
	
	
}
