package chapter11.exam;

public class SoccerPlayer implements Comparable<SoccerPlayer> {

	private String name;
	private int num;
	private String team;
	private int age;
	
	public SoccerPlayer(String name, int num, String team, int age) {
		super();
		this.name = name;
		this.num = num;
		this.team = team;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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
	
	

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public int compareTo(SoccerPlayer o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
	}
	
