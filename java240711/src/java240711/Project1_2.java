package java240711;

import java.util.Scanner;

public class Project1_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		while (run)
		{
			System.out.println("-----------------");
			System.out.println("1.로그인 | 2.회원가입 | 3.잔고 | 4.종료");
			System.out.println("-----------------");
			System.out.println("선택>");
			int login = Integer.parseInt(scan.nextLine());
			switch (login) {
//			case 1: 
//				System.out.println("1");
//				break;	
//			case 2: 
//				System.out.println("2");
//							
//			case 3: 
//				System.out.println("3");
//				break;				
//			case 4: 
//		    	System.out.println("4");
//				break;
		case 2:
			System.out.printf("[필수 정보 입력]");
			String c = scan.nextLine();
	        System.out.printf("1.이름");
		    String name = scan.nextLine();
	
		    System.out.printf("2. 주민번호 앞 6자리");
		    String number = scan.nextLine();
		    
		    System.out.printf("3. 전화번호");
		    String poneNumber = scan.nextLine();

		    
		   
		}
			
		
	}
		}

}
