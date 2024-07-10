package java240710;

import java.security.PublicKey;
import java.util.Scanner;

public class Prod4 {
	
	public static void main(String[] args) {
		int max = 0;
		int a = 10;
		int b = 20;
		int c = 30;
		
		max = a;
		
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		
		System.out.println(max);
//		------------------------------------------------------------------------------------------
////		public static int maxNum(int x, int y, int z) {
//			return 0;
//			
//			int max = x;
//			
//			if (y > max) {
//				max = y;
//			}
//			if (z > max) {
//				max = z;
//			}
//			
//			return max;
//					
//		}	
//		---------------------------------------------------------------------------------
//		public static void main(String[] args) {
//			Scanner scan = new Scanner(System.in);
//			System.out.print("3개의 수를 입력:") ;
//			int max = 0;
//			int a = scan.nextInt();
//			int b = scan.nextInt();
//			int c = scan.nextInt();
//			
//			max = a;
//			
//			if (b > max) {
//				max = b;
//			}
//			if (c > max) {
//				max = c;
//			}
//			
//			System.out.println(maxNum(a, b, c));
//			
		}
	  }


