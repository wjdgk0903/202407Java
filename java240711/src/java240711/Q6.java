// *를 n개 출력하되 W개마다 줄을 바꿔서 출력하는 프로그램을 작성하세요.
package java240711;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n,w;
		
		System.out.println("*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.");
		
		do {
		    System.out.println("n값:");
		     n = scan.nextInt();
		}while (n <= 0);
		
		do {
		    System.out.println("w값:");
		     w = scan.nextInt();
		}while (w <= 0 || w > n);
		
		for (int i = 0; i < n; i++) {
			System.out.println("*");
			if(i % w == w-1) {
				System.out.println(); // 줄바꿈
		}
	
	 }	
   }
}



