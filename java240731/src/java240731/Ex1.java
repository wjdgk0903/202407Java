package java240731;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class Ex1 {
	static int sum =0;
	public static void main(String[] args) {
//		IntConsumer x = a->{System.out.println(a);};
		
		IntStream.rangeClosed(1, 5).forEach(a -> {
			sum += a;
//			System.out.println(a);
		
		
//		IntStream.rangeClosed(1, 5).forEach(new IntConsumer() {
//			
//			@Override
//			public void accept(int value) {
//				System.out.println(value);
//				
//			}
//		});
		});
		System.out.println(sum);
	}

}
