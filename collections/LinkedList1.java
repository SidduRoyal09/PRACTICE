package com.collections;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(20);
		l.addFirst(34);
		l.add(59);
		l.addLast(46); 
		l.remove();
		l.remove(3);
		l.remove((Object)59);
		System.out.println(l);
	}

}
