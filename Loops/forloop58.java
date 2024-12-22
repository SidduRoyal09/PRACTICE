package com.Loops;

public class forloop58 {

	public static void main(String[] args) {
		int a=1019;
		for(int t=0;a>0;) {
			t=a%10;
			if(t==0) {
				System.out.println("Duck Number");
				break;
			}
			a=a/10;
		}
		if(a==0) {
			System.out.println("Not a Duck Number");
		}
	}

}
