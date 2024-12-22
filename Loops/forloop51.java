package com.Loops;

public class forloop51 {

	public static void main(String[] args) {
		int a=33;
		int b=77;
		for(int i=2;i<=a;i++) {
			if(a%i==0 && b%i==0) {
				System.out.println(i);
				return;
			}
		}
	}

}
