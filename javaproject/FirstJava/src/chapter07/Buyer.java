package chapter07;

public class Buyer {

	int money; // 0 생성자를 통하여 초기화할수 있음.
	int myPoint;
	
	Buyer(int money){ // 생성자
		this.money = money;
	}
	
	void buy(Product p) {
	
		money = money - p.price; // 내가 가진돈 차감
		// 보너스는 증가시켜야함.
		myPoint += p.point;
		System.out.println(p + "제품을 구매했습니다."); // p	 = 참조변수
		// p => p.toString()
		
	}
	
	public static void main(String[] args) {
		// 제품 만들기 : TV 인스턴스, Cpmputer 인스턴스
		TV tv= new TV(100);
		Computer com = new Computer(200);
		
		// 다형성
		Product p1 = tv;
		Product p2 = com;
		
		// 다형성을 이용한 배열 ,목록만들기 // tv도 제품이다, computer도 제품이다 라는 뜻
		Product[] products = new Product[5];
		//상위타입 = 하위타입의 인스턴스
		products[0] = new TV(100);
		products[1] = new Computer(200);
		products[2] = new Computer(200);
		products[3] = new Computer(200);
		products[4] = new TV(200);
		
		
		System.out.println("판매 상품 리스트-------------------");
		System.out.println("");
		for(int i=0; i<products.length; i++) {
			System.out.println(products[i] + "가격 : " + products[i].price);
		}
		System.out.println("-------------------------------");
		
		
		// 구매자 생성
		Buyer buyer = new Buyer(1000);
		
		// 구매 테스트 : tv, com, p1, p2
		buyer.buy(tv);
		buyer.buy(p2);
		buyer.buy(p1);
		buyer.buy(com);
		
		
	}
	
	
	
	
}
