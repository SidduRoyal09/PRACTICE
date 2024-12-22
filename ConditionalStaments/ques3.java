
//3. Write a Java program to check whether a given number is positive or negative.
//Test Data : 15
//Expected Output :
//15 is a positive number

package com.ConditionalStaments;
import java.util.Scanner;
public class ques3 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a Number : "); 
		int a = sc.nextInt();
		if(a>0)
			System.out.println(a+" is positive Number");
		else
			System.out.println(a+" is negative Number");
		
		
		sc.close();
	}

}
