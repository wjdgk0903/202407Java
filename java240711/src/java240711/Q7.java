// 2자리 양수를 입력받는 프로그램을 작성하세요
package java240711;

import java.util.Scanner;

public class Q7 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int no;
		
		System.out.println("2자리 양수를 입력받는 프로그램을 작성하세요");
		
		do {
		    System.out.println("no값:");
		     no = scan.nextInt();
		}while (no< 10 || no > 99);
		
			
			System.out.println("변수 no값은" + no + "이(가) 되었습니다.");
		}
	
	 }	
  