package chapter13;

public class SumThread extends Thread{

	Sum s;

	long num1; 
	long num2;
	
	public SumThread(Sum s, long num1, long num2) {
		super();
		this.s = s;
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public void run() {
		
		for(long i=num1; i<=num2; i++) {
			s.sum(i);
		}
	
	}
	
	public static void main(String[] args) {
		
		// 합의 데이터를 저장하고, 합을 구해주는 메소드가 정의된 객체
		Sum sum = new Sum();
		
		SumThread t1 = new SumThread(sum, 1, 500000);
		SumThread t2 = new SumThread(sum, 50000, 1000000);
		
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("합 : " + sum.sum);
		
		
	}
	
	
	
}

class Sum{
	long sum;
	// 동기화 처리 키워드 / 매소드 앞에 synchronized 키워드를 붙혀준다
//	synchronized void sum(long num) {
//		// 동기화 처리된 메소드에서 여러 처리를 하는 경우 -> 성능저하 -> 동기화블록
//		sum += num;
//		
//		
//		
//		
//	}
	
	void sum(long num) {
		// 동기화 처리된 메소드에서 여러 처리를 하는 경우 -> 성능저하 -> 동기화블록
		
		synchronized (this) { // 동기화가 필요한 부분만 블럭으로 감싸서 처리를 하면 이 블럭부분만 순차적으로 하는 동기화블럭
			sum += num;	// 메소드 앞쪽에서 여러작업이 일어나야 할 때 많이 사용된다.
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
