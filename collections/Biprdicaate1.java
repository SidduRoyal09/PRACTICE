package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
import java.util.function.*;



class Employee2{
	
	String name;
	String id;
	public Employee2(String name, String id) {
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]\n";
	}
	
}

public class Biprdicaate1 {

	public static void main(String[] args) {
//		Consumer c=(i)->System.out.println("Hello "+i);
//		c.accept(10);
//		Supplier s=()->10;
//		System.out.println(s.get());
//		BiFunction bf=(i,j)->(i+j)%2==0;
//		System.out.println(bf.apply(10,20)); 
		
		ArrayList<Employee2> al=new ArrayList<Employee2>();
		al.add(new Employee2("sai","40"));
		al.add(new Employee2(null,"11"));
		al.add(new Employee2(null,"24"));
		al.add(new Employee2("royal","46"));
//		System.out.println(al);
		
//		Iterator itr=al.iterator();
//		while(itr.hasNext()) {
//			Employee2 e=(Employee2)itr.next(); 
//			if(Optional.ofNullable(e.name).isPresent()) {
//				System.out.println("yes");
//			}else {
//				System.out.println("no");
//			}
//		}
		
//		for(Employee2 e:al) {
//			if(Optional.ofNullable(e.name).isPresent()){
//				System.out.println(e.id+" "+e.name);
//			}else {
//				System.out.println("empolyee not found");
//			}
//		}
		
		for(Employee2 e:al) {
			Optional.ofNullable(e.name).ifPresent((i)->System.out.println("Employee is valid Address: "+i));
		}
		
	}

}
