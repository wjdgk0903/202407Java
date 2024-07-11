package java240711;

import java.util.Scanner;

public class Project1_1 {
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
//			switch (login) {
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
			
	        System.out.printf("아이디");
		    String name = scan.nextLine();
	
		    System.out.printf("패스워드");
		    String strPassword = scan.nextLine();
		    int password = Integer.parseInt(strPassword);
		    
		    if(name.equals("java")) {
			  if(password == 12345) {
				 System.out.println("로그인성공");
		    	} else {
				   System.out.println("로그인 실패: 패스워드가 틀림");
			}
		}
			
		
	}
		}

}
