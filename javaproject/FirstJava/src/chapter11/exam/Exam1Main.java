package chapter11.exam;

import java.util.ArrayList;
import java.util.List;

public class Exam1Main {
	/*
	 * 1. 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 인스턴스를 저장하고 출력하는 프로그램을 만들어봅시다.
	 * 2. 축구선수의인스턴스가팀과이름그리고나이가같으면같은선수라판단하고입력이되지않도록Set<E>컬렉션을이용해서축구선수인 스턴스를 저장하고 출력하는
	 * 프로그램을 만들어 봅시다. 
	 * 3. TreeSet<E>을이용해서팀이름순으로정렬하고,같은팀의선수들은이름순으로정렬하고,같은이름의선수는번호순으로저장하는프로 그램을 만들어 봅시다.
	 * 4. 축구선수의번호를key로하고축구선수인스턴스를저장하는Map<K,V>인스턴스를이용해서프로그램을만들어봅시다.
	 */

	public static void main(String[] args) {

		// 1. 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 
		// 인스턴스를 저장하고 출력하는 프로그램을 만들어봅시다.
		
		List<FootballPlayer> players = new ArrayList<FootballPlayer>();
		
		// List<E> => 저장 메소드 add(new FootballPlayer())
		FootballPlayer player = new FootballPlayer("손흥민", 7, "토트넘", 20); 
		players.add(player);
		
		players.add(new FootballPlayer("케인", 10, "토트넘", 25)); // 원래는 위에 처럼 변수를 선언하고 사용자를 호출했는데 이렇게 한번에 할 수 도 있다.
		players.add(new FootballPlayer("이강인", 25, "토트넘", 19));
		players.add(new FootballPlayer("박지성", 7, "맨유", 35));
		players.add(new FootballPlayer("루니", 10, "맨유", 35));
		players.add(new FootballPlayer("손흥민", 7, "토트넘", 20));
		
		
		// List<E> : 저장순서를 유지 -> index 값을 가지고, 일괄처리 
		// 나의 선수 리스트
		System.out.println("나의 선수 리스트 ==========================");
		for( FootballPlayer p : players) { // 	블럭안의 변수라도 바깥쪽에 있는 변수와 충돌할 수 있기 때문에 p 로 따로 정의해줌
			System.out.println(p);
		}
		
		
		
	}

}
