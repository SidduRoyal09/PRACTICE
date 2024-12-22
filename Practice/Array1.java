package com.Practice;
class Array2{
	int a;
}
public class Array1 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		System.out.println(a[3]);
		System.out.println(a);
		Array2 obj=new Array2();
		Array2 A[];
		A=new Array2[10]; 
		A[0]=new Array2();
		A[3]=obj;
		Array2 B[]= {new Array2(),new Array2(),obj};
		
		System.out.println(A[0]);
		System.out.println(A[3]);
		System.out.println(B[1]);
	
	}
}
