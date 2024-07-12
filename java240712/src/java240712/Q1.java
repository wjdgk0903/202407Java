// 2차원 배열을 이용하여 국어점수와 수학점수를 입력받아서 학생별 평균을 출력하는 프로그램을 작성하세요.
// double scores[][] = new double[num][3];
package java240712;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		int sum = 0;
		double avg = 0.0;
		int cnt =0;
	
		Scanner scan = new Scanner(System.in);
		System.out.println("학생수 입력:"); //학생수
		int num = Integer.parseInt(scan.nextLine());
		double scores[][] = new double[num][3];
		
		for (int i=0; i < scores.length; i++) {
		    System.out.println(i+"번째 학생");
		    System.out.print("국어점수:");
		    scores[i][0] = Double.parseDouble(scan.nextLine());
		    System.out.print("수학점수:");
		    scores[i][1] = Double.parseDouble(scan.nextLine());
		    scores[i][2] = ( scores[i][0] +scores[i][1] )/2; // 평균까지의 구할수있는 값
		    
		}
		System.out.printf("\t국어\t수학\t평균\n");
		System.out.printf("=========================================");
		for (int i=0; i < scores.length; i++) {
//			System.out.println(i+"번째 학생");
			System.out.printf("%d번째 학생\t%3.2f\t3.2f\t3.2f\n", i+1, scores[i][0], scores[i][1],scores[i][2]);
//			System.out.println(scores[i][0]+","+scores[i][1]+","+scores[i][2]); //한번 더 for문을 받아서 평균값내기
		}
	}
}


