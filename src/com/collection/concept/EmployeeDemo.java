package com.collection.concept;

import java.util.ArrayList;
import java.util.TreeSet;

public class EmployeeDemo {
	
		public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> al1 = new ArrayList<String>();
			al.add("chetan");
			al.add("chetan");
			al.add("chetan");
			
			
			al1.add("kumar");
			al1.add("kmar");
			al1.add("kuar");
			TreeSet<String> ts=new TreeSet<String>();
			for (int i = 0; i < al.size(); i++) {
				
				ts.add(al.get(i)+" "+al1.get(i));
			}
			System.out.println(ts);
			
		
	}
		

}
