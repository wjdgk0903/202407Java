package java240725;

class Parent {
	int x;
	void method() {
		System.out.println(x);
	}
}

public class Ex1 {

	public static void main(String[] args) {
		Parent parent = new Parent() {
			
			void method2() {
				
			}

			@Override
			void method() {
				x=100;
				System.out.println("나는 익명 자식 객체!");
				super.method();
			}
			
		};
		parent.method();
		

	}

}
