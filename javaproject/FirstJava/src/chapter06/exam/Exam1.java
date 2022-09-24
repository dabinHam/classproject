package chapter06.exam;

public class Exam1 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수 10개씩을 저장하는 배열을 정의하고 
		// 점수를 모두 출력하고, 
		// 평균 점수를 출력하는 프로그램을 작성해봅시다.
		
		int[][] scores = new int[10][3];
		
		for(int i=0; i<scores.length ; i++) {
			for(int j=0; j<scores[i].length;j++) {
				//System.out.print(scores[i][j]); //출력목적
				int num =(int)(Math.random()*51) + 50; // 0+50 <= num <=50+50 // 최저 50점~100점 까지 나올 수 있
				scores[i][j] = num;
			}
		}
		
		System.out.println("성적표");
		System.out.println("----------------------------------------");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------");
		
		int korTotal = 0;
		int engTotal = 0;
		int matTotal = 0;

		for(int i=0; i<scores.length ; i++) {
			
			int sum = 0;
			
			for(int j=0; j<scores[i].length;j++) {
				System.out.print(scores[i][j] + "\t"); 
				sum += scores[i][j];
				
				// 영어 점수 일 때
				if(j==0) {
					korTotal += scores[i][j];
				}
				// 국어 점수 일 때
				if(j==1) {
					engTotal += scores[i][j];
					}
				// 수학 점수 일 때
				if(j==2) {
					matTotal += scores[i][j];
					}
				
				
			}
			
			// 총점 구하기
			//System.out.print(sum); // print로 해야함 옆으로 이어 붙히기 위해
			// 총점 + 평균 구하기
			System.out.print(sum + "\t" +  (float)sum/scores[i].length); 
			
			
			System.out.println();
		}
		
		System.out.println("----------------------------------------");
		 // 국 영 수 과목별 총점
		System.out.print(korTotal + "\t" + engTotal + "\t" + matTotal + "\t");
		System.out.println();
		 // 국 영 수 과목별 평균
		System.out.print((float)korTotal/scores.length + "\t" + (float)engTotal/scores.length + "\t" + (float)matTotal/scores.length );
	}

}