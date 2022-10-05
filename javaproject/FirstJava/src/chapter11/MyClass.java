package chapter11;
// 제너릭클래스  <T>타입 파라미터 
public class MyClass<T> {
	
	T val;
	
	T getVal(){
		return val;
	}
	
	void setVal(T val) { // value가 가지고 있는 타입을 ()넣어주기
		this.val = val;
	}
	
	public static void main(String[] args) {
		
		// 제네릭 클래스는 인스턴스 생성시에 타입을 결정한다!
		MyClass<String> myClass = new MyClass<String>();
		String str = myClass.getVal(); // 위에서 <String>로 정의해줬기 때문에 이 메소드는 String타입이 된것이다.
		
		myClass.setVal("King");
		System.out.println(myClass.getVal());
		
		
	}
	
	
}
