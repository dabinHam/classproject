package chapter09;

public class StringTest {

	public static void main(String[] args) {
		
		// 문자열을 다루는 String
		String str1 = "String";
		String str2 = "String";
		String str3 = new String("String");
		
		System.out.println("str1 == str2 =>  " + (str1 == str2)); // 주소값 비교
		System.out.println("str1 == str2 =>  " + (str1 == str3));
		
		System.out.println(str1.equals(str3)); // 문자열 비교
		
		// 특정 타입의 데이터 -> 문자열 String 타입으로 변경
		String str4 = ""+1; // 공백란인스턴스를 생성해서 하는건 좋은방법은 아니다.
		String str5 = String.valueOf(false);
		String str6 = new String();
		System.out.println(str5);
		
		//////////////////////////////////////////
		System.out.println("\n--------------------------------\n");
		
		String str = "Hello~";
		System.out.println(str.toString());
		
		System.out.println(str.charAt(0)); // substring 같이 순서에 위치한 특정 문자열을 뽑아준다.
		System.out.println(str.charAt(5));
		
		// 문자열을 역순으로 출력해보자
		System.out.println("문자열 출력 ----------");
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		
		System.out.println("역순 출력 -----------");
		for(int i=str.length()-1; i>=0; i--) {
			System.out.println(str.charAt(i));
		}
		
		System.out.println();
		
		// 숫자로 표현된다.
		System.out.println(str.compareTo("Hello~"));
		System.out.println(str.compareTo("Hello~~~~~"));
		System.out.println(str.compareTo("Hello"));
		
		// 문자열의 합 
		System.out.println(str.concat(str.concat(str1))); // "Hello~" + "String"
		
		// 문자열의 포함 확인
		System.out.println(str.contains("He"));
		System.out.println(str.contains("bye"));
		
		System.out.println(str.startsWith("He"));
		System.out.println(str.endsWith(".pdf")); // 확장자 찾기에 활용 가능 
		
		
		System.out.println(); 		
		System.out.println(str.equals("top")); 		
		System.out.println(str.equals("Hello~")); 		
		
		System.out.println(); 		
		System.out.println(str.indexOf("1")); 		
		System.out.println(str.lastIndexOf("1")); 		
				
		// 문서.ver01.20220927.xls
		// Hello~
		System.out.println(str.indexOf("o~"));
				
		System.out.println();
		System.out.println(str.isEmpty()); 
		System.out.println("".isEmpty()); 
		System.out.println(" ".isEmpty()); 
		System.out.println(" a ".trim().isEmpty()); // trim이 앞의 공백을 지워줬다.
		
		System.out.println(str.length());
		System.out.println(str.length()==0); // length : 반환하는 갯수, 위에 isEmpty와 같은 의미이다.
		
		System.out.println();
		// 문자열 치열
		System.out.println(str.replace("~", "!!!!"));
				
				
				
	}
	
	
	
	
	
}
