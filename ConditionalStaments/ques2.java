
//2. Write a Java program to check whether a given number is even or odd.
//Test Data : 15
//Expected Output :
//15 is an odd integer


package com.ConditionalStaments;
import java.util.Scanner;
public class ques2 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a interger value : ");
		int a=sc.nextInt();
		if(a%2==0)
			System.out.println(a+" is an even integer");
		else
			System.out.println(a+" is an odd integer");
		
		sc.close();

	}

}
