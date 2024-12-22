
//16. Write a Java program to calculate profit and loss on a transaction.
//selling price of product:100
//original Cost:200

package com.ConditionalStaments;
import java.util.Scanner;
public class ques16 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a Selling Price :");
		double Selling_Price=sc.nextDouble();
		System.out.print("Enter a Cost Price :");
		double Cost_Price=sc.nextDouble();
		
		if(Selling_Price>Cost_Price) {
			System.out.println("Profit of Rupuees : "+(Selling_Price-Cost_Price));
		}else {
			System.out.println("Loss of Rupuees : "+(Selling_Price-Cost_Price));
		}
		
		sc.close();
	}

}
