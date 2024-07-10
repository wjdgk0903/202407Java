// 1부터 100까지의 합을 구하시오
package java240710;

public class Q2 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i=1; i<=100; i++ ) {
			sum += i;
		}
		System.out.printf("1부터 100까지의 합:" + sum);
	}
//	public static void main(String[] args) {
//		int sum = 0;
//		int i=1;
//		while (i<=100) {
//			sum += i;
//			i ++;
//		
//		System.out.printf("1부터 100까지의 합:" + sum);
//	}


}

