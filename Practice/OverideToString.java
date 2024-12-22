package com.Practice;
class Employee{
	long  empId;
	String name;
	double salary;
	Employee(long empId,String name,double salary){
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	public String toString() {
		return "Employee Id: "+this.empId+"\nEmployee name: "+this.name+"\nEmployee Salary: "+salary+"\n";
	}
}
public class OverideToString {

	public static void main(String[] args) {
		Employee e1=new Employee(40,"siddu",80000);
		Employee e2=new Employee(46,"vsid",90000);
		Employee e3=new Employee(15,"vamsi",100000);
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
	}

}
