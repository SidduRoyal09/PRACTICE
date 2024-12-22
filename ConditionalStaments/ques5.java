
//5. Write a Java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.
//Test Data : 21
//Expected Output :
//Congratulation! You are eligible for casting your vote.

package com.ConditionalStaments;
import java.util.Scanner;
public class ques5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the age : ");
		int age=sc.nextInt();
		if(age>18)
			System.out.println("Congratulations! You are eligible for casting vote");
		else
			System.out.println("You are still young to cast a vote");
		
		sc.close();

	}

}
