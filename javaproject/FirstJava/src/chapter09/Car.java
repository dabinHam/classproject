package chapter09;

// equals를 사용하여 문자열 비교해보는 예제
public class Car extends Object {

	String name;

	Car(String name) {
		this.name = name;
	}

//	@Override
//	public String toString() {
//		
//		return "자동차";
//	}
	@Override
	public boolean equals(Object obj) { //Object클래스는 최상위 클래스이기 때문에 어떤타입이던 들어올 수 있다. 지금 우리가 비교해야하는건 자동차 타입만 비교해줘야함.

		boolean result = false; // 1번째 정의) 기본값은 같지 않다. //result를 check 라고 해도 된다.

		// instanceof : obj가 Class에 속하거나 Class를 상속받는 클래스에 속하면 true가 반환됩니다.
		/*
		 * obj 는 null 이면 안되고, obj 가 Car 타입으로 형변환으로 가능한지 봐야한다. 
		 * -> 형변환이 되어야 car1이가지고 있는 이름, 전달되는 참조변수 값을 비교할 수 있기 때문. 
		 * 들어오는 Object가 null이면 참조하는게 없다는 뜻인데 호출하는 equals 값이 null이면 비교할 필요가 없다.
		 */

		// 논리연산자를 작성할때 주의! &&연산일 때 앞에가 false 값이면 뒤에는 연산이 되지 않는다. 
		if (obj != null && obj instanceof Car) { // 3번째 정의) 조건 : null이면 비교 안되는거고 같은 Car타입이 아니면 비교할 수가 없다 => 조건에 부합하지 않으면false로 넘어가도록 처리된다.

			// 기본값은 같지않다라고 처리 했기 때문에 몇 가지 조건을 통하여 true다 라고 판단하게 만들면 된다.
			Car car = (Car) obj; // 전달받은 매개변수(obj)를 하위 타입 으로 형변환을 하는거니까 명시적으로 형변환처리(Car) 를 해줘야한다. 
								// 왜 형변환을 해줘야 하는가? 다형성 때문에 그냥 obj 는 사용할 수 없기 때문

			// 현재 car1인데 car1에 car2를 넣어준것 , car1 인스턴스에 있는 .name(=String) .equals(car) => result 에 넣어주기
			result = this.name.equals(car.name);

		}

		return result; // 2번째 정의) result를 return에 반환.
	}

	// 만약 Person 클래스의 주민번호를 체크했을때 주민번호가 같으면 논리적으로 같은사람이라고 생각하지만, 
	// 인스턴스를 생성하면 서로 다르다고 판단하기 때문에 오버라이딩을 하여 비교 할 수 있게 한다.
	@Override
	public String toString() {
		return "Car [name=" + name + "]";
	}

	public static void main(String[] args) {
		Car car1 = new Car("BMW");
		Car car2 = new Car("BMW");

		System.out.println(car1); // toString() -> 클래스의 풀네임@해시코드 16진수 //Object내에서 toString()이 저렇게 정의되어있음
		// System.out.println(car1.hashCode()); // 16진수로 나타냄 - 0~9까지 나타내고 10 넘어가면
		// a,b,c...으로 나타내는게 16진수
		System.out.println(car2);

		System.out.println("car1 == car2 =>  " + (car1 == car2)); // false 나옴 서로다른 주소값을 가지고 있기 때문에 false가 맞음.
		System.out.println("car1.equals(car2) =>  " + car1.equals(car2));
		// Object equals() 메소드는 참조값 비교하고 결과를 반환 정의

		if (car1.equals(car2)) {
			System.out.println("같은 차종입니다.");
		} else {
			System.out.println("서로다른 차종입니다.");
		}

	}

}
