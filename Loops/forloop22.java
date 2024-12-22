package com.Loops;
	

public class forloop22 {
	static int power(int a,int b) {
		int result=1;
		for(int i=1;i<=b;i++) {
			result=result*a;
		}
		return result;
	}
	public static void main(String args[]) {
		int binary=1011;
		int decimal=0;
		for(int i=0;binary>0;i++) {
			int temp=binary%10;
			decimal=decimal+temp*power(2,i);
			binary/=10;
		}
		System.out.println("Decimal is : "+decimal);
	}
}

