package com.Patterns;

public class Pattern11 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i-1;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=n*2-i*2+1;k++) {
				if(i==1 || k==1 || k==n*2-i*2+1 ){
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
			for(int j=0;j<i-1;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=n*2-i*2+1;k++) {
				if(i==1 || k==1 || k==n*2-i*2+1 ){
					System.out.print(k+" ");
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
			for(int j=0;j<i-1;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=n*2-i*2+1;k++) {
				if(i==1 || k==1 || k==n*2-i*2+1 ){
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
