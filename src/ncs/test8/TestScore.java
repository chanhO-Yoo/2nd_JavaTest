package ncs.test8;

import java.util.Scanner;

public class TestScore {
	public static void main(String[] args) {
		double[][] score = new double[3][5];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생1의 과목1 성적을 입력하세요 : ");
		score[0][0] = sc.nextDouble();
		System.out.print("학생1의 과목2 성적을 입력하세요 : ");
		score[0][1] = sc.nextDouble();
		System.out.print("학생1의 과목3 성적을 입력하세요 : ");
		score[0][2] = sc.nextDouble();
		score[0][3] = score[0][0]+score[0][1]+score[0][2];
		score[0][4] = score[0][3] / 3;
		
		
		System.out.print("학생2의 과목1 성적을 입력하세요 : ");
		score[1][0] = sc.nextDouble();
		System.out.print("학생2의 과목2 성적을 입력하세요 : ");
		score[1][1] = sc.nextDouble();
		System.out.print("학생2의 과목3 성적을 입력하세요 : ");
		score[1][2] = sc.nextDouble();
		score[1][3] = score[1][0]+score[1][1]+score[1][2];
		score[1][4] = score[1][3] / 3;
		
		System.out.print("학생3의 과목1 성적을 입력하세요 : ");
		score[2][0] = sc.nextDouble();
		System.out.print("학생3의 과목2 성적을 입력하세요 : ");
		score[2][1] = sc.nextDouble();
		System.out.print("학생3의 과목3 성적을 입력하세요 : ");
		score[2][2] = sc.nextDouble();
		score[2][3] = score[2][0]+score[2][1]+score[2][2];
		score[2][4] = score[2][3] / 3;

		System.out.println("index\t과목1\t과목2\t과목3\t총점\t평균");
		for(int i=0;i<score.length;i++) {
			System.out.print(i+"\t");
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.print("\n");
		}
		
	}
}
