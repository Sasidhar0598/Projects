package com.practice.accessmodifier;

public class PrivateAccessModifierExample {
	
	public static void main(String args[]) {
		
		Bank bank= new Bank();
	  //bank.accNo;    // The  fiels bank.accNo not visible
		
		//bank.show();  //this is also private method we cant access outside the class
		
		bank.show1();
		
		
		
	}

}

class Bank {
	private long accNo;
	private String name;
	public String branch;
	
	private void show() {
		System.out.println("Private Access variables cannot access Outside class");
	}
	
	public void show1() {
		System.out.println("Private Access variables cannot access Outside class");
	}
}
