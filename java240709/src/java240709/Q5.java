//100점의 학점을 입력받아서 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 60점 이상이면 D, 60점 미만이면 F
package java240709;

import java.util.Scanner;

public class Q5 {
	public static int getNum(String msg, Scanner sc) {
		
	    String input = sc.nextLine();
	    return Integer.parseInt(input);
	}
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.print("점수를 입력하세요");
    	int score = getNum("0~100", scan);

//	public static void main(String[] args){
//		
//		int score = 100;
//		int num1 = 90;
//		int num2 = 80;
//		int num3 = 70;
//		int num4 = 60;
//		
		char grade;
		
		if (score > 90) {
			grade = 'A';
		} else if (score > 80) {
			grade = 'B';
		}  else if (score > 70) {
			grade = 'C';
		} else if (score > 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println(grade);
  }
}
  
//public static int getNum(String msg, Scanner sc) {
//System.out.print(msg);
//String input = sc.nextLine();
//return Integer.parseInt(input);
//}
//
//public static void main(String[] args) {
//Scanner scan = new Scanner(System.in);
//
//
//int x =getNum("숫자 1 입력:", scan);
//int y =getNum("숫자 1 입력:", scan);
//
//if (x > y) {
//	System.out.println(x);
//} else if (x < y) {
//	System.out.println(y);
//} else {
//	System.out.println(0);
//}