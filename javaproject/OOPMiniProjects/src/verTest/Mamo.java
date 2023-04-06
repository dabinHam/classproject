package verTest;

import java.util.regex.Pattern;

public class Mamo {

//	2. 연락처 이름 이력 시에 공백에 대한 예외처리와 영문자와 한글만 허용하는 예외 처리를 해봅시다. 
	boolean chk = false;
	
	while(!chk) {
	
		chk = Pattern.matches("^[a-zA-Z가-힣ㄱ-ㅎ]*$", name);
		
		try {
			if(!chk) {
				throw new Exception();
			}
			
		} catch (Exception e) {
			System.out.println("영문자와 한글만 입력가능합니다. \n다시 입력해주세요 > ");
		}
	}
	
	
	
	
	
	
	
//	3. 전화번호 형식에 맞지 않을 때 예외처리를 하고 중복될 때 예외 상황이 발생하도록 하고 예외 처리를 합시다.
	boolean chk1 = false;
	
	while(!chk1) {
	
		chk1 = Pattern.matches("^(\\d{3})-(\\d{4})-(\\d{4})$", number);
		
		try {
			if(!chk1) {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("010-0000-0000 형식에 맞게 입력해주세요 > ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}