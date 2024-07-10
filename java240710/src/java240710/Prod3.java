package java240710;

public class Prod3 {
	
	public static void main(String[] args) {
		int in1 = 10;
		int in2 = 20;
		int result = 0; //내가 직접 초기화를 해야함
		
		if (in1 > in2) {
			result  = in1; // or System.out.println(in1);
		} else if (in1 == in2) {
			result = 0; // or System.out.println(0);
		} else {
			result = in2; // or System.out.println(in2);
		}
			
		System.out.println(result);
//		----------------------------------------------------------------------------------------
//		public static void main(String[] args) {
//		    Scanner scan = new Scanner(System.in);
//			int in1 = 10;
//			int in2 = 20;
//			int result = 0; //내가 직접 초기화를 해야함
//			
//			if (in1 > in2) {
//				result  = in1; // or System.out.println(in1);
//			} else if (in1 == in2) {
//				result = 0; // or System.out.println(0);
//			} else {
//				result = in2; // or System.out.println(in2);
//			}
//				
//			System.out.println(result);
//		---------------------------------------------------------------------------------------
//		public static void main(String[] args) {
//		    Scanner scan = new Scanner(System.in);
//		    String str1, str2;
//		    int in1 = 10;
//		    int in2 = 20;
//		    int result = 0; //내가 직접 초기화를 해야함
		
//	        for (;;){
//		        System.out.print("숫자1입력:");
//		        str1 = scan.nextLine();
		
//              System.out.print("숫자2입력:");
//              str2 = scan.nextLine();
		
//          in1 = Integer.parseInt(str1); 	
//		    in2 = Integer.parseInt(str2); 
		
//			if (in1 > in2) {
//				result  = in1; // or System.out.println(in1);
//			} else if (in1 == in2) {
//				result = 0; // or System.out.println(0);
//			} else {
//				result = in2; // or System.out.println(in2);
//			}
//				
//			System.out.println(result);
	}

}
