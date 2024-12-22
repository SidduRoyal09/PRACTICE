package com.Loops;

public class forloop8 {

	public static void main(String[] args) {
		int i;
		for(i=1;i<=100;i++) {
			if(i%2==0) {
				continue;
			}else {
				System.out.println(i);
			}
		}
	}
}
