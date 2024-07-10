//구구단 출력하기
package java240710;

public class Q5 {
	public static void main(String[] args) {
		for (int j=1; j < 10; j++) {
		   for (int i=2; i < 10; i++) {
			   
				System.out.printf("%d X %d = %d\t", i, j, i*j);
			}
		   System.out.println();
		}
		
	}
}