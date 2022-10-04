package chapter06.exam;
/* 
 * 1. 국어, 영어, 수학 점수 10개씩을 저장하는 배열을 정의하고 점수를 모두 출력하고, 평균 점수를 출력하는 프로그램을 작성해봅시다.
 * -----------------------------------------------
 * 2. Student 클래스를 정의해봅시다.
 * - 학생이름, 국어점수, 영어점수, 수학점수를 저장하는 변수를 정의 합니다. 
 * - 변수는 캡슐화를 합니다. getter/setter 메소드를 정의합니다.
 * - 총점과 평균을 구해 결과를 반환하는 메소드를 정의합니다.
 * -----------------------------------------------
 * 3. main()메소드에 아래 내용을 정의해봅시다.
 * - Student 타입의 배열을 선언하고, 요소 10개를 저장할 수 있는 배열 인스턴스를 생성해 봅시다. 
 * - Student 타입의 인스턴스를 생성하고 배열에 저장하는 코드를 정의해봅시다.
 * - 배열에 저장된 Student 타입의 인스턴스의 메소드를 이용해서 모든 데이터를 출력해봅시다.
 */

public class Scores {

	public static void main(String[] args) {
		
		// 국어, 영어, 수학 점수 10개씩을 저장하는 배열을 정의하고 점수를 모두 출력하고, 
		// 평균 점수를 출력하는 프로그램을 작성해봅시다.
		
		int[][] scores = new int [10][3];
		
		for(int i=0; i<scores[i].length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				int num = (int)(Math.random()*51) + 50;
				scores[i][j] = num;
			}
		}
		
		System.out.println("국영수 성적");
		System.out.println("----------------------------------");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------");
		
		int korScores = 0;
		int engScores = 0;
		int matScores = 0;
		
		for(int i=0; i<scores.length; i++) {
			int sum = 0;
			for(int j=0; j<scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
				sum += scores[i][j];
				
				if(j==0) {
					korScores += scores[i][j];
				}
				if(j==1) {
					engScores += scores[i][j];
				}
				if(j==2) {
					matScores += scores[i][j];
				}
				
			}
			
		System.out.print(sum + "\t" + (float)sum/scores[i].length);
			
		System.out.println();
		
		}
		
		System.out.println("----------------------------------");
		System.out.print(korScores + "\t" + engScores + "\t" + matScores + "\t = 과목별 총점" );
		System.out.println();
		System.out.print(
						(float)korScores/scores.length + "\t" 
						+ (float)engScores/scores.length + "\t"
						+ (float)matScores/scores.length + "\t = 과목별 평균"
						);
	}
	
	
	
	
}
