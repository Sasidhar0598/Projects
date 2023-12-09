package com.practice.loops;

public class ForLoopDemo {
	public static void main(String args[]) {
		int sum = 0;
		String a[] = {"sasi","vamsi","murali"};
		
		for (int i = 1;i<=10;i++) {
			sum+=i;
			System.out.println(i);
		}
		System.out.println("----------");
		
		System.out.println("Sum is: "+ sum);
		
		System.out.println("----------");
		
		
	
	
	
	for (int j=0;j<a.length;j++) {
		System.out.println(a[j]);
	}
		
	}

}
