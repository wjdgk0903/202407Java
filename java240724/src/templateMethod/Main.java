package templateMethod;

public class Main {

	public static void main(String[] args) {
		AbstractDisplay d1 = new CharDisplay('H');
		d1.display();
		
		AbstractDisplay d2 = new StringDisplay("Hello");
		d2.display();
		
		AbstractDisplay d3 = new StringDisplay("안녕");
		d3.display();
	}

}
