
//10. Write a Java program which computes the area of various geometrical shapes using a menu-driven approach.
//Test Data :
//1
//5
//Expected Output :
//The area is : 78.500000

package com.ConditionalStaments;
import java.util.Scanner;
public class ques10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1 for Circle \n2 for Triangle \n3 for Rectangle ");
		System.out.print("select any Shape : ");
		int shape=sc.nextInt();
		if(shape==1) {
			double area;
			System.out.print("Enter radius of the circle : ");
			double r=sc.nextInt();
			area=3.14*r*r;
			System.out.println("The area of circle is : "+area);
		}else if(shape==2) {
			double area;
			System.out.print("Enter height value : ");
			double A=sc.nextInt();
			System.out.print("Enter Base value : ");
			double B=sc.nextInt();
			area=(A*B/2);
			System.out.println("The area of Triangle is : "+area);
		}else if(shape==3) {
			double area;
			System.out.print("Enter Length value : ");
			double A=sc.nextInt();
			System.out.print("Enter Breadth value : ");
			double B=sc.nextInt();
			area=A*B;
			System.out.println("The area of Rectangle is : "+area);
		}else {
			System.out.println("Invalid input");
		}
		
		sc.close();
	}

}
