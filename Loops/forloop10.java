package com.Loops;

public class forloop10 {

	public static void main(String[] args) {
		int n=40;
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
