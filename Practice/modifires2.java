package com.Practice;


class Parent{
//	private void a() {
//		System.out.println("parent");
//	}
}
public class modifires2 extends Parent{
	private void a() {
		System.out.println("child");
	}

	public static void main(String[] args) {
		modifires2 c=new modifires2();
//		Parent p=new modifires2();
//		p.c();
		c.a();
	}
}