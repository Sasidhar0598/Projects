package com.practice.typecasting;

public class ExplicitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
double accBalance = 100.4545d;   // 8 byte => decimal point value
		
		long bigBalance = (long) accBalance; // 8 byte => whole number value // Narrowing => double -> long
		
		int intBalance = (int) accBalance; // Narrowing => double -> int
		
		short shortBalance = (short) bigBalance;  // Narrowing => long -> short
		
		byte byteBalance = (byte) accBalance; // Narrowing => double -> byte
		
		
		
		
		System.out.println("Acount Balance (double) : "+ accBalance);
		System.out.println("Acount Balance (long) : "+ bigBalance);
		System.out.println("Acount Balance (int) : "+ intBalance);
		System.out.println("Acount Balance (short) : "+ shortBalance);
		System.out.println("Acount Balance (byte) : "+ byteBalance);

	}

}
