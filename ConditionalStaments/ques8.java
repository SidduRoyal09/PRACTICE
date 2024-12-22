
//8. Write a Java program to accept a coordinate point in an XY coordinate system and determine in which
//quadrant the coordinate point lies.
//Test Data : 7 9
//Expected Output :
//The coordinate point (7,9) lies in the First quadrant.
//if(x>0 && y>0)
//S.O.P("lies in the First quadrant.")
package com.ConditionalStaments;
import java.util.Scanner;
public class ques8 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the x Coordinate value : ");
		int X=sc.nextInt();
		System.out.print("Enter the y Coordinate value : ");
		int Y=sc.nextInt();
		if(X>0 && Y>0)
			System.out.println("The Coordinate point ("+X+","+Y+") lies in the First quadrant");
		else if(X<0 && Y>0)
			System.out.println("The Coordinate point ("+X+","+Y+") lies in the Second quadrant");
		else if(X<0 && Y<0)
			System.out.println("The Coordinate point ("+X+","+Y+") lies in the Third quadrant");
		else if(X>0 && Y<0)
			System.out.println("The Coordinate point ("+X+","+Y+") lies in the Fourth quadrant");
		else if(X==0 && Y==0)
			System.out.println("The Coordinate point ("+X+","+Y+") lies in the Zero quadrant");
		sc.close();
			
	}

}
