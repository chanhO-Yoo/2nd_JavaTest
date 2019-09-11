package array;

public class Test5 {
	public static void main(String[] args) {
		//사용할 2차원 배열 데이터
		int [][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}};
		//가장 큰 값을 저장할 변수
		int maxArray=Integer.MIN_VALUE;
		//가장 작은 값을 저장할 변수
		int minArray=Integer.MAX_VALUE;
		
		//배열의 모든 데이터와 값 비교를 통해 최대값/최소값 찾기
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				if(maxArray<=array[i][j]) {
					maxArray = array[i][j];
				}
				if(minArray>=array[i][j]) {
					minArray = array[i][j];
				}
			}
		}
		
		System.out.println("가장 큰 값 : "+maxArray);
		System.out.println("가장 작은 값 : "+minArray);
	}

}
