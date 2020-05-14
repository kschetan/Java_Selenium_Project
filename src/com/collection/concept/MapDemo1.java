package com.collection.concept;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {

	public static void main(String[] args) {
		HashMap <String , Integer> hm= new HashMap <String , Integer>();
		hm.put("Chetan", 100);
		hm.put("chanchal", 200);
		hm.put("dimpal", 300);
		hm.put("chotu", 400);
		hm.put("raman", 500);
		
		System.out.println(hm);
		
		Set st=hm.keySet();
		System.out.println(st);
		
		Collection c=hm.values();
		System.out.println(c);
		
		Set es=hm.entrySet();
		
		Iterator itr=es.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry me=(Map.Entry)itr.next();
			//System.out.println(me);
			
			System.out.println(me.getKey());
		}
		

	}

}
