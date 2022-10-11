package ver01;

import java.util.Scanner;

/**
* - main()메소드를 정의합니다. ok
* - 연락처 데이터를 저장하는 인스턴스를 생성합니다.
* - 변수 값을 반환하는 각각의 메소드를 호출해서 각 데이터를 출력문으로 출력합니다. 
* - 생성된 인스턴스의 정보 출력 메소드를 호출합니다.
* - 인스턴스의 각 변수에 값을 바꾸는 메소드를 이용해서 데이터를 수정합니다. 
* - 인스턴스의 출력메소드를 다시 실행합니다.
*/
public class ContactMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("원하시는 메뉴를 선택해주세요");
			System.out.println("1. 입력시작 | 0. 종료");
			String select = sc.nextLine();
			
			// 사용자의 요청에 따라 프로그램 종료 / 진행 => 분기가 나뉜다.
			if(select.equals("0")) {
				System.out.println("프로그램을 종료합니다.");
				break; // 벗어나기 위한(프로그램종료) 키워
				// break : 자신이 포함된 가장 가까운 반복문을 벗어난다.
			}else if(!select.equals("1")) {
				System.out.println("올바른 요청이 아닙니다.");
				System.out.println("다시 입력해주세요.");
				continue; // 조건이 1이 아닐때이고 0의조건은 주어져 있으니  
			}
			
			System.out.println("데이터 입력을 시작합니다.");
			
			System.out.println("이름 >>> ");
			String name = sc.nextLine();
			
			System.out.println("전화번호 >>> ");
			String phoneNumber = sc.nextLine();
			
			System.out.println("이메일 >>> ");
			String email = sc.nextLine();
			
			System.out.println("주소 >>> ");
			String address = sc.nextLine();
			
			System.out.println("생일 >>> ");
			String birth = sc.nextLine();
			
			System.out.println("그룹 >>> ");
			String group = sc.nextLine();
			
			Contact ct = new Contact(name, phoneNumber, email, address, birth, group);
			
			ct.printInfo();
			
		}
		
	}

}
