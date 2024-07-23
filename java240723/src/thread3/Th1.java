package thread3;

import java.time.LocalTime;

import java240723.DisplayDateTime;

public class Th1 extends DisplayDateTime{

	public void run() {
		for (int i = 0; i < 10; i++){
			LocalTime localtime = LocalTime.now();
			System.out.printf("%d:%d:%d\n",localtime.getHour(), localtime.getMinute(), localtime.getSecond());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}
	

}
