package com.collections;

import java.util.ArrayList;
import java.util.Collections;

class Movie2 implements Comparable{
	String title;
	double price,rating;
	public Movie2(String title, double price, double rating) {
		this.title = title;
		this.price = price;
		this.rating = rating;
	}
	public String toString() {
		return "title: "+title+" "+"price: "+price+" "+"rating: "+rating+"\n";
	}
	public int compareTo(Object o) {
		Movie2 m=(Movie2)o;
//		return (int)(this.rating-m.rating);  
//		return (int)(m.rating-this.rating);  
//		return (Double.compare(this.rating, m.rating));
		if(this.rating!=m.rating) { 
			return Double.compare(m.rating, this.rating);  
		}
		return Double.compare(this.price,m.price);  
	}
	   
}


public class ComparableMovie {

	public static void main(String[] args) { 
//		ArrayList l=new ArrayList();
		ArrayList<Movie2> l=new ArrayList<Movie2>();
		l.add(new Movie2("ka",200.0,2.3));
		l.add(new Movie2("kalki",250.0,4.3));
		l.add(new Movie2("devara",200.0,4.0));
		l.add(new Movie2("lucky baskar",250.0,4.0));
		Collections.sort(l);
		System.out.println(l); 
	}

}
