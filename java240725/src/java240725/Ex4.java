package java240725;

public class Ex4 {
	
	public static void method() throws ClassNotFoundException  {
		Class.forName("asdgh.asdas.asdas");
	}

	public static void main(String[] args) {
		try {
			 method();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
