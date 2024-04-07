package javabasics;

public class Example5 {

	void add()
	{
		System.out.println("Addition");
	}
	void add(int a)
	{
		System.out.println(a+6);
	}
	void add(int a, double b)
	{
		System.out.println(a+b);
	}
	
	void add(double a, int b)
	{
		System.out.println(a+b);
	}
	
	static void add(String a, int b, double c)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public static void main(String[] args) {

		add("Kousik",100,6.01);
		Example5 e1=new Example5();
		e1.add(10,0.06);
		e1.add(0.9, 11);
		e1.add();
		e1.add(100  );
	}

}
