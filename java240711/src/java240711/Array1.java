package java240711;

public class Array1 {
	
	public static void main(String[] args) {
		int scores[] = {83, 90, 87};
		double sum = 0.0;
		double avg; // avg는 무조건 double
//		int sum = 0;
		// 스코어의 총점을 출력하세요.
		for (int i=0; i < scores.length; i++) { // 
			sum += scores[i];
		}
		System.out.println("총계:"+ sum);
		double avg1 = (double) sum / 3;
		System.out.println("평균:"+ avg1);
		//평균
		
		
		int[] myArr = new int[5]; // 배열 생성(초기화)
		
		for (int i=0; i<5; i++) {
			System.out.println(myArr[i]);
		}
		
		double myArr2[] = new double[5];
		
		for (int  i=0; i<5; i++) {
			System.out.println(myArr2[i]);
		}
		
		double myArr3[] = new double[5];
		
		for (int  i=0; i<5; i++) {
			System.out.println(myArr3[i]);
		}
	}
}
