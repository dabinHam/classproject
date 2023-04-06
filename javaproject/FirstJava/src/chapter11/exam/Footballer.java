package chapter11.exam;

import java.util.ArrayList;
import java.util.List;

public class Footballer {
	/*
	 * 1. 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 인스턴스를 저장하고 출력하는 프로그램을 만들어봅시다.
	 * 2. 축구선수의 인스턴스가 팀과 이름 그리고 나이가 같으면 같은선수라 판단하고 입력이 되지 않도록 Set<E>컬렉션을 이용해서 축구선수인 스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다. 
	 * 3. TreeSet<E>을 이용해서 팀 이름순으로 정렬 하고, 같은팀의 선수들은 이름순 으로 정렬 하고, 같은 이름의 선수는 번호순으로 저장하는 프로그램을 만들어 봅시다.
	 * 4. 축구선수의 번호를 key로 하고 축구선수 인스턴스를 저장하는 Map<K,V>인스턴스를 이용해서 프로그램을 만들어 봅시다.
	 */
	
	public static void main(String[] args) {
		// 1. 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 
		// 인스턴스를 저장하고 출력하는 프로그램을 만들어봅시다.
		
		List<SoccerPlayer> players = new ArrayList<SoccerPlayer>();
		
		SoccerPlayer player = new SoccerPlayer();
		players.add(player);
		
		players.add(new SoccerPlayer("케인",10,"토트넘",25));
		
		
	}
}
