package java240725;

class MyClass{
	void method() throws MyException {
		throw new MyException("나의 예외!!"); //예외 발생
	}
}

public class MyExceptionEx1 {
	
	public MyExceptionEx1(String msg) {
		MyClass mc = new MyClass();	
		try {
			  mc.method();	
		}catch (MyException e) {
			e.printStackTrace();
		}
	   	
	}

}
