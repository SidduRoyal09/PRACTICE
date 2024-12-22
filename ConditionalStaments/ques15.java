
//15. Write a Java program to check whether an alphabet is a vowel or a consonant.
//Test Data :
//k
//Expected Output :
//The alphabet is a consonant.

package com.ConditionalStaments;
import java.util.Scanner;
public class ques15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Alpahabet Character : ");
		char alpahabet=sc.next().charAt(0);
		
		if((alpahabet=='a'|| alpahabet=='e' || alpahabet=='i' || alpahabet=='o' || alpahabet=='u')||(alpahabet=='A'|| alpahabet=='E' || alpahabet=='I' || alpahabet=='O' || alpahabet=='U')) {
			System.out.println("The alphabet is a Vowel.");
		}else {
			System.out.println("The alphabet is a consonant.");
		}
		
		sc.close();
	}

}
