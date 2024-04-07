package javabasics;

import java.util.Scanner;
public class ScannerClassUsingGlobalVariable 
{
		static int firstno;
		static int secondno;
		 void add() {
			int sum=firstno+secondno;
			System.out.println("Sum:"+sum);		
		}
		
		void sub() {
			int sub=firstno-secondno;
			System.out.println("Sub:"+sub);;
		}
		
		void multi() {
			
			int multi=firstno*secondno;
			System.out.println("multi:"+multi);
		}
		
		void division() {
			
			int division=firstno/secondno;
			System.out.println("division:"+division);
		}
		
		void modulus() {
			int modulus=firstno%secondno;
			System.out.println("modulus:"+modulus);
			
		}
		public static void main(String[] args) {
			ScannerClassUsingGlobalVariable a1=new ScannerClassUsingGlobalVariable();
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter first no");
			firstno=s1.nextInt();
			System.out.println("Enter Second no");
			secondno=s1.nextInt();
			a1.add();
			a1.sub();
			a1.multi();
			a1.division();
			a1.modulus();
			
		}

	}
