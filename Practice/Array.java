package com.Practice;

public class Array {

	public static void main(String[] args) {
		int i[];
		i=new int[10];
		i[3]=3;
		char c[];
		c=new char[10];
		c[2]='s';
		boolean b[];
		b=new boolean[20];
		b[11]=true;
		String s[];
		s=new String[10];
		s[4]="siddu";
		float f[]=new float[10];
		f[3]=3211.4640f;
		double d[]=new double[10];
		d[9]=4640;
		System.out.println(i[3]+"\n"+i[6]);
		System.out.println(c[2]+"\n"+c[4]);
		System.out.println(b[3]+"\n"+b[11]);
		System.out.println(s[4]+"\n"+s[6]);
		System.out.println(f[3]+"\n"+f[6]);
		System.out.println(d[5]+"\n"+d[9]);
		System.out.println(i);
	}

}
