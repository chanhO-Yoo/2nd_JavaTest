package ncs.test9;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		Calculate c = new Calculate();
		Scanner sc = new Scanner(System.in);
		int input_1st=0;
		int input_2nd=0;
		
		System.out.print("정수를 입력하세요 : ");
		input_1st = sc.nextInt();
		if(input_1st<0 || input_1st>10) {
			System.out.println("잘못된 입력입니다.");
		}
			
		System.out.print("정수를 입력하세요 : ");
		input_2nd = sc.nextInt();
		if(input_2nd<0 || input_2nd>10) {
			System.out.println("잘못된 입력입니다.");
		}
		
		System.out.println("합 : "+c.sum(input_1st, input_2nd));
		System.out.println("차 : "+c.substract(input_1st, input_2nd));
		System.out.println("곱 : "+c.multiply(input_1st, input_2nd));
		System.out.println("나누기 : "+c.divide(input_1st, input_2nd));
	}

}
