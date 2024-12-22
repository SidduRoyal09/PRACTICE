
//4. Write a Java program to find whether a given year is a leap year or not.
//Test Data : 2016
//Expected Output :
//2016 is a leap year.
//1.year must be divisible by 400.
//2.year must be divisible by 4 but not 100.

package com.ConditionalStaments;
import java.util.Scanner;
public class ques4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a year : ");
		int year=sc.nextInt();
		if(year%400==0)						
			System.out.println(year+" is a leap year");
		else if(year%4==0 && year%100!=0)
			System.out.println(year+" is a leap year");
		else
			System.out.println(year+" is not a leap year");
		
//		if(year%400==0 || (year%4==0 && year%100!=0))
//			System.out.println(year+" is a leap year");
//		else
//			System.out.println(year+" is not a leap year");
		sc.close();
	}

}
