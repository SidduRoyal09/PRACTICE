
//1. Write a Java program to accept two integers and check whether they are equal or not.
//Test Data : 15 15
//Expected Output :
//Number1 and Number2 are equal

package com.ConditionalStaments;
import java.util.Scanner;
public class ques1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number 1 : ");
		int a=sc.nextInt();
		System.out.print("Enter Number 2 : ");
		int b=sc.nextInt();
		if(a==b)
			System.out.println("Number 1 and Number 2 are equal");
		else
			System.out.println("Number 1 and Number 2 are not equal");
		sc.close();
	}

}
