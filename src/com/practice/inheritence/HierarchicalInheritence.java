package com.practice.inheritence;

class Mother{
	
	public void show() {
		System.out.println("Mother");
	}
}

class Child1 extends Mother{
	
	public void disp() {
		System.out.println("Child1");
	}
}

class Child2 extends Mother{
	
	public void display() {
		System.out.println("Child2");
	}
}



public class HierarchicalInheritence {
	
	public static void main(String args[]) {
		Child2 child2 = new Child2();
		child2.display();
		child2.show();
		
		System.out.println("------------");
		
		Child1 child1 = new Child1();
		child1.disp();
		child1.show();
	}

}
