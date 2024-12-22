package com.Patterns;

public class Pattern15 {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			int number=1;
			for(int k=0;k<=i;k++)
			{
				System.out.print(number+" ");
				number=number*(i-k)/(k+1);
			}
			System.out.println();
		}
	}

}
