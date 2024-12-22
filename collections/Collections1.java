package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Collections1 {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(10);
		l.add(10);
		l.add(30);
		l.add(10);
		l.add(35);
		Collections.sort(l);
		System.out.println(l);
		int index=(Integer)Collections.binarySearch(l,30);
		System.out.println(index);
		int min=(Integer)Collections.min(l);
		System.out.println(min);
		int max=(Integer)Collections.max(l);
		System.out.println(max);
		Collections.reverse(l); 
		System.out.println(l);
		int count=Collections.frequency(l,10);
		System.out.println(count);
	}
}
