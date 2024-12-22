package com.Loops;

public class forloop39 {
	static int fact(int a) {
		int result=1;
		for(int i=1;i<=a;i++) {
			result*=i;
		}
		return result; 
	}
	public static void main(String[] args) {
		int a=145;
		int b=a;
		int sum=0;
		for(int t=0;a>0;) {
			t=a%10;
			sum=sum+fact(t);
			a/=10;
		}
		System.out.println(b);
		System.out.println(sum);
		if(sum==b) {
			System.out.println("Strong Number");
		}else {
			System.out.println("Not a Strong Number");
		}
	}

}
