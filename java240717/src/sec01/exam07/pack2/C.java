package sec01.exam07.pack2;

import sec01.exam07.pack1.A;

public class C extends A{
	public void method() {
		this.field = "val";
		this.method();
		
//		A a = new A();
	}

}
