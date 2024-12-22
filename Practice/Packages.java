package com.Practice;
import com.nothingit.ABCDSchool.Mathoperations.arithemeticOp.*;

public class Packages {

	public static void main(String[] args) {
		ArithmeticOp obj=new ArithmeticOp();
		int sum=obj.add(10,20);
		int subtract=obj.sub(20, 10); 
		int multiply=obj.multiply(20, 10); 
		int divide=obj.divide(20, 10);
		System.out.println(sum+"\n"+subtract+"\n"+multiply+"\n"+divide+"\n");
	}

}
