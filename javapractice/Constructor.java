package javabasics;

public class Constructor {
	
	Constructor()
	{
		System.out.println("Hi, I am constructor");
	}

	public static void main(String[] args) {
		
		System.out.println("Main Method");
		Constructor c1=new Constructor();// creating an object one syntax
		 new Constructor();
	}

}
  