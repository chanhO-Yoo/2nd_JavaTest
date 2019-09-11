package ncs.test7;

import java.util.Arrays;
import java.util.Random;

public class TestSort {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int count = 0;
		Random rnd = new Random();

		for(int i=0;i<arr.length;i++) {
			arr[i]=rnd.nextInt(50)+51;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println("Before = "+Arrays.toString(arr));

		//최소 값을 찾을 인덱스
		int index = 0;
		
		for(int i=0;i<arr.length;i++) {
			int min = Integer.MAX_VALUE;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<min) {
					min = arr[j];
					index = j;
				}
			}
			int temp = arr[i];
//			System.out.println(temp);
			arr[i]=min;
			arr[index]=temp;
		}
		System.out.println("After  = "+Arrays.toString(arr));
	}
}
