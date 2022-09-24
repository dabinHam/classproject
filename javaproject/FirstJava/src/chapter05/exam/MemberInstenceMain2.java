package chapter05.exam;

public class MemberInstenceMain2 {

	public static void main(String[] args) {

		MemberInstence2 m1 = new MemberInstence2("손흥민", // 이름
				"010-1111-2222", // 전화번호
				"축구", // 전공
				1, // 학년
				"son@gmail.com", // 이메일
				20000101, // 생일
				"런던" // 주소
		);

		m1.showMemberInfo();

		MemberInstence2 m2 = new MemberInstence2("손흥민", "010-1111-2222", "축구", 1, "son@gmail.com");
		m2.showMemberInfo();

	}

}
