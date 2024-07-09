//정수의 값을 입력받고 입력받은 값이 양의 정수이면 그냥 출력하고 음의 정수이면 양의 정수로 변환하여 출력하세요
package java240709;

import java.util.Scanner;

public class Q6 {
	public static int getNum(String msg, Scanner sc) {
		System.out.print(msg);
	    String input = sc.nextLine();
	    return Integer.parseInt(input);
	}
	
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int num = getNum("정수입력:" , scan);
    	
    	    if (num < 0) {		
    			num = -num;
            }
    	    System.out.println(num);
  }
}
