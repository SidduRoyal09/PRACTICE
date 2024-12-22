package com.Loops;

public class forloop59 {

	public static void main(String[] args) {
		int a=9;
		int b=a*a;
		int sum=0;
		for(int i=0;b>0;) {
			i=b%10;
			sum+=i;
			b=b/10;
		}
		if(sum==a) {
			System.out.println("Neon Number");
		}else {
			System.out.println("Not a Neon Number");
		}
	}

}
