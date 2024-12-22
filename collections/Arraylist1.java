package com.collections;

import java.util.ArrayList;
import java.util.List;

public class Arraylist1 {

	public static void main(String[] args) {
//		List l=new ArrayList();
		List<Comparable> l=new ArrayList<Comparable>();
		l.add(10);
		l.add(20.21);
		l.add(true);
		l.add("sai");
		System.out.println(l);
//		ArrayList l2=new ArrayList();
		ArrayList<Comparable> l2=new ArrayList<Comparable>();
		l2.addAll(l);
		l2.remove(0);
		System.out.println(l2);
		l.retainAll(l2);
		System.out.println(l);
		l2.add(50); 
		l2.retainAll(l); 
		System.out.println(l2);
		l2.clear();
		l2.retainAll(l);
		System.out.println(l2);
		Object arr[]=l.toArray();
		System.out.println(arr[0]);
		l.remove((Object)10);
	}

}
