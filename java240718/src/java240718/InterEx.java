package java240718;

public class InterEx {

	public static void main(String[] args) {
		ImplC implC = new ImplC();
		
		InterA ia = implC;
		ia.methodA();
		
		InterB ib = implC;
		ib.methodB();

}
}
