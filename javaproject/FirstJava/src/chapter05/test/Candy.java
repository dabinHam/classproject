package chapter05.test;

import java.util.Date;
import java.util.Scanner;

// 캔디를 생성해보자. 
// 똑같은 모양,여러가지 맛,종류
public class Candy {
	// 1번 정의
//	int width; 
//	int height;
//	String type; // 맛,종류

	// 2번 정의
	static int width = 100;
	static int height = 100;
	String type; // 맛,종류

	Candy(String type) {
		this.type = type; // 초기화
		width = 100;
		height = 100;
	}

	public static void main(String[] args) {

		Scanner sc = null;
		Date date = null;
		// 1번 정의로 계산 했을 때
		// 인스턴스 8개 생성시 -> 변수 24개 생성
		// 인스턴스 80개 생성시 -> 변수 240개 생성
		// 인스턴스 800개 생성시 -> 변수 2400개 생성

		// 2번 정의로 계산 했을 때
		// 인스턴스 800개 생성시 -> 변수 800 + 2개 생성

		Candy c1 = new Candy("허브1");
		Candy c2 = new Candy("허브2");
		Candy c3 = new Candy("허브3");
		Candy c4 = new Candy("허브4");
		Candy c5 = new Candy("허브5");
		Candy c6 = new Candy("허브6");
		Candy c7 = new Candy("허브7");
		Candy c8 = new Candy("허브8");
	}

}
