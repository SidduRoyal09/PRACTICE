package com.Loops;

public class forloop60 {

	public static void main(String[] args) {
		int a=25;
		int square=a*a;
//		int count=0;
//		int count1=0;
		for(int t=0;a>0;) {
			t=a%10;
			int t1=square%10;
			a/=10;
			square/=10;
//			count1++;
//			if(t==t1) {
//				count++;
//			}else {
//				System.out.println("Not a Automorphic ");
//				break;
//			}
			if(t!=t1) {
				System.out.println("not a Automorphic Number");
				return;
			}
			
		}
//		if(count1==count) {
//			System.out.println("Automorphic Number");
//		}
		System.out.println("Automorphic Number");
	}

}
