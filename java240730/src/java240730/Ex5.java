
package java240730;

import java.util.stream.IntStream;

public class Ex5 {

	public static void main(String[] args) {
//		IntStream ii = IntStream.range(1, 5);// 끝에 5를 포함하지 않음
		IntStream ii = IntStream.rangeClosed(1, 5); // 끝에 5를 포함함
		int count = 7;
	
//		ii.forEach(System.out::println); //이걸 사용하든 아래꺼를 사용해도 같은 것
		ii.forEach(a->{
			System.out.println(a);
		});

	}

}
