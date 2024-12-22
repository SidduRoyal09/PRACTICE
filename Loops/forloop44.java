package com.Loops;

public class forloop44 {
	static int count(int a) {
		int count=0;
		while(a!=0) {
			count++;
			a/=10;
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
		
		int a=153;
		int sum=0;
		int b=a;
		int count=count(a);
		for(int i=1;i<=count;i++) {
			int t=a%10;
			sum+=power(t,count);
			a=a/10;
		}
		if(sum==b) {
			System.out.println("Amstrong Number");
		}else {
			System.out.println("Not a Amstrong Number");
		} 
	}

}
