package com.collection.concept;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetDemo3 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add("chetan");
		al.add("sandeep");
		al.add("amitesh");
		
		TreeSet ts =new TreeSet(al);
		System.out.println(ts);

	}

}
