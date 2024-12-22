package com.Loops;

public class forloop48 {

	public static void main(String[] args) {
		int a=121;
		int b=a;
		int c=0;
		for(int t=0;a>0;) {
			t=a%10;
			c=c*10+t;
			a=a/10;
		}
		if(c==b) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}

}
