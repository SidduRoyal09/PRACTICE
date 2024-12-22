package com.Loops;

public class forloop52 {

	public static void main(String[] args) {
		int n=5;
		int a=0;
		int b=1;
		int c=a+b;
		if(n<=1) {
			System.out.println(n);
		}
		System.out.print(a+" "+b+" ");
		for(;c<=n;) {
			System.out.print(c+" ");
			a=b;
			b=c;
			c=a+b;
		}
		
	}

}
