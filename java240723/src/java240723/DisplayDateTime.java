// 시계도 나오고 띵띵띵도 같이 나오게하기
package java240723;

import java.time.LocalTime;

public class DisplayDateTime {

	public static void main(String[] args) {
		LocalTime localtime = LocalTime.now();
//		System.out.println(localtime.getHour());
//		System.out.println(localtime.getMinute());
//		System.out.println(localtime.getSecond());
		System.out.printf("%d:%d:%d\n",localtime.getHour(), localtime.getMinute(), localtime.getSecond());

	}

	public void run() {
		// TODO Auto-generated method stub
		
	}

}
