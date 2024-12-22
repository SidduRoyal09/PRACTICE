
//7. Write a Java program to find the largest of three numbers.
//Test Data : 12 25 52
//Expected Output :
//1st Number = 12,        2nd Number = 25,        3rd Number = 52
//The 3rd Number is the greatest among three

package com.ConditionalStaments;
import java.util.Scanner;
public class ques7 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter 1st Number : ");
		int a=sc.nextInt();
		System.out.print("Enter 2nd Number : ");
		int b=sc.nextInt();
		System.out.print("Enter 3rd Number : ");
		int c=sc.nextInt();
		if(a>b && a>c)
			System.out.println("The First Number is Greater among Three "+a);
		else if(b>a && b>c)
			System.out.println("The Second Number is Greater among Three "+b);
		else
			System.out.println("The Third Number is Greater among Three "+c); 
		
		sc.close();
	}

}
