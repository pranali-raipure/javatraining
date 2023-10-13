package com.vodafone.ui;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// Map<String, Integer> map = new HashMap<>();
		// Map<String, Integer> map = new LinkedHashMap<>();
		Map<String, Integer> map = new TreeMap<>();
		map.put("oracle", 5000);
		map.put("c++", 3500);
		map.put("java", 6000);
		map.put("python", 5000);
		map.put("oracle", 5500);
		
		System.out.println(map);
		System.out.println("-----------------------------------------");
		
		for(String key : map.keySet()) {
			System.out.println(key + "\t" + map.get(key));
		}
		
		System.out.println("-----------------------------------------");
		for(Integer fee : map.values()) {
			System.out.println(fee);
		}
		
	}

}
