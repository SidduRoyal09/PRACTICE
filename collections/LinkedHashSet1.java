


package com.collections;

import java.util.LinkedHashSet;


class Student1{
	String name;

	public Student1(String name) {
		
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]\n";
	}
	

}

public class LinkedHashSet1 {

	public static void main(String[] args) {
		LinkedHashSet hs=new LinkedHashSet();
//		hs.add(10);
//		hs.add(20);
//		hs.add(true);
		hs.add(new Student1("sai"));
		hs.add(new Student1("vyshu"));
		hs.add(new Student1("rai"));
		System.out.println(hs);
	}

}
