package com.Practice;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		int a=20,b;
		System.out.println(a++);
		System.out.println(a);
		b=a++;
		System.out.println(b);
		System.out.println(a);
		b=a++ + ++a;
		System.out.println(b);
		a=a++;
		System.out.println(a);
		a=a++ + ++a + a++;
		System.out.println(a);
	}

}

