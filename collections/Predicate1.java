package com.collections;

import java.util.function.Predicate;
import java.util.*;

public class Predicate1 {

	public static void main(String[] args) {
		Predicate<Integer> p=(i)->i%2==0;
		System.out.println(p.test(22));
		
		Predicate<Integer> p1=(i)->i>10;
		System.out.println(p1.test(11));
		

		Predicate<String> p2=(i)->i.length()>3;
		System.out.println(p2.test("siddu"));
		
		List l=new ArrayList();
		l.add(10);
		Predicate<Collection> p3=(i)->i.isEmpty();
		System.out.println(p3.test(l));
		
		System.out.println();

//interface functional  <T>
		
		Predicate<Integer> p4=(i)->i!=10;
		Predicate<Integer> p5=(i)->i==10;
		Predicate<Integer> r=p4.or(p5);
		System.out.println(r.test(10));
		
		
		
		Predicate<Integer> p6=(i)->i%2==0;
		Predicate<Integer> p7=(i)->i>10;
		Predicate<Integer> r1=p6.and(p7);
		System.out.println(r1.test(12));

//interface function <t,R>
		
		
		
	}

}
