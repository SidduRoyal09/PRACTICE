package com.Loops;

public class forloop16 {

	public static void main(String[] args) {
		int n=464034;
		int sum=0;
		for(int t=0;n>0;) {
			t=n%10;
			sum=sum+t;
			n=n/10;
		}
		System.out.println(sum);
	}
	
}
