package com.Loops;

public class forloop45 {

	public static void main(String[] args) {
		int a=1545;
		for(;a%2==0 && a>0;) {
				System.out.println("2 ");
				a=a/2;
			}
		for(int i=3;i*i<=a;i+=2) {
			for(;a%i==0;) {
				System.out.println(i+" ");
				a=a/i;
			}
		}
	
		if(a>2) {
			System.out.println(a);
		
		}
	}

}
