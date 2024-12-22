package com.collections;


import java.util.*;

class Employee{
	String name;
	double salary;
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee name=" + name+"\n"+ ", salary=" + salary + "\n";
	}
	
}
public class Lamdatask {
	
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new Employee("siddu",34532.0));
		al.add(new Employee("royal",37654.0));
		al.add(new Employee("vyshu",34552.0));
		al.add(new Employee("liki",31582.0));
		Collections.sort(al,(o1,o2)->{
			Employee e1=(Employee)o1;
			Employee e2=(Employee)o2;
	
			return Double.compare(e2.salary,e1.salary);
			
		}); 
		System.out.println(al);
	}
}
