package ncs.test1;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		//입력받을 문자열
		String inputStr="";
		//입력받은 문자열을 스플릿해 넣을 배열
		String[] inputArr;
		//나눈 문자열을 정수로 변환해 넣을 배열
		int[] score;
		//각 부서별 점수가 저장될 int형 변수
		int score_A=0;
		int score_B=0;
		int score_C=0;
		int score_D=0;
		int score_E=0;
		//평가 받을 점수를 저장하는 int형 변수
		double grade=0;
		//평가받은 클래스를 출력할 변수
		String grade_class="";
		
		//5개의 부서별 점수를 입력받아 inputStr에 저장
		System.out.print("점수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		inputStr = sc.nextLine();
		
		//입력받은 점수를 공백을 기준으로 나누어 배열에 저장
		inputArr = inputStr.split(" ");
		//나눈 문자열의 갯수만큼 점수배열 초기화
		score = new int[inputArr.length];
		//입력받은 점수가 5개가 아닐경우 메시지 출력
		if(inputArr.length!=5) {
			System.out.println("다시 입력하세요.");
			return;
		}
		else {
			for(int i=0;i<inputArr.length;i++) {
				score[i]= Integer.parseInt(inputArr[i]);
				if(score[i]>=10 && score[i]<=99) {
//					System.out.println(score[i]);
				}
				else {
					System.out.println("다시 입력하세요.");
					return;
				}
			}
			score_A = score[0];//100
			score_B = score[1];//90
			score_C = score[2];//80
			score_D = score[3];//70
			score_E = score[4];//60
			
		}
		
		//각 비율에 따른 평가점수 계산
		grade = ((score_A+score_B)/2)*0.6+((score_C+score_D)/2)*0.2+score_E*0.2;
		
		//점수의 기준에 따른 클래스 구분
		switch((int)(grade/10)) {
		case 10:
		case 9:
			grade_class = "Gold Class";
			break;
		case 8:
			grade_class = "Silver Class";
			break;
		case 7:
			grade_class = "Bronze Class";
			break;
		default:
			grade_class = "Normal Class";
			break;
		}
		
		System.out.println("평가점수 : "+grade);
		System.out.println("Class : "+grade_class);
	}

}
