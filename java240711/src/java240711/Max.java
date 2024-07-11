package java240711;

public class Max {
	public static void main(String[] args) {
		int a[] = {1, 3, 10, 2, 8};
		int max = a[a.length-1];
		// 최대값 구하기
		for(int i=1; i<a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		// 최대값을 출력
		System.out.println("최대값:" + max);
	}

}
