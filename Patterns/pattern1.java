
//
//	 	    *    |            1    |            A
//	      * *    |          1 2    |          A B
//	    * * *    |        1 2 3    |        A B C
//	  * * * *    |      1 2 3 4    |      A B C D
//	* * * * *    |    1 2 3 4 5    |    A B C D E



package com.Patterns;

public class pattern1 {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		for(int i=1;i<=n;i++) {
			int A=65;
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				
				System.out.print((char)A);
				A=A+1;
			}
			
			System.out.println();
		}
		
	}

}
