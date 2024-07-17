package p303;

public class Person {
	final String nation = "Korea";
	static final double PI = 3.121592;
	String ssn;
	String name;
	
	public static void main(String[] ar) {
		Person p1 = new Person();
//		p1.nation = "USA";
//		PI = 3.14;
		System.out.println(p1.nation);
	}

}
