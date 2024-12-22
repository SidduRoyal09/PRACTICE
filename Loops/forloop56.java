package com.Loops;

public class forloop56 {

	public static void main(String[] args) {
		int a=123;
		int sum=0;
		int prod=1;
		for(int i=0;a>0;) {
			i=a%10;
			sum+=i;
			prod*=i;
			a=a/10;
		}
		if(sum==prod) {
			System.out.println("Spy Number");
		}else {
			System.out.println("Not a Spy Number");
		}
	}

}
