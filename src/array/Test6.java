package array;

import java.util.Arrays;

public class Test6 {
	public static void main(String[] args) {
		//사용할 2차원 배열 데이터
		int [][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}};
		//배열의 갯수를 확인할 변수
		int countArr=0;
		//새로 만든 배열의 인덱스를 표시할 변수
		int count=0;
		//출력에 쓰일 문자열
		String str="";
		
		//반복문을 통해 배열의 전체 갯수 확인
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				countArr++;
			}
		}

		int[] copyAr = new int[countArr];
		
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				if(array[i][j]%3==0) {
					copyAr[count]=array[i][j];
					for(int k=0;k<count;k++) {
						if(copyAr[k]==array[i][j]) {
							count--;
						}
					}
					count++;
				}
			}
		}
		for(int i=0;i<count;i++) {
			str += copyAr[i]+" ";
		}
		
		System.out.println("copyAr : "+str);
	}
		
}
