package chapter06;

public class ArrayTest7 {

	public static void main(String[] args) {

		// Math.random() : 반환 타입 double
		// 0.0 <= Math.random() < 1

		// 0~9 까지의 숫자를 뽑고싶을때
		// 0.0 * 10 <= Math.random() * 10 < 1 * 10
		// 0.0 <= Math.random() * 10 < 10
		// 0.0 <= r <= 9.99999999999
		// 0.0 * 10 <= (int)( Math.random() * 10 ) < 1 * 10
		// 0 <= r <= 9
		System.out.println(Math.random());
		System.out.println((int) (Math.random() * 10));

		String[] players = { "가가", "나나", "다다", "라라", "마마" };

//		// 0번지의 값과 1번지 값을 치환
//		String temp = null;
//		temp = players[0];
//		players[0] = players[1];
//		players[1] = temp;
//		
//		System.out.println(players[0]);
//		System.out.println(players[1]);


		for (int i=0; i<10000; i++) {
			// 1~4
			// 0 <= <= 3
			// 1 <= <= 4
			int randomIndex = (int) (Math.random() * 4) + 1;

			String temp = null;
			temp = players[0];
			players[0] = players[randomIndex];
			players[randomIndex] = temp;
		}


		for (String name : players) {
			System.out.println(name);

			// System.out.println(players[0]);
			// System.out.println(players[1]);
			//
			 // index : 0~4 (범위) 랜덤출력 만들어보기
			 int index = (int)(Math.random() * 5);
			 String pickName = players[index];
			 System.out.println(pickName);
		}

	}

}