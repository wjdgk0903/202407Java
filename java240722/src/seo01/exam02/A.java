package seo01.exam02;

public class A {
	B field1 = new B();
	C field2 = new C();
	
//	static B field3 = new B();
	static C field4 = new C();
	
	void method() {
		B ver1 = new B();
		C ver2 = new C();
	}
	
	static void method2() {
//		B ver1 = new B();
		C ver2 = new C();
	}
	
	class B {}
	static class C{}
}
