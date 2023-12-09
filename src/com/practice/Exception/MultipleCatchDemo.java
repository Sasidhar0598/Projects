package com.practice.Exception;


class ExceptionDemo1{
	
}

public class MultipleCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {1,2,3,4,5};
		
		try {
			int a= 10/0;
			System.out.println(array[6]);
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception caught");
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("ArrayIndexOutOfBounds  Exception caught");

		}catch(Exception exc) {
			System.out.println("Arithmetic Exception caught");

		}
		
	}
		

	}


