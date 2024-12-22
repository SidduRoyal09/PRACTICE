
//17. Write a program in Java to calculate and print the electricity bill of a given customer. 
//The customer ID, name, and unit consumed by the user should be captured from the keyboard to display the 
//total amount to be paid to the customer.
//
//The charge are as follow :
//
//Unit	                         Charge/unit
//upto 199	                 @1.20 
//200 and above but less than 400	 @1.50
//400 and above but less than 600	 @1.80
//600 and above	                 @2.00
//Test Data :
//1001
//James
//800
//Expected Output :
//Customer IDNO :1001
//Customer Name :James
//unit Consumed :800
//Total AMount:

package com.ConditionalStaments;
import java.util.Scanner;
public class ques17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Customer ID : ");
		int Id=sc.nextInt();
		System.out.print("Enter Customer Name : ");
		String Name=sc.next();
		System.out.print("Enter Units Consumed : ");
		double Units=sc.nextDouble();
		double Total_Amount=0;
		if(Units<=199) {
			Total_Amount=Units*1.20;
		}else if(Units>=200 && Units<400){
			Total_Amount=Units*1.50;
		}else if(Units>=400 && Units<600){
			Total_Amount=Units*1.80;
		}else if(Units>=600){
			Total_Amount=Units*2.00;
		}
		System.out.println("Customer ID NO : "+Id);
		System.out.println("Customer NAME  : "+Name);
		System.out.println("Customer Total_Amount : "+Total_Amount);
		
		sc.close();
	}

}
