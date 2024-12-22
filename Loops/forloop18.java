
//HCF of two numbers

package com.Loops;

public class forloop18 {

	public static void main(String[] args) {
		int a=18;
		int b=27;
		int cf=0;
		for(int i=1;i<=a;i++){
			if(a%i==0 && b%i==0) {
				if(i>cf) {
					cf=i;
				}
			}	
		}
		System.out.println("The most common Factor is : "+cf);
		
	}

}
