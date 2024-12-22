package com.Practice;
import java.util.Scanner;
public class Practice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.print("Enter no of students : ");
		int a=sc.nextInt();
		System.out.print("Enter no of slices : ");
		int b=sc.nextInt();
		int pizza=0;
//		float a1=a,b1=b;
//		if((a1*b1/4)>(a*b/4)) {
//			pizza=(a*b/4)+1;
//		}
//		else {
//			pizza=a*b/4;
//		}
//		pizza=((a1*b1/4)>(a*b/4))?(a*b/4)+1:(a*b/4);
		pizza=((float)(a*b)/(float)(4)>(a*b/4)?(a*b/4)+1:(a*b/4));
		System.out.println("Number of Pizzas need to order : "+pizza);
		
		sc.close();
		
	}

}
