package thread;

public class Ex {

	public static void main(String[] args) {
		Thread thread = new Thread(new Th1());
		thread.start();
//		for (int i = 0; i < 5; i++){
//		    System.out.println("삐");
//		}
	
	    for (int i = 0; i < 5; i++){
	        System.out.println("띵");
	        try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
  }
	
}
