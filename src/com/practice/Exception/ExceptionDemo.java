package com.practice.Exception;


public class ExceptionDemo {
	
	public static void main(String args[]) {
		
		int n=0;
		
		try {
			int x = 10/n;
			
		}catch(ArithmeticException  e) {
			
			System.out.println("Division by 0 gives arithmetic Exception");
			
		}
		
		System.out.println("program does not crash beacuse of try catch block");
		
	}

}
