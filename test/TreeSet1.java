package com.test;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

class Employee40{
	String name;
	double salary;
	public Employee40(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee name=" + name +"\n "+", salary=" + salary + "\n";
	}
}
class xyz  implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Employee40 e1=(Employee40)o1;
		Employee40 e2=(Employee40)o2;
		return Double.compare(e2.salary,e1.salary);
	}
	
	
}

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet<Employee40> t1=new TreeSet<Employee40>(new xyz());
		t1.add(new Employee40("siddu",34567.0));
		t1.add(new Employee40("sai",34765.0));
		t1.add(new Employee40("vyshu",33245.0));
		t1.add(new Employee40("vs",45678.0));
		System.out.println(t1);
	}

}
