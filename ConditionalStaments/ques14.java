
//14. Write a Java program to check whether a character is an alphabet, digit or special character.
//Test Data :
//@
//Expected Output :
//This is a special character.
//65-90-->alph
//97-122-->alph
//if((ch>=65 && ch<=90)||(ch>=97 && ch<=122))
// System.out.println("alphabet");
//else if(ch>=48 && ch<=57)
// System.out.println("Digit")
//else
// System.out.println("special Character")

package com.ConditionalStaments;
import java.util.Scanner;
public class ques14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a character : ");
		char character=sc.next().charAt(0);
		if((character>='A' && character<='Z')||(character>='a' && character<='z')){
			System.out.println("Alphabet");
		}else if(character>='0' && character<='9'){
			System.out.println("Digit");
		}else {
			System.out.println("Special Character");
		}
		sc.close();
	}

}
