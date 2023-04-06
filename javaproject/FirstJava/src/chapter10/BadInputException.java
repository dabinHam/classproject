package chapter10;

public class BadInputException extends Exception {

	int score;

	public BadInputException(int score) {
		super("입력하신 점수" + score + "는 정상 범위의 점수가 아닙니다.");
		this.score = score;
	}

	public int getScore() {
		return score;
	}
	

}
