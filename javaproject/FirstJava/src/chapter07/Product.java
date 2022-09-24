package chapter07;

public class Product { // 2. 눈에 보이지 않지만 extends Object 라는 클래스를 상속하고있음.

	int price;
	int point;

	Product(int price) {
		this.price = price;
		this.point = price / 10;
	}

}

class TV extends Product { // <- 1. 여긴 정확하게 extends	Product 라고 Product를 상속한다고 되어있음.

	TV(int price) { // 꼭 정확한 사용법 알고 사용하기
		super(price);
	}

	@Override
	public String toString() {
		return "TV";
	}

}

class Computer extends Product {
	Computer(int price) {
		super(price);
	}

	// @Override 없이 선언 가능
	public String toString() { // <- toString 도 @Override 선언되어있음
		return "Computer";
	}
}
// 3. 결론 TV,Computer 는 Product 와 Object를 둘 다 속하고있다.