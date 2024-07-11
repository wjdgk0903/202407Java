// for문으ㅗ 1부터 n까지의 합을구하기송 (n은 입력받은 정수)System
package java240711;

import java.util.Scanner;

public class Q2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다");
		System.out.println("n 값:");
		int n = scan.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			 sum += i;
			System.out.println("1부터 " + n + "까지의 합은" + sum + "입니다");
		}
		
//		public static void main(String[] args) {
//			Scanner scan = new Scanner(System.in);
//			int n;
//			System.out.println("1부터 n까지의 합을 구합니다");
//			do {
//			    System.out.println("n 값:");
//			     n = scan.nextInt();
//			}while (n <= 0);
//			
//			int sum = 0;
//			
//			for (int i = 1; i <= n; i++) {
//				 sum += i;
//				 
//				System.out.println("1부터 " + n + "까지의 합은" + sum + "입니다.");
//			}
//			
//		}

		
	}

}
