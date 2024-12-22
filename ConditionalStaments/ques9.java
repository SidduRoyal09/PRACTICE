
//9. Write a program in Java which is a Menu-Driven Program to perform a simple calculation.
//Test Data :
//10
//2
//3
//Expected Output :
//The Multiplication of 10 and 2 is: 20


package com.ConditionalStaments;
import java.util.Scanner;
public class ques9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a value : ");
		int a=sc.nextInt();
		System.out.print("Enter b value : ");
		int b=sc.nextInt();
		System.out.println(" press 1 for Addition \n press 2 for Subtraction \n press 3 for Multiplication \n press 4 for Division \n press 5 for Modulus");
		System.out.print("Select operation : ");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("The Addition of "+a+" and "+b+" is : "+(a+b));
		}else if(choice==2) {
			System.out.println("The Subtraction of "+a+" and "+b+" is : "+(a-b));
		}else if(choice==3) {
			System.out.println("The Mulitiplication of "+a+" and "+b+" is : "+(a*b));
		}else if(choice==4) {
			System.out.println("The Division of "+a+" and "+b+" is : "+(a/b));
		}else if(choice==5){
			System.out.println("The Modulus of "+a+" and "+b+" is : "+(a%b));
		}else {
			System.out.println("Invalid choice");
		}
		
		sc.close();
	}

}
