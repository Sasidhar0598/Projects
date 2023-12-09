package com.practice.accessmodifier;

public class DefaultAccessModifierExample {
	
	public static void main(String args[]) {
		
		Resort resort = new Resort();
		resort.show();
		resort.display();
		
		
	
		
		
	}
}
	 class Resort {
		String location = "Hyderabad";
		int area = 25 ;
		int poolCapacity = 100;
		
		void show() {
			System.out.println("Resort Location :" + location + "Area : "+area + "Pool capacit in litres :" + poolCapacity);
		}
		
		public void display() {
			System.out.println("Resort Location :" + location + "Area in acre : " + area + "Pool capacit in litres :" + poolCapacity);
		}
		
	}


