package com.Loops;
import java.util.Scanner;
public class forloop19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int pos_count=0;
		int neg_count=0;
		int zero_count=0;
		int a=1;
		while(a>0) {
			int val=sc.nextInt();
			if(val>0) {
				pos_count++;
			}else if(val<0) {
				neg_count++;
			}else if(val==0) {
				zero_count++;
			}
			System.out.println("Enter 0 to stop and 1 to continue");
			a=sc.nextInt();
			
		}
		sc.close();
		System.out.println("positive Number count : "+pos_count);
		System.out.println("positive Number count : "+neg_count);
		System.out.println("positive Number count : "+zero_count);
	}

}
