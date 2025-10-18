package ch05.sec07;

public class MultidimensionalArrayByNewExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 각 반의 학생 수가 3명으로 동일함 경우 점수 저장을 위한 2차원 배열 생성
		int [][] mathScores = new int[2][3];
		// 배열 항목 조기값 줄러
		for (int i = 0; i < mathScores.length; i++) {
			for (int k = 0; k < mathScores[i].length; k++) {
				System.out.println("mathscores[" + i + "][" + k + "]: "+ mathScores[i][k]);
			}
		}
		System.out.println();
		// 배열 항목 값 변경
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;
		// 전체 학생의 수학 평균 구하기
		int totalStudent = 0;
		int totalMathSum = 0;
		for (int i = 0; i < mathScores. length; i++) {
			totalStudent += mathScores[i].length;
			for (int k= 0; k < mathScores[i].length; k++) {
				totalMathSum += mathScores [i][k];
			}
		}
		double totalMathAvg = (double) totalMathSum / totalStudent;
		System.out.println("전체 학생의 수학 평균 점수: "+ totalMathAvg);
		System.out.println();
		
		// 각 반의 학생 수가 다음 경우 점수 저장을 위한 2차원 배열 생성
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores [1] = new int[3];
		// 배열 항목 조기값 풀럭
		for (int i = 0; i < englishScores. length; i++) {
			for (int k= 0; k<englishScores[2].length; k++) { 
				
			System.out.println("englishScores[" + i + "][" + k + "]:" + englishScores [1][k]);
			}
		}
		System.out.println();
		// 배열 항목 값 변경
		englishScores[0][0] = 90;
		englishScores[0][1] = 91;
		englishScores[1][0] = 92;
		englishScores[1][1] = 93;
		englishScores[1][2] = 94;
		// 전체 학생의 영어 평균 구하기
		totalStudent = 0;
		int totalEnglishSum = 0;
		for (int i = 0; i < englishScores. length; i++) {
			totalStudent += englishScores[i].length;
			for (int k= 0; k< englishScores[i].length; k++) {
				totalEnglishSum += englishScores [i][k];
			}
		}
		double totalEnglishAvg = (double) totalEnglishSum / totalStudent;
		System.out.println("전체 학생의 영어 평근 점수:"+ totalEnglishAvg);
	}

}
