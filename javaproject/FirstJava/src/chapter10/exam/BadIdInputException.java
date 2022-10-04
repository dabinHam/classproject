package chapter10.exam;

public class BadIdInputException extends Exception {

	String userId;
	
	public BadIdInputException(String userId) {
		super("입력하신 ID :"+ userId +"는 정상적인 형태의 ID가 아닙니다.");
		this.userId = userId;
	}
	
	public String getUserId() {
		return userId;
	}
	
}
