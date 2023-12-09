package com.practice.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new HashSet<String>();
		
		set.add("Apple");
		set.add("Mango");
		set.add("Orange");
		set.add("Pineapple");
		
		for( String i:set) {
			
			System.out.println(i);
			
		}

	}

}
