package first;

public class Calculator {

	public static void main(String[] args) {
		
		System.out.println("10+20="+ add(10,20) ); //원하는결과 : 10+20=30 //add하고 Ctrl + space을 해주면 매개변수의 타입이 뭔지 다시 한번확인하기.
		System.out.println("100-10="+ substract(100,10));
		System.out.println("100*100="+ multifly(100,100));
		System.out.println("10/3="+ divide(100,100));
		
	}
	// 숫자 두 개를 매개변수의 인자로 전달받아 더하기 메소드를 추가합시다.(반환)
	public static long add(long num1,long num2) {
		long result = num1 + num2;
		return result; 
		//return num1+num2; // 위의 코드 2줄을 간결하게 정리한것(리팩토링=가독성을 높히고 불필요한 코드를 줄이는 것), 학습할땐 길게 하자. 	
	}
	
	// 숫자 두 개를 매개변수의 인자로 전달받아 빼기 메소드를 추가합시다.
	public static long substract(long num1, long num2) {
		return num1-num2;
	}
	
	// 숫자 두 개를 매개변수의 인자로 전달받아 곱하기 메소드를 추가합시다.
	public static long multifly(long num1, long num2) {
		return num1*num2;
	}
	
	// 숫자 두 개를 매개변수의 인자로 전달받아 나누기 메소드를 추가합시다. (정수의 나누기는 소숫점으로 받아야 정확하기 때문에 double 타입으로)
	public static double divide(double num1, double num2) {
		return num1/num2;
	}
	
}
