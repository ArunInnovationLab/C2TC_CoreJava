package com.tnsif.CollectionsFramework;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
    //LinkedHashMap maintains a linked list of the entries in the map, in the order in which they were inserted.
	LinkedHashMap<String, Double> lhm = new LinkedHashMap<String,Double>();
	
	// Put elements to the map.
	lhm.put("John Doe", new Double(3434.34));
	lhm.put("Tom Smith", new Double(123.22));
	lhm.put("Jane Baker", new Double(1378.00));
	lhm.put("Tod Hall", new Double(99.22));
	lhm.put("Ralph Smith", new Double(-19.08));
	
	Set<Map.Entry<String, Double>> set = lhm.entrySet();
	
	for(Map.Entry<String, Double> me:set) {
		System.out.print(me.getKey()+" : ");
		System.out.println(me.getValue());
	}
		
	}

}


