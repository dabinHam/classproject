package ver01;

import java.util.Scanner;

//이름, 전화번호, 이메일, 주소, 생일, 그룹
public class ProjectMain {

	public static void main(String[] args) {
		
		Project pt = new Project("ham", "010-1234-5678", "ham@gmail.com", "서울", "0726", "하이미디어");

		System.out.println("이름 : " + pt.getName());
		System.out.println("전화번호 : " + pt.getPhoneNumber());
		System.out.println("이메일 : " + pt.getEmail());
		System.out.println("주소 : " + pt.getAddress());
		System.out.println("생일 : " + pt.getBirth());
		System.out.println("그룹 : " + pt.getGroups());
		
		pt.showInfo();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 >>> ");
		pt.setName(input.nextLine());
		System.out.println("전화번호를 입력하세요 >>> ");
		pt.setPhoneNumber(input.nextLine());
		System.out.println("이메일을 입력하세요 >>> ");
		pt.setEmail(input.nextLine());
		System.out.println("주소를 입력하세요 >>> ");
		pt.setAddress(input.nextLine());
		System.out.println("생일을 입력하세요 >>> ");
		pt.setBirth(input.nextLine());
		System.out.println("그룹을 입력하세요 >>> ");
		pt.setGroups(input.nextLine());

		pt.showInfo();
	}
}
