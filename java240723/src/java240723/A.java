package java240723;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2( ) {};
	
    static	class B{
		void method( ) {
//			field1 = 10;
//			method1(); // static를 붙이면 이 두가지는 오류가 생김
			
			field2 = 10;
			method2();
		}
	}
	
	public static void main(String[] args) {
		A.B b = new A.B();
//		System.out.println(A.field2);
//		System.out.println(field1); 객체생성을 해야지 가능
//		A a = new A();
//		System.out.println(a.field1);
//		A.B b = a.new B();
//		b.method();
//		System.out.println(field2); static에 생성이되어있어서 가능
		
	}
	

}
