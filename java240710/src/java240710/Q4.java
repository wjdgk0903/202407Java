// 1부터 100까지의 짝수의 합계를 구하시오
package java240710;

public class Q4 {

	public static void main(String[] args) {
		int x = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				x = x + i;
			}
		}
		System.out.printf("1부터 100까지의 합:" + x);
	}

}
// 퀴즈 2,3번을 섞어서 활용함 하지만 continue은 여기서 사용하지 않음. 
// 1부터 100까지의 짝수를 i로 출력 출력한 값을 x로 받아서 합을 구하는 방식
// 여기서 x에 값을 받기위에서 초기화를 먼저 하고 시작함 
// i는 1이고 i는 100보다 작거다 같고 i는 하나씩 증가한다.
// i는 2로 나눠서 홀수값을 출력함
// x에서 출력한 i값을 더해서 짝수로 만든 후 짝수만 더해줌
