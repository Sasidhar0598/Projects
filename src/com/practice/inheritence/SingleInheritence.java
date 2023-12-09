package com.practice.inheritence;

public class SingleInheritence {
	
	public static void main(String args[]) {
		
		Child child = new Child();
		
		child.disp();
		
		System.out.println("--------------------");
		
	System.out.println("By Creating child class object we can access parent class method ...");
	
	System.out.println("--------------------");

		child.disp1();
		
	}

}

class Parent{
	
	String name = "Madhuri";
	String lastName = "Polumati";
	int age = 46;
	
	Parent(){
		
		
	}
	
	public void disp1() {
		System.out.println("Name ;" + name + "  " + "LastName : " + lastName + "  " + "age :" + age);
	}
	
}

class Child extends Parent{
	String name = "sasidhar";
	String lastName = "Polumati";
	int age = 23;
	
	public void disp() {
		System.out.println("Name ;" + name + "  " + "LastName : " + lastName + "  " + "age :" + age);
	}
	
}
