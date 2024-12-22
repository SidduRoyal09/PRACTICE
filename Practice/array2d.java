package com.Practice;
import java.util.Scanner;
public class array2d {
	static void insert(int a[],Scanner sc) {
//		for(int i=0;i<a.length;i++) {
//			a[i]=sc.nextInt();
//		}
		int i=0;
		while(i<a.length) {
			a[i]=i;
			i++;
		}
	}
	public static void main(String[] args) {
//		int a[][]= {{1,2,3},{4,5,6}};
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int ar[]=new int[a];
		insert(ar,sc);
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		sc.close();
	}

} 
