package chapter06.exam;

public class Student {
//	 2. Student 클래스를 정의해봅시다.
//	 - 학생이름, 국어점수, 영어점수, 수학점수를 저장하는 변수를 정의 합니다. 
//	 - 변수는 캡슐화를 합니다. getter/setter 메소드를 정의합니다.
//	 - 총점과 평균을 구해 결과를 반환하는 메소드를 정의합니다.
	
		//캡슐화
		private String name;
		private int korScore;
		private int engScore;
		private int matScore;
		
		// 변수 정의
		public Student(String name, int korScore, int engScore, int matScore) {
			this.name = name;
			this.korScore = korScore;
			this.engScore = engScore;
			this.matScore = matScore;
		}
		
		// getter/setter 메소드정의
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getKorScore() {
			return korScore;
		}

		public void setKorScore(int korScore) {
			this.korScore = korScore;
		}

		public int getEngScore() {
			return engScore;
		}

		public void setEngScore(int engScore) {
			this.engScore = engScore;
		}

		public int getMatScore() {
			return matScore;
		}

		public void setMatScore(int matScore) {
			this.matScore = matScore;
		}

		
		// 총점
		public int sum() {
			int result = 0;
			result = korScore + engScore + matScore;
			return result;
		}
		// 평균값(Average)
		public float avg() {
			return sum()/3f;
		}
		// 결과 반환 메소드
		public void printData() {
			System.out.print(
					this.name + "\t" +
					this.korScore + "\t" +
					this.engScore + "\t" +
					this.matScore + "\n" 
//					+sum() + "\t" + 
//					avg() + "\n"
					);
		}
		
		public static void main(String[] args) {
			
			Student s = new Student("AAA",80,92,70);
			
			System.out.println("이름\t국어\t영어\t수학");
			System.out.println("------------------------------");
			s.printData();
			System.out.println("\n3과목 총점 : " + s.sum());
			System.out.println("3과목 평균 : " + s.avg());
		}
}
