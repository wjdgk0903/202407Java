package java240712;

public class Ex3 {

	public static void main(String[] args) {
		int [][] array = {{10, 20}, {30, 40, 35}, {78, 83, 72, 88, 45}};
		
		int sum = 0;
		double avg = 0.0;
		int cnt =0;
		
		for (int i= 0; i <array.length; i++ ) {
			for(int j=0; j < array.length; j++) {
				sum += array[i][j];
				cnt++;
			}
		}
		
//		System.out.println(array.length);
//		System.out.println(array[0].length);
//		System.out.println(array[1].length);
//		System.out.println(array[2].length);
//		for (int i = 0; i < array.length; i++) {
//			for (int j=0; j < array[i].length; j++) {
//				System.out.println(array[i][j]);
//			}
//		}
       System.out.println("sum:" + sum);
       System.out.println("avg:" + avg);
	}

}
