package chapter06.exam;

public class StudentMain {
//	 3. main()메소드에 아래 내용을 정의해봅시다.
//	 - Student 타입의 배열을 선언하고, 요소 10개를 저장할 수 있는 배열 인스턴스를 생성해 봅시다. 
//	 - Student 타입의 인스턴스를 생성하고 배열에 저장하는 코드를 정의해봅시다.
//	 - 배열에 저장된 Student 타입의 인스턴스의 메소드를 이용해서 모든 데이터를 출력해봅시다.
	public static void main(String[] args) {
		
		Student[] st = new Student[10];
		
		for (int i=0; i<st.length; i++) {
			
			st[i] = new Student(
					"학생" + i, 
					(int) (Math.random()*100)+99,
					(int) (Math.random()*100)+99,
					(int) (Math.random()*100)+99);
		}
		
		int korScoreTotal = 0;
		int engScoreTaoal = 0;
		int matScoreTotal = 0;
		
		System.out.println("최종 성적표");
		System.out.println("---------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("---------------------------------------------------");
		
		for (Student s : st) {
			s.printData();
			korScoreTotal += s.getKorScore();
			engScoreTaoal += s.getEngScore();
			matScoreTotal =+ s.getMatScore();
		}

		System.out.println("---------------------------------------------------");
		System.out.printf("과목 총점\t%d\t%d\t%d\n", korScoreTotal, engScoreTaoal ,matScoreTotal);
		System.out.printf("과목 평균\t%f\t%f\t%f\n", korScoreTotal/10f, engScoreTaoal/10f ,matScoreTotal/10f);
		System.out.println("---------------------------------------------------");
	}
}
