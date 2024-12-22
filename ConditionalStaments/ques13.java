
//13. Write a Java program to check whether a triangle can be formed with the given values for the angles.
//Test Data :
//40 55 65
//Expected Output :
//The triangle is not valid.

package com.ConditionalStaments;
import java.util.Scanner;
public class ques13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st angle of a Triangle : ");
		double a=sc.nextDouble();
		System.out.print("Enter 2nd angle of a Triangle : ");
		double b=sc.nextDouble();
		System.out.print("Enter 3rd angle of a Triangle : ");
		double c=sc.nextDouble();
		if((a+b+c)==180) {
			System.out.println("Triangle can be Formed");
		}else {
			System.out.println("Triangle is not valid ");
		}
		
		sc.close();
	}

}
