package javabasics;

public class Example4 {
	void add() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	void sub() {
		int a=10;
		int b=20;
		int c=b-a;
		System.out.println(c);
	}
	
	void multi() {
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
	}
	
	void division() {
		int a=10;
		int b=20;
		int c=b/a;
		System.out.println(c);
	}
	public static void main(String[] args) {
		
		Example4 m1=new Example4();

		m1.add();
		m1.sub();
		m1.multi();
		m1.division();
		
	}

}
