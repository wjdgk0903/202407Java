package java240725;

class MyClass2{
	void method() throws MyException {
		throw new MyException2("나의 예외!!"); //예외 발생
	}
}

public class MyExceptionEx2 {
	
	public static void main(String[] args) {
		MyClass2 mc = new MyClass2();	   	
	}

}
