package com.Patterns;

public class Pattern10 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=i*2-1;k++) {
				if(i==n || k==1 || k==i*2-1) {
				System.out.print("* ");
				}else {
					System.out.print("  ");
				}
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
				if(i==n || k==1 || k==i*2-1) {
				System.out.print(k+" ");}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		for(int i=1;i<=n;i++) {
			int A=65;
			for(int j=0;j<n-i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=i*2-1;k++) {
				
				if(i==n || k==1 || k==i*2-1) {
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
