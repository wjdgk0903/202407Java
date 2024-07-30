// intStream을 이용하여 1부터 count까지 합계를 출력하는 코드를 만들어보세요.
package java240730;

import java.util.stream.IntStream;

public class Ex6 {

	public static void main(String[] args) {
		int count = 10;
		int sum = 0;
		
		int sum1 = IntStream.rangeClosed(1, count).sum();
		System.out.println("합계:" + sum1);
	}

}
