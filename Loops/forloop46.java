package com.Loops;

public class forloop46 {

	public static void main(String[] args) {
		int a=546;
		if(a<0) {
			System.out.println("Not a Prime Number");
		}
		int count=0;
		for(int i=2;i<=a/2;i++) {
			if(a%i==0) {
				count++;
				System.out.println("Not a Prime Number");
				return;
			}
		}
		if(count==0) {
			System.out.println("Prime Number");
		}
	}

}
