//3개의 정수 값을 입력받아 중앙값을 구하고 출력하세요.
package java240711;

import java.util.Scanner;


public class Q1 {
	public static int med(int a, int b, int c) {
		if ((b >= a && c <= a) || (b <= a && c >= a)) {
			return a;
	 } else if ((a > b && c < b) || (a < b && c > b)) {
		 return b;
	 } 
	 return c;
	 }	
//		if (a >= b); {
//			if (b >= c ) {
//				return b;
//			} else if (a <= c) {
//				return a;
//			} else {
//				return c;
//			} 
//			
//		}else if (a > c) { // a는 b보다 작다
//			return a;
//		} else if (b > c) { // a는 b보다 작다
//			return c;
//		} else { // a는 b보다 작다, a는 c보다 작거나 같다, b는 c보다 작거나 같다.
//			return b;
//		}

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("세 정수의 중앙값을 구합니다.");
		System.out.println("a 값:");
		int a = scan.nextInt();
		System.out.println("b 값:");
		int b = scan.nextInt();
		System.out.println("c 값:");
		int c = scan.nextInt();
		
//		System.out.println("중앙값은" + );
		
		//아래 로직을 메소드로 만들어보기
//		if (a >= b); {
//			if (b >= c ) {
//				System.out.println(b);
//			} else if (a <= c) {
//				System.out.println(a);
//			} else {
//				System.out.println(c);
//			}
//		} else if (a > c) { // a는 b보다 작다
//			System.out.println(a);
//		} else if (b > c) { // a는 b보다 작다
//			System.out.println(c);
//		} else { // a는 b보다 작다, a는 c보다 작거나 같다, b는 c보다 작거나 같다.
//			System.out.println(b);
//		}
	}
}
			
	


