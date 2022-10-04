package chapter07.exam;

public class Female extends Person {
	
	String hobby;
	String likeColor;
	int likeNum;

	public Female(String name, String personNumber, String hobby,String likeColor, int likeNum) {
		super(name, personNumber);
		this.hobby = hobby;
		this.likeColor = likeColor;
		this.likeNum = likeNum;
	}

	void printfavoriteInfo() {
		System.out.println("좋아하는 취미는 "+ hobby +" 입니다.");
	}

	@Override
	void printInfo() {
		super.printInfo();
		printfavoriteInfo();
		System.out.printf("좋아하는 색상은 %s 이고, 좋아하는 숫자는 %d 입니다.",this.likeColor,this.likeNum);
	}
	
	
}
