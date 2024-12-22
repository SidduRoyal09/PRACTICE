package com.Loops;

public class forloop50 {

	public static void main(String[] args) {
		int a=18;
		int b=27;
		int gcd=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0 && b%i==0) {
				gcd=i;
				
			}
		}
		System.out.println(gcd);
	}

}
