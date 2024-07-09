//3개의 정수값을 받아서 최대값을 구하여 출력하여보세요.
package java240709;

import java.util.Scanner;

public class Q4 {
	public static int getNum(String msg, Scanner sc) {
		System.out.print(msg);
	    String input = sc.nextLine();
	    return Integer.parseInt(input);
	}
	
	public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);


		int num1 =getNum("숫자 1 입력:", scan);
		int num2 =getNum("숫자 2 입력:", scan);
		int num3 =getNum("숫자 3 입력:", scan);
		
		int max = Math.getNum(num1, num2, num3);
		
//		if (num2 > num3) {
//			System.out.println(x);
//		} else if (num3 < num1) {
//			System.out.println(y);
//		} else {
//			System.out.println(0);
//		}
//		
		System.out.println(max);
		
//		if () {
//			System.out.println(num1);
//		} else if (x  y) {
//			System.out.println(y);
//		} else if {
//			System.out.println(0);
//		} else {
//			System.out.println(0);
//		}
	  }
	}
