package com.Practice;

public class EqualityOp {

	public static void main(String[] args) {
		
		byte b=10;
		
		b=(byte)(b+1);
		System.out.println(b);
		b+=10;
		System.out.println(b);
		b++;
		System.out.println(b);
		int a=10;
		System.out.println(a==10);
		System.out.println(10.0==a);
		System.out.println(10.1==10.2);
		System.out.println('a'==10);
		System.out.println('a'=='A');
		//System.out.println(true==true);//error
		
	}

}
