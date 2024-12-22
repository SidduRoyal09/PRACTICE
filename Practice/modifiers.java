package com.Practice;

public class modifiers{
	int a=10;
	protected int c=40;
	private int b=20;
	void b() {
		System.out.println(b);
	}
	public static void main(String[] args) {
		
//		new modifiers();
//		System.out.println(obj2.a);
//		System.out.println(obj2.c);
//		System.out.println(b);
		B odj=new B();
		odj.met();
	}
}
class B extends modifiers{
	void met() {
		System.out.println(a);
	}
}
