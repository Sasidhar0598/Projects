package com.practice.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	
	public static void main(String args[]) {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(101, "Sasidhar");
		map.put(102, "Vamsidhar");
		map.put(103, null);
		map.put(104, null);
		
		
		for (Map.Entry<Integer,String> mapElement : map.entrySet()) {
            int key = mapElement.getKey();
 
            
            String value = mapElement.getValue();
 
            
            System.out.println(key + " : " + value);
        }
		
	}

}
