package com.Patterns;

public class Pattern2 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=i-1;k++) {
				System.out.print("*"+" ");
			}
			for(int l=1;l<=i;l++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		

		for(int i=1;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=i*2-1;k++) {
				System.out.print(k+" ");
			}
			
			System.out.println();
		}

		System.out.println();
		System.out.println();
		
	
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print("  ");
			}
			int A=65;
			for(int k=1;k<=i*2-1;k++) {
				System.out.print((char)A+" ");
				A++;
			}
			System.out.println();
		}
	}

}
