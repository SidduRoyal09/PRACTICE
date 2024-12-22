package com.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

class Myc implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
//		TreeSet ts=new TreeSet(new Myc());
		ts.add(10);
		ts.add(5);
		ts.add(200);
		ts.add(50);
		System.out.println(ts); 
	}

}
