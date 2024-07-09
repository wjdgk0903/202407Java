package java240709;

import java.util.Scanner;

public class Q3 {
	public static int getNum(String msg, Scanner sc) {
		System.out.print(msg);
	    String input = sc.nextLine();
	    return Integer.parseInt(input);
	}
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);


		int x =getNum("숫자 1 입력:", scan);
		int y =getNum("숫자 1 입력:", scan);
		
		if (x > y) {
			System.out.println(x);
		} else if (x < y) {
			System.out.println(y);
		} else {
			System.out.println(0);
		}
	
		
//	System.out.print("a값을입력: ");
//	String input = scan.nextLine();
//	int apples = Integer.parseInt(input);
//	System.out.print("b값을입력: ");
//	input = scan.nextLine();
//	int people = Integer.parseInt(input);
//	int remainder = apples % (people+1); 
//	System.out.println("a");
  }
}