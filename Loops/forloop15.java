package com.Loops;

public class forloop15 {

	public static void main(String[] args) {
		int a=6404;
		int b=0;
		for(int t=0;a>0;) {
			t=a%10;
			a=a/10;
			b=b*10+t;
		}
		System.out.println(b);
	}

}
