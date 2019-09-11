package array;

public class Test3 {
	public static void main(String[] args) {
		//사용할 정수형 배열 데이터
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		//홀수의 합을 더할 변수
		double sum=0;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
				continue;
			}
			else {
				sum += array[i];
				System.out.println(array[i]);
			}
		}
		System.out.println("합계 : "+sum);
	}
}
