package com.Patterns;

public class Pattern9 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || i==n || j==1 || j==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || j==1 || i==n || j==n ) {
					System.out.print(j+" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		
		for(int i=1;i<=n;i++) {
			int A=65;
			for(int j=1;j<=n;j++) {
				if(i==1 || i==n || j==1 ||j==n) {
					System.out.print((char)A+" ");
				}else {
					System.out.print("  ");
				}
				A++;
			}
			System.out.println();
		}
	}

}
