package com.Loops;
import java.util.Scanner;
public class forloop20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int greatest=0;
		int smallest1=0;
		int smallest=0;
		int a=1;
		while(a>0) {
			int val=sc.nextInt();
			if(val>greatest) {
				greatest=val;
			}else {
				smallest1=val; 
			}
			if(smallest<smallest1) {
				smallest=smallest1;
			}else if(val<smallest){
				smallest=val;
			}
			System.out.println("Enter 0 to stop and 1 to continue");
			a=sc.nextInt();
			
		}
		sc.close();
		System.out.println("positive Number count : "+greatest);
		System.out.println("positive Number count : "+smallest1); 
	}

}
