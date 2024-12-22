package com.Patterns;

public class Pattern14 {

	public static void main(String[] args) {
		int a=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		int A=65;
		for(int i=1;i<=4;i++) {
			for(int j=0;j<i;j++) {
				System.out.print((char)A+" ");
				A++;
			}
			System.out.println();
		}
	}

}
