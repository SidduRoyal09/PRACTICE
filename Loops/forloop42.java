package com.Loops;

public class forloop42 {

	public static void main(String[] args) {
		int sum=0;
		int n=6;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(sum==n) {
			System.out.println("prefect Number.");
		}else {
			System.out.println("Not a perfect Number.");
		}
	}

}
