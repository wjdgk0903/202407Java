// 1부터 n까지의 합과 그 값을 구하는과정을 구하는 출력하는 프로그램을 작성하세요. 
//예 n값 : 5
// 1 + 2 + 3 + 4 + 5 =15
package java240711;

import java.util.Scanner;

public class Q4 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		
		System.out.println("1부터 n까지의 합을 구합니다");
		
		do {
		    System.out.println("n 값:");
		     n = scan.nextInt();
		}while (n <= 0);
		
		int sum = 0;
		
		for ( int i=1; i<= n; i++) {
			if ( i < n) {
				System.out.println(i + "+");
				sum += i;
			}
			
			System.out.println(n + "=");
			sum += n;
			System.out.println(sum);
		}
		
//		for (int i = 1; i <= n; i++) {
//			if (i < n) {
//				System.out.printf(i + "+");
//			} else {
//				System.out.println(i + "=");
//			}
//			sum += i;
//		}
//		System.out.println(sum);

	}
}
