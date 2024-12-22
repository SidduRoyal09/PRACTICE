package com.Loops;

public class forloop40 {
	static int fact(int a) {
		int result=1;
		for(int i=1;i<=a;i++) {
			result*=i;
		}
		return result; 
	}
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100000;i++) {
			sum=0;
			int Num=i;
			for(int t=0;Num>0;) {
				t=Num%10;
				sum=sum+fact(t);
				Num/=10;
			}
//			System.out.println(sum);
			if(sum==i) {
				System.out.print(i+" ");
			}
		}
		
	}

}
