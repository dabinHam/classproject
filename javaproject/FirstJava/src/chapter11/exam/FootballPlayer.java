package chapter11.exam;

public class FootballPlayer implements Comparable<FootballPlayer>{

	private String name;
	private int number;
	private String team;
	private int age;

	public FootballPlayer(String name, int number, String team, int age) {
		super();
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}

	public FootballPlayer() {
		super(); // Object 클래스에 있는 super() 생성자 호출 (default) 잊지말고 만들어주기! 아무것도 없어야만 자동으로 생기는거니까
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	//2번
	@Override
	public int hashCode() {
		return age; // 몰려있는 나이대가 있을 수 있기 때문에 엄청 좋은 방법은 아니다!
	}

	@Override
	public boolean equals(Object obj) {

		boolean result = false;
		
		if(obj != null && obj instanceof FootballPlayer) {

			FootballPlayer player = (FootballPlayer) obj;
			// 팀과 이름 그리고 나이가 같으면
			result = team.equals(player.getTeam())
					&& name.equals(player.getName())
					&& age==player.getAge();
		}
		
		return result;
	}
	
	//3번
	@Override
	public int compareTo(FootballPlayer o) { // compareTo를 생성해주고 toString 위에 올려줌(구별을 위하여)
		// 팀이름 -> 선수이름 -> 번호
		int result = team.compareTo(o.getTeam());	// 최초 초기화시 꼭 0 을 해야하는건 아님. 이번엔 팀이름을 제일 먼저 비교해야하는거니까 팀 이름을 넣어줌.
		if(result == 0) {
			result = name.compareTo(o.getName());
			if(result == 0) { // 등번호가 크면 양수, 작으면 음수로 나올꺼 (TreeSet기준)
				result = number - o.getNumber();
			}
		}
		return result*-1; // *-1 : 역순으로 출력
	}
	
	@Override
	public String toString() {
		return "FootballPlayer [name=" + name + ", number=" + number + ", team=" + team + ", age=" + age + "]";
	}

	// 현재 클래스의 기능 테스트 용도
	public static void main(String[] args) {
		
	}


	
	
}
