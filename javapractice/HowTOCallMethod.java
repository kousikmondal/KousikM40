package javabasics;

public class HowTOCallMethod {

	static void add() {
		System.out.println("Addition");
	}
	
	static void sub() {
		System.out.println("Subtraction");
	}
	
	static void multi() {
		System.out.println("Multiplication");
	}
	
	static void division() {
		System.out.println("division");
	}
	public static void main(String[] args) {
		
		System.out.println("Main Method");
		add();
		sub();
		multi();
		division();

	}

}
