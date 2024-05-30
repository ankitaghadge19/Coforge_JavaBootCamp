package com.java.collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Collection;

public class HashMap_KeySet_EntrySet_Values {

	public static void main(String[] args) {
		Map<String, Integer> prodPrice = new HashMap<>();
		
		prodPrice.put("TV", 1000);
		prodPrice.put("Phone", 700);
		prodPrice.put("Charger", 500);
		
		System.out.println(prodPrice);
		
		Set<String> keys = prodPrice.keySet();
		Collection<Integer> values = prodPrice.values();
		Set<Entry<String, Integer>> entries = prodPrice.entrySet();
		
		System.out.println("keys of Map : " + keys);
        System.out.println("values from Map :" + values);
        System.out.println("entries from Map :" + entries);	

	}

}
