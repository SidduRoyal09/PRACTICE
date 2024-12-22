package com.collections;

import java.util.HashSet;


class Student{
	String name;

	public Student(String name) {
		
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]\n";
	}
	
	public boolean equals(Object o) {
		Student s=(Student)o;
		return s.name.equals(this.name);
	}
	public int hashCode() { 
		return name.hashCode();
	}
}

public class Hashset1 {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
//		hs.add(10);
//		hs.add(20);
//		hs.add(true);
		hs.add(new Student("sai"));
		hs.add(new Student("sai"));
		hs.add(new Student("rai"));
		System.out.println(hs);
	}

}
