// 정수 a,b를 포함하여 그사의 모든 정수의 합을 구하여 반환하는 메서드를 작성하시오 예) sumOf(4,3)
package java240711;

import java.util.Scanner;

public class Q3 {
	
	public static int sumOf(int a, int b) {
	  int min; //a, b의 작은쪽의 값
	  int max; // a, b 의 큰 쪽의 값
	  
	  if (a < b) {
		  min = a; max = b;
	  }else {
		  min = b; max = a;
	  }
	  int sum =0;
		for (int i=a; i <= b; i++) {
			sum += i;
		   }
		   return sum;
	}
}

//	public static int sumOf(int a, int b) {
//		int sum =0;
//		for (int i=a; i <= b; i++) {
//			sum += i;
//		   }
//		   return sum;
//		}

////	public static int med(int a, int b, int c) {
//		Scanner stdIn = new Scanner(System.in);
//		
//		System.out.println("a와 b를 포함하여 그 사이에 있는 모든정수의 총합을 구합니다.");
//		System.out.println("a 값:");
//		int a1 = stdIn.nextInt();
//		System.out.println("b 값:");
//		int b2 = stdIn.nextInt();
//		System.out.println("정수 a,b 사이의 모든정수의 총합은" + sumOf(a1,b) + "입니다.");
	
