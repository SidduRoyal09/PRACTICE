package com.Loops;

public class forloop57 {

	public static void main(String[] args) {
		int a=156;
		int b=a;
		int sum=0;
		for(int i=0;a>0;) {
			i=a%10;
			sum+=i;
			a=a/10;
		}
		if(b%sum==0) {
			System.out.println("Harshad Number");
		}else {
			System.out.println("Not a Harshad Number");
		}
	}

}
