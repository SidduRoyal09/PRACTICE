
//12. Write a Java program to read temperature in centigrade and display a suitable message according to the temperature state below:
//Temp < 0 then Freezing weather
//Temp 0-10 then Very Cold weather
//Temp 10-20 then Cold weather
//Temp 20-30 then Normal in Temp
//Temp 30-40 then Its Hot
//Temp >=40 then Its Very Hot
//Test Data :
//42
//Expected Output :
//Its very hot.

package com.ConditionalStaments;
import java.util.Scanner;
public class ques12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Temperature in Centigrade : ");
		double Temp=sc.nextDouble();
		
		if(Temp<0) {
			System.out.println("Freezing weather");
		}else if(0<=Temp && Temp<10) {
			System.out.println("Very Cold weather");
		}else if(10<=Temp && Temp<20) {
			System.out.println("Cold weather");
		}else if(20<=Temp && Temp<30) {
			System.out.println("Normal in Temperature");
		}else if(30<=Temp && Temp<40) {
			System.out.println("Its Hot");
		}else if(Temp>=40) {
			System.out.println("Its Very Hot");
		}
		
		sc.close();
	}

}
