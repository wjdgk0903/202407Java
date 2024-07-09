package java240708;

import java.util.Scanner;

public class ScannerExample2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print(">>");
		String str = scan.nextLine();
		
		System.out.println(str);
	}

}
