package com.tnsif.CollectionsFramework;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		//Create a hash map
		HashMap<String,Double> hm = new HashMap<String,Double>();
		
		// Put elements to the map
		hm.put("John Doe", new Double(3434.34));
		hm.put("Tom Smith", new Double(123.22));
		hm.put("Jane Baker", new Double(1378.00));
		hm.put("Tod Hall", new Double(99.22));
		hm.put("Ralph Smith", new Double(-19.08));
		
		//Get a set of entries
		Set<Map.Entry<String,Double>> set = hm.entrySet();//Creates set of map entries
		
		
		//Display the set
		for(Map.Entry<String,Double> me : set) {
			System.out.print(me.getKey() +": ");
			System.out.println(me.getValue());
		}
		
		
		//Update value for key "John Doe"
		Double balance = hm.get("John Doe");
		hm.put("John Doe",balance+1000);
		

	}

}
