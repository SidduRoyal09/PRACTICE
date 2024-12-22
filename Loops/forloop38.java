package com.Loops;
import java.util.Scanner;
public class forloop38 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int a=0;
		int b=1;
		int c=a+b;
		if(n==0) {
			System.out.println(a);
			return;
		}else if(n==1) {
			System.out.println(b);
			return;
		}
		System.out.print(a+" "+b+" ");
		for(;c<=n;) {
			
			System.out.print(c+" ");
			a=b;
			b=c;
			c=a+b;
		}

	}

}
