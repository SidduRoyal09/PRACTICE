
//6. Write a Java program to read the value of an integer m and display the value of n is 1 when m is larger
//than 0, 0 when m is 0 and -1 when m is less than 0.
//Test Data : -5
//Expected Output :
//The value of n = -1

package com.ConditionalStaments;
import java.util.Scanner;
public class ques6 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Value for m : ");
		int m=sc.nextInt();
		if(m>0) {
			int n=1;
			System.out.println("The value of n is : "+n);
		}else if(m==0){
			int n=0;
			System.out.println("The value of n is : "+n);
		}else if(m<0) {
			int n=-1;
			System.out.println("The value of n is : "+n);
		}
		
		sc.close();
	}

}
