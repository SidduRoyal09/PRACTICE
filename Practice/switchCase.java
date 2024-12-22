package com.Practice;

public class switchCase {

	public static void main(String[] args) {
		int a=2;
		switch(a){
			case 1:
				System.out.println("The case1 block is executed");
				break;
			case 2:
				System.out.println("The case2 block is executed");
				break;
			case 3:
				System.out.println("The case3 block is executed");
				break;
			default:
				System.out.println("The default is executed");
		}
	}

}

//if we don't use break then every statement is executed after case is matched.this is called Fall Through.