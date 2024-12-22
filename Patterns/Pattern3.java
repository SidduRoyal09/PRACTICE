package com.Patterns;

public class Pattern3 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=n-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		for(int i=1;i<=n;i++) {
			int A=65;
			for(int j=1;j<=n-i+1;j++) {
				System.out.print((char)A+" ");
				A++;
			}
			System.out.println();
		}
	}

}
