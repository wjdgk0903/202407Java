package java240710;

public class Ex2 {
	
	public static void main(String[] args) {
		// &(양쪽을 보고 값을 냄) &&( 하나만 판별해서 결과를 냄)
		// | ||
		
		String str1 = "가나다"; // new String("가나다");
		String str2 = "가나다";
		boolean result2 = str1 == str2;
		System.out.println(result2);
		
		int num1 = 10;
		int num2 = 10;
		boolean result = num1 == num2;
		System.out.println(result);
		
		int x = 0;
		++x; // x++ 도 가능 ( 피연산자만 아니면 사용가능)
		System.out.println(x);
	}

}
