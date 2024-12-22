package com.Practice;

public class Test {
	int a;
	Test(int a){
		this.a=a;
	}
	public static void main(String[] args) {
		
		Test1 obj=new Test1(10);
		obj.display();
	}

}
class Test1 extends Test{
	Test1(int a){
		super(a); 
	}
	void display() {
		System.out.println(this.a);
	}
}
