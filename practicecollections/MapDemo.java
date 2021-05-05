package com.capgemini.practicecollections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		
		map.put("new", "customer");
		map.put("old", null);
		
		Set<String> keys = map.keySet();
		
		keys.forEach((s) -> {
			System.out.println(s);
			System.out.println(map.get(s));
			});
		System.out.println(map.entrySet());
		
		System.out.println("Printing values based on keys");
		
		Set s2 = map.entrySet();
		
		Iterator<Map.Entry<String, String>> it = s2.iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> en = it.next();
			System.out.println(en.getKey());
			
		}
		
	}
	
}
