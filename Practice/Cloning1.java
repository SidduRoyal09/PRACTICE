// create student object and clone the student object

package com.Practice;



class Institute implements Cloneable{
	String addrs;
	String name;
	Institute(String addrs,String name){
		this.name=name;
		this.addrs=addrs;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	} 
}


class Student implements Cloneable{
	String stname;
	Institute institute1;
	Student(String stname,Institute institute1){
		this.institute1=institute1;
		this.stname=stname;
	}
	public Object clone() throws CloneNotSupportedException{
		Student s=(Student)super.clone();
		s.institute1=(Institute)institute1.clone();
		return s;
	}  
}

public class Cloning1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Institute institute1=new Institute("pan","sai");
		Student s1=new Student("siddu",institute1);
		Student s2=(Student)s1.clone();
		System.out.println(s1.stname);
		System.out.println(s2.stname);
		System.out.println(s2.institute1.addrs);
	} 
}





