package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



class Compar implements Comparator{
	public int compare(Object o1,Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		return i2-i1; 
	}
}

public class Comparator1 {
	
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(50);
		al.add(40);
		al.add(30);
		Collections.sort(al,new Compar());
		System.out.println(al);
	}

}
