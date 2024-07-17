package p229;

public class ClassName {
	int field1; // 객체가 생성이 되야 호출이 가능
	void method1() {
		ClassName.field2 = 200;
		this.field1 = 300;
	}
		
	static int field2; // ClassName 소속이라서 메모리에 바로 등록이 됨
	static void method2() {
		field2 = 100;
	}
	
	public static void main(String...ar) {
		method2(); // ClassName.method2 가 원래 이름
		System.out.println(ClassName.field2);
		ClassName c1 = new ClassName();
		c1.method1();
		System.out.println(c1.field1);
	}
	

}
