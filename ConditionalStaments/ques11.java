
//11. Write a Java program to calculate the root of a quadratic equation.
//Test Data : 1 5 7
//Expected Output :
//Root are imaginary;

package com.ConditionalStaments;
import java.util.Scanner;
public class ques11 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter A value : ");
		int a=sc.nextInt();
		System.out.print("Enter B value : ");
		int b=sc.nextInt();
		System.out.print("Enter C value : ");
		int c=sc.nextInt();
		int result=b*b-4*a*c;
		if(result>0) {
			System.out.println("Roots are Real");
		}else if(result==0) {
			System.out.println("Roots are Real and equal");
		}else if(result<0) {
			System.out.println("Roots are Imaginary");
		}
		sc.close();
	}

}
