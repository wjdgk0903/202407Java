// 사과가 10거 았숩나더. 2명의 친구가 있습니다(본인을 포함하면 총 3명 사과를 똑같이 나눠먹으면 몇 게의 사과가 남을까요?(scanner 사용)
package java240709;

import java.util.Scanner;

public class Q2 {
	public static int getCount(String msg, Scanner sc) {
		System.out.print(msg);
	    String input = sc.nextLine();
	    return Integer.parseInt(input);
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//자주사용하는 것 
		
		int apple = getCount("사과의 개수를 입력: ", scan);
//		System.out.print("사과의 개수를 입력: ");
//		String input = scan.nextLine();
//		int apples = Integer.parseInt(input);
		
		int people = getCount("친구의 수를 입력: ", scan);
//		System.out.print("친구의 수를 입력: ");
//		input = scan.nextLine();
//		int people = Integer.parseInt(input);
		
		int remainder = apple % (people+1); 
		System.out.printf("나머지 사과의 개수:%d\n", remainder );

    }
}



//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("사과의 개수를 입력: ");
//		String input = scan.nextLine();
//		int apples = Integer.parseInt(input);
//		System.out.print("친구의 수를 입력: ");
//		input = scan.nextLine();
//		int people = Integer.parseInt(input);
//		int remainder = apples % (people+1); 
//		System.out.println("나머지 사과의 개수:%d\n " );
//
//    }
//}
