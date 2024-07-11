// +,- 기호를 번갈아 출력하는 프로그램을 작성하세요.
package java240711;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n;
	
	System.out.println("+와 -를 번갈아 n개 출력합니다.");
	
	do {
	    System.out.println("n 값:");
	     n = scan.nextInt();
	}while (n <= 0);
	
	
	for ( int i=0; i< n/2; i++) { //n 이 반복 횟수
		System.out.println("+-");
	}
	if (n % 2 != 0) {
		System.out.println("+");
	}
//		if ( i % 2 == 0) { // 짝수
//			System.out.println("+");
//		}
//		else // 홀수
//		   System.out.println("-");
	
	
	}
}
