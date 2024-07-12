package java240712;

import java.util.Random;

public class Ex2 {
	
	public static void main(String[] args) {
		Random rd = new Random();
		for (int i = 0; i < 10; i++) {
//			System.out.println(rd.nextInt(10)); // 10을 적으면 0~9까지만 나옴
//			System.out.println(rd.nextInt(10)+1); // 1~10로 나옴
			System.out.println(rd.nextInt(45)+1); // 1 ~ 45
		}
	}

}
