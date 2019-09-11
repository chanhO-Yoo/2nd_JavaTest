package array;

public class Test4 {
	public static void main(String[] args) {
		//사용할 2차원 정수형 배열
		int[][] array = {{12,41,36,56},{82,10,12,61},{14,16,18,78},{45,26,72,23}};
		//배열의 합계를 저장할 변수
		double sum = 0.0;
		//배열의 평균을 저장할 변수
		double avg = 0.0;
		//평균을 구하기 위한 배열의 총 갯수 구하는 변수
		int count = 0;
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				sum += array[i][j];
				count++;
			}
		}
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+sum/count);
	}
}
