package com.Loops;

public class forloop43 {
	static int count(int a) {
		int count=0;
		while(a>0) {
			a=a/10;
			count++;
		}
		return count;
	}
	static int power(int a,int b) {
		int power=1;
		for(int i=1;i<=b;i++) {
			power*=a;
		}
		return power;
	}
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=10000;i++) {
			sum=0;
			int A=i;
			int B=i;
			int count=count(i);
			for(;B>0;) {
				int t=B%10;
				sum+=power(t,count); 
				B=B/10; 
			}
			if(sum==A) {
				System.out.print(A+" ");
			}
		}
	}

}
