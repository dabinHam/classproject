package chapter08.phone;

public class Computer {
	
	String account;	// 폰을 쓸때 사용하는 계정(account)
	
	Computer(String account){	// 생성자
		this.account = account;
	}
	
	void calculator() {
		System.out.println("컴퓨팅을 통해 계산을 합니다.");
	}
}
