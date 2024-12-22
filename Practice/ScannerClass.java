package com.Practice;
import java.util.Scanner; 
public class ScannerClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter int value : ");
//		int a =sc.nextInt();
//		System.out.print("Enter int value : ");
//		int b = sc.nextInt();
//		System.out.println("Entered values are : "+a+","+b);
//		System.out.print("Enter Name : ");
//		String c=sc.next();
//		System.out.println("Name is : "+c);
		float d=sc.nextFloat();
		double e=sc.nextDouble();
//		System.out.println(sc.next()); 
		
//		System.out.println(sc.nextLine());
		sc.nextLine();
		
		String f = sc.nextLine();
		
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		sc.close();
	}
	
}
