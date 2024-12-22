package com.Loops;

public class forloop17 {

	public static void main(String[] args) {
		int a=57;
		int count=0;
		if(a<0) {
			System.out.println("Not a Prime Number");
		}
		for(int i=1;i<=a/2;i++) {
			if(a%i==0) {
				count++;
				if(count>1) {
					System.out.println("Not a Prime Number");
					break;
				}
			}
		}
		if(count==1) {
			System.out.println("Prime Number");
		}
	}

}
	
