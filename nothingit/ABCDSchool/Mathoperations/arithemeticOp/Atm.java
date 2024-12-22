package com.nothingit.ABCDSchool.Mathoperations.arithemeticOp;
import java.util.Scanner;
class  BalanceInsufficientException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	BalanceInsufficientException(){
		System.out.println("BalanceInsufficientException, Check Balance");
	}
}
class AmountInvaildException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	AmountInvaildException(){
		System.out.println("AmountInvaildException, enter Amount greater than Zero");
	}
} 
public class Atm {
	static double Balance; 
	static void withdraw(int amount){
		if(amount>Balance) {
			throw new BalanceInsufficientException();
		}
		else {
			Balance-=amount;
		}
	}
	static void deposit(int amount) {
		if(amount<=0) {
			throw new AmountInvaildException();
		}else {
			Balance+=amount;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean exit=false;
		while(!exit) {
			System.out.println("1 widthdraw");
			System.out.println("2 Deposit");
			System.out.println("3 exit");
			int op=sc.nextInt();
			switch(op) {
			case 1:
				System.out.println("Enter withdraw amount");
				int Amount=sc.nextInt();
				withdraw(Amount);
				break;
			case 2:
				System.out.println("Enter deposit Amount");
				int Amount2=sc.nextInt();
				deposit(Amount2);
				break;
			case 3:
				exit=true;
				break;
			}
		}
		sc.close();
	}
 
}
